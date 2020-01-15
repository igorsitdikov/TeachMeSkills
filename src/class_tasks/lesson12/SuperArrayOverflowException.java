package class_tasks.lesson12;

public class SuperArrayOverflowException extends ArrayIndexOutOfBoundsException {
    public SuperArrayOverflowException() {
    }

    public SuperArrayOverflowException(String s) {
        super(s);
    }

    public SuperArrayOverflowException(int index) {
        super(index);
    }
}
