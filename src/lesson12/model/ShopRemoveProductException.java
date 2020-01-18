package lesson12.model;

public class ShopRemoveProductException extends Exception {
    public ShopRemoveProductException() {
    }

    public ShopRemoveProductException(String message) {
        super(message);
    }

    public ShopRemoveProductException(String message, Throwable cause) {
        super(message, cause);
    }

    public ShopRemoveProductException(Throwable cause) {
        super(cause);
    }

    public ShopRemoveProductException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
