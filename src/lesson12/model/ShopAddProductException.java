package lesson12.model;

public class ShopAddProductException extends Exception {
    public ShopAddProductException() {
    }

    public ShopAddProductException(String message) {
        super(message);
    }

    public ShopAddProductException(String message, Throwable cause) {
        super(message, cause);
    }

    public ShopAddProductException(Throwable cause) {
        super(cause);
    }

    public ShopAddProductException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
