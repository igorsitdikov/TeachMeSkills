package class_tasks.lesson10;

public class MyException extends Exception {

    private int errorCode;

    public MyException() {
        super();
    }

    public MyException(String message) {
        super(message);
        check();
    }

    public MyException(String message, Throwable cause) {
        super(message, cause);
    }

    public MyException(Throwable cause) {
        super(cause);
    }

    private void check() {
        if (getMessage().equals("null")) {
            errorCode = 2;
        } else {
            errorCode = 1;
        }
    }

    public int getErrorCode() {
        return errorCode;
    }
}
