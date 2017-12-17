package pl.henry.sales;

public class ProductNotAvailableException extends RuntimeException {
  public ProductNotAvailableException(String message) {
    super(message);
  }

  public ProductNotAvailableException() {
    super("This product is not available in stock");
  }
}
