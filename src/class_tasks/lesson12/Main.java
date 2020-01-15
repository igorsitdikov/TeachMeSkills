package class_tasks.lesson12;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        try {
            SuperArray<Integer> superArray = new SuperArray<>();
            superArray.add(1);
            superArray.add(1);
            superArray.add(1);
            superArray.add(1);
            superArray.add(1);
            superArray.add(1);
            superArray.add(1);
            superArray.add(1);
            superArray.add(1);
            superArray.add(1);
            System.out.println(superArray.getSum());

            superArray = new SuperArray<>(2);
            superArray.add(1);
            superArray.add(1);
//            superArray.add(1);
            System.out.println(superArray.getSum());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        CollectionsImpl collections = new CollectionsImpl();

        List<String> words = new ArrayList<>();
        words.add("rotor");
        words.add("kayak");
        words.add("check");
        words.add("kayak");
        words.add("level");
        words.add("top");

        Set<String> palindromsUnique = collections.getPalindroms(words);
        palindromsUnique.forEach(el -> System.out.println(el));

        List<Integer> list = collections.createArrayList(1, 2, 3, 4, 5);
        list.forEach(el-> System.out.println(el));

        ArrayList<Integer> lists = new ArrayList<>();
        lists.add(1);
        lists.add(2);
        lists.add(3);
        lists.add(4);
        list = collections.random(lists);

        list.forEach(item -> System.out.println(item));

        System.out.println(collections.findMostFrequentChar("test"));
        collections.sort(words).forEach(el -> System.out.println(el));
    }

    private static <T extends Number> SuperArray<T> create(T el) {
        return new SuperArray<T>();
    }
}
