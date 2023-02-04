import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

class ReverseList {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);

        List<Integer> list2 = new ArrayList<>();

        ListIterator<Integer> iterator = list1.listIterator(list1.size());
        while (iterator.hasPrevious()) {
            list2.add(iterator.previous());
        }

        System.out.println("List 1: " + list1);
        System.out.println("List 2: " + list2);
    }
}