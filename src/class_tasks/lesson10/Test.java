package class_tasks.lesson10;

public class Test {
    public static void println(String s) {
        try {
            throw new MyException(s);
        } catch (MyException e) {
            if (e.getErrorCode() == 1) {
                System.out.println("Simple throw");
            } else if (e.getErrorCode() == 2) {
                System.out.println("Complex throw");
            }

        } finally {
            System.out.println('\n');
        }
    }

    public static void nullPointer() {
        Car car = null;
        try {
            car.beep();
        } catch (NullPointerException e) {
            System.out.println("NullPointerException thrown successfully");
        }
    }

    public static void f() {
        try {
            g();
        } catch (MyException e) {
            int g = 1 / 0;
            e.getStackTrace();
        }
    }

    public static void g() throws MyException {
//        throw new MyException();
        throw wrapException(new MyException());
//        unwrapException( wrapException(new MyException()));
    }

    public static RuntimeException wrapException(Exception e) {
        return new RuntimeException(e);
    }

    public static Throwable unwrapException(Exception e) {
        return e.getCause();
    }

    public static void generateArrayOutOfBoundsException(int i) {
        int[] array = new int[10];
        try {
            int check = array[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
    }

    public static void test1() throws MyException {
        throw new MyException();
    }

    public static void test2() throws MyException2 {
        throw new MyException2();
    }

    public static void test3() throws MyException3 {
        throw new MyException3();
    }

    public static void threesome() {
        try {
            test1();
            test2();
            test3();
        } catch (MyException | MyException2 | MyException3 e) {
            e.printStackTrace();
        }
    }
}
