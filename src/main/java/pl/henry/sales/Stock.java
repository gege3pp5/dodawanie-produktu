package pl.henry.sales;

import java.util.HashMap;

public class Stock {
  private final HashMap<String, Integer> productQuantities;

  public Stock() {
    this.productQuantities = new HashMap<>();
  }

  public int put(Product product, int quantity) {
    int newQuantity = getQuantity(product.getName()) + quantity; 
    productQuantities.put(product.getName(), newQuantity);
    return newQuantity;
  }

  public int getQuantity(String productName) {
    Integer quantity = productQuantities.get(productName);
    return quantity == null ? 0 : quantity;
  }
}
