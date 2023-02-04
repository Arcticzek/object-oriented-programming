import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class TreeException extends Exception {
    public TreeException(String message) {
        super(message);
    }
}

abstract class Tree {
    private int age;
    private String species;

    public Tree(int age, String species) {
        this.age = age;
        this.species = species;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSpecies() {
        return species;
    }

    abstract void dropLeafs() throws TreeException;

    @Override
    public abstract String toString();
}

class Coniferous extends Tree {
    public Coniferous(int age, String species) {
        super(age, species);
    }

    @Override
    void dropLeafs() throws TreeException {
        throw new TreeException("Coniferous tree cannot drop leaves");
    }

    @Override
    public String toString() {
        return "Coniferous; " + getSpecies() + "; " + getAge();
    }
}

class Deciduous extends Tree {
    private int height;

    public Deciduous(int age, String species, int height) {
        super(age, species);
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    void dropLeafs() {
        System.out.println("Dropping leaves");
    }

    @Override
    public String toString() {
        return "Deciduous; " + getSpecies() + "; " + getAge() + "; " + getHeight();
    }
}

class Forest {
    private List<Tree> trees;

    public Forest(List<Tree> trees) {
        this.trees = trees;
    }

    public void displayTrees() {
        for (Tree tree : trees) {
            System.out.println(tree.toString());
        }
    }

    public void loadTreesFromFile(String filePath) {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(";");
                String type = parts[0];
                String species = parts[1];
                int age = Integer.parseInt(parts[2]);
                if (type.equals("coniferous")) {
                    Coniferous coniferous = new Coniferous(age, species);
                    trees.add(coniferous);
                } else if (type.equals("deciduous")) {
                    int height = Integer.parseInt(parts[3]);
                    Deciduous deciduous = new Deciduous(age, species, height);
                    trees.add(deciduous);
                }
            }
        } catch (IOException e) {
            System.err.println("An error occurred while reading the file: " + e.getMessage());
        }
    }

    public void sortTreesByAge() {
        trees.sort((o1, o2) -> o1.getAge() - o2.getAge());
    }

    public void writeTreesToFile(String filePath) {
        try {
            FileWriter writer = new FileWriter(filePath);
            for (Tree tree : trees) {
                String type = tree.getSpecies();
                int age = tree.getAge();
                writer.write(String.format("%s;%d;\n", type, age));
            }
            writer.close();
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
}

public class Main {
    public static void main(String[] args) {
        List<Tree> forest = new ArrayList<>();
        forest.add(new Coniferous(10, "Pine"));
        forest.add(new Deciduous(5, "Maple", 15));
        forest.add(new Coniferous(7, "Spruce"));
        forest.add(new Deciduous( 20,"Oak",25));

        Forest f = new Forest(forest);
        f.displayTrees();
        f.sortTreesByAge();
        System.out.println("Sorted by age: ");
        f.displayTrees();

        f.writeTreesToFile("sorted_trees.txt");
    }
}