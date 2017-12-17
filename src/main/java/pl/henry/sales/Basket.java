package pl.henry.sales;

import java.util.HashMap;

public class Basket {
  private HashMap<String, Integer> productQuantities;
  private Stock stock;
  
  public Basket(Stock stock) {
    this.stock = stock;
    productQuantities = new HashMap<>();
  }

  public int put(String productName, int quantity) throws ProductNotAvailableException {
    int newQuantity = getQuantity(productName) + quantity;
    if(newQuantity < 0)
      newQuantity = 0;      
    if(newQuantity > stock.getQuantity(productName))
      throw new ProductNotAvailableException();
    productQuantities.put(productName, newQuantity);
    return newQuantity;
  }

  public void clear() {
    productQuantities = new HashMap<>();
  }

  public HashMap<String, Integer> getProductQuantities() {
    return (HashMap<String, Integer>) productQuantities.clone();
  }

  public int getQuantity(String productName) {
    Integer quantity = productQuantities.get(productName);
    return quantity == null ? 0 : quantity;
  }
}
