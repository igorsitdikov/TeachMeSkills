package Lesson9.task1;

public class Main {
    public static void main(String[] args) {
        String test = "?how are you?";
        System.out.println(cut(test,'w', 'y') );
    }

    private static String cut(String str, char a, char b) {
        int from = str.indexOf(a);
        int to = str.lastIndexOf(b) + 1;
        if (from != -1 && to != -1) {
            return str.substring(from, to);
        }
        return str;
    }
}
