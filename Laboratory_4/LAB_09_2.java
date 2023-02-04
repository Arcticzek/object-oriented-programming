import java.util.ArrayList;
import java.util.List;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class Main {
    public static void main(String[] args) {
        Person[] peopleArray = new Person[]{
                new Person("John", 35),
                new Person("Jane", 25),
                new Person("Jim", 45),
                new Person("Joan", 30),
                new Person("Jake", 40)
        };

        List<Person> peopleList = new ArrayList<>();
        for (Person person : peopleArray) {
            peopleList.add(person);
        }

        List<Person> subList = peopleList.subList(1, 3);
        System.out.println("Sublist: " + subList);

        peopleList.removeAll(subList);
        System.out.println("List after removing sublist: " + peopleList);
    }
}