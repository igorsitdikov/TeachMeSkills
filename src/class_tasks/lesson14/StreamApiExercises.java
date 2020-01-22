package class_tasks.lesson14;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApiExercises {
    public static boolean containsEmptyString(Collection<String> strings) {
        return strings.stream().anyMatch(String::isEmpty);
    }

    public static int countShortStrings(Set<String> strings, int maxLength) {
        return (int) strings.stream()
                .filter(s -> s.length() > maxLength)
                .count();
    }

    public static String findLongestString(Collection<String> strings) {
        return strings.stream()
                .max((o1, o2) -> o1.length() - o2.length())
                .orElseThrow(IllegalArgumentException::new);
    }

    public static String getFirst(List<String> strings) {
        return strings.stream()
                .findFirst().orElse("kek");
    }

    public static List<Integer> lengths(List<String> strings) {
        return strings.stream()
                .map(s -> s.length())
                .collect(Collectors.toList());
    }

    public static void printOddNumbers(Collection<Integer> numbers) {
        numbers.stream()
                .filter(el -> el % 2 != 0)
                .sorted((o1, o2) -> o2 - o1)
                .forEach(el -> System.out.println(el));
    }

    public static void printStringsStartingFrom(Collection<String> strings, int from) {
        strings.stream()
                .skip(from)
                .forEach(s -> System.out.println(s));
    }

    public static List<Integer> duplicateEach(List<Integer> numbers) {
        return numbers.stream()
                .flatMap(e -> Stream.of(e, e))
                .collect(Collectors.toList());
    }

    public static List<Integer> incrementEach(List<Integer> numbers) {
        return numbers.stream()
                .map(el -> ++el)
                .collect(Collectors.toList());
    }

}
