import java.util.*;

class Kangaroo {
    public int kangarooNumber;

    public Kangaroo(int kangarooNumber) {
        this.kangarooNumber = kangarooNumber;
    }

    public void jump() {
        System.out.println("Kangaroo number " + kangarooNumber + " performs a hop");
    }
}

class Main {
    public static void main(String[] args) {
        ArrayList<Kangaroo> listOfKangaroos = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            listOfKangaroos.add(new Kangaroo(i));
        }

        System.out.println("Viewing the list using the get() method:");
        for (int i = 0; i < listOfKangaroos.size(); i++) {
            listOfKangaroos.get(i).jump();
        }

        System.out.println("Viewing the list using the iterator:");
        Iterator<Kangaroo> iterator = listOfKangaroos.iterator();
        while (iterator.hasNext()) {
            iterator.next().jump();
        }

        HashMap<String, Kangaroo> mapOfKangaroos = new HashMap<>();
        mapOfKangaroos.put("Jacek", new Kangaroo(1));
        mapOfKangaroos.put("Marta", new Kangaroo(2));
        mapOfKangaroos.put("Andrzej", new Kangaroo(3));
        mapOfKangaroos.put("Samir", new Kangaroo(4));
        mapOfKangaroos.put("Adrian", new Kangaroo(5));
        mapOfKangaroos.put("Lisek", new Kangaroo(6));
        mapOfKangaroos.put("Arman", new Kangaroo(7));

        System.out.println("Viewing the contents of the HashMap:");
        for (String key : mapOfKangaroos.keySet()) {
            System.out.println("Kangaroo name: " + key);
            mapOfKangaroos.get(key).jump();
        }

        Set<String> keys = mapOfKangaroos.keySet();
        for (String key : keys) {
            System.out.println("Name: " + key + ", number: " + mapOfKangaroos.get(key).kangarooNumber);
        }

        LinkedHashMap<String, Kangaroo> sortedMapOfKangaroos = new LinkedHashMap<>();
        List<Map.Entry<String, Kangaroo>> list = new LinkedList<>(mapOfKangaroos.entrySet());

        Collections.sort(list, new Comparator<Map.Entry<String, Kangaroo>>() {
            @Override
            public int compare(Map.Entry<String, Kangaroo> a, Map.Entry<String, Kangaroo> b) {
                return (a.getKey().compareTo(b.getKey()));
            }
        });

        for (Map.Entry<String, Kangaroo> entry : list) {
            sortedMapOfKangaroos.put(entry.getKey(), entry.getValue());
        }
        System.out.println("Sorted map");
        Set<Map.Entry<String, Kangaroo>> entries = sortedMapOfKangaroos.entrySet();
        for (Map.Entry<String, Kangaroo> entry : entries) {
            System.out.println("Name: " + entry.getKey() + ", number: " + entry.getValue().kangarooNumber);
        }
    }
}