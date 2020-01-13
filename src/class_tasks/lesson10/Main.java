package class_tasks.lesson10;

public class Main {
    public static void main(String[] args) {
        String s = "null";
        Test.println(s);

        Test.nullPointer();

        Test.f();
//        RuntimeException e = new RuntimeException();
//        Test.wrapException(e);

        Test.generateArrayOutOfBoundsException(20);
        Test.threesome();

    }

}
