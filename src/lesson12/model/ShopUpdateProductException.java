package lesson12.model;

public class ShopUpdateProductException extends Exception {
    public ShopUpdateProductException() {
    }

    public ShopUpdateProductException(String message) {
        super(message);
    }

    public ShopUpdateProductException(String message, Throwable cause) {
        super(message, cause);
    }

    public ShopUpdateProductException(Throwable cause) {
        super(cause);
    }

    public ShopUpdateProductException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
