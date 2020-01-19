package lesson12.model;

public class ProductAlreadyExist extends Exception {
    public ProductAlreadyExist() {
    }

    public ProductAlreadyExist(String message) {
        super(message);
    }

    public ProductAlreadyExist(String message, Throwable cause) {
        super(message, cause);
    }

    public ProductAlreadyExist(Throwable cause) {
        super(cause);
    }

    public ProductAlreadyExist(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
