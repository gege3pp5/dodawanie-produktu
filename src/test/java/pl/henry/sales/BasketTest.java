package pl.henry.sales;

import org.junit.Test;
import org.junit.Assert;

public class BasketTest {

  @Test
  public void addsProducts() {
    Stock stock = new Stock();
    String odkurzacz = "odkurzacz";
    String telefon = "telefon";
    String woda = "woda";
    stock.put(odkurzacz, 100);
    stock.put(telefon, 100);
    stock.put(woda, 100);
    
    Basket basket = new Basket(stock);
    basket.put(odkurzacz, 13);
    basket.put(telefon, 7);
    basket.put(telefon, 93);
    basket.put(woda, 0);
    basket.put(woda, 4);

    Assert.assertEquals(basket.getQuantity(odkurzacz), 13);
    Assert.assertEquals(basket.getQuantity(telefon), 100);
    Assert.assertEquals(basket.getQuantity(woda), 4);
  }

  @Test
  public void throwsExceptionWhenNotEnoughProductOnStock() {
    Stock stock = new Stock();
    String odkurzacz = "odkurzacz";
    stock.put(odkurzacz, 10);
    
    Basket basket = new Basket(stock);
    try {
      basket.put(odkurzacz, 11);
      Assert.fail();
    } catch (ProductNotAvailableException e) { }
  }
}
