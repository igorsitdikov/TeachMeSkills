package class_tasks.lesson14;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        StreamApiExercises.printOddNumbers(list);

        List<String> str = new ArrayList<>();
        str.add("qwertdfy");
        str.add("343434");
        str.add("foo");
        str.add("bafsdfsfsdfsr");
        System.out.println("lengths ");
        List<Integer> lst = StreamApiExercises.lengths(str);
        lst.forEach(el -> System.out.println(el));
//        str = new ArrayList<>();
        System.out.println("longest = "+ StreamApiExercises.findLongestString(str));
        StreamApiExercises.printStringsStartingFrom(str, 2);
        System.out.println("first "+ StreamApiExercises.getFirst(str));
        str = new ArrayList<>();
        System.out.println(StreamApiExercises.getFirst(str));

        List<Integer> list1 = StreamApiExercises.incrementEach(list);
        list1.forEach(el -> System.out.println(el));

        System.out.println("duplicate");

        List<Integer> t = StreamApiExercises.duplicateEach(list);
        t.forEach(el -> System.out.println(el));
    }
}
