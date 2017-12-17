package pl.henry.sales;

import org.junit.Assert;
import org.junit.Test;
public class StockTest {
  
  @Test
  public void addsProducts() {
    Stock stock = new Stock();
    String odkurzacz = "odkurzacz";
    String telefon = "telefon";
    String woda = "woda";
    stock.put(odkurzacz, 13);
    stock.put(telefon, 7);
    stock.put(telefon, 50);
    stock.put(woda, 0);
    stock.put(woda, 4);

    Assert.assertEquals(stock.getQuantity(odkurzacz), 13);
    Assert.assertEquals(stock.getQuantity(telefon), 57);
    Assert.assertEquals(stock.getQuantity(woda), 4);
  }
}
