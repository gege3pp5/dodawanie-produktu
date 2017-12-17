package pl.henry.sales;

import org.junit.Test;
import org.junit.Assert;

public class BasketTest {
  @Test
  public void isInstantiable() {
    Assert.assertNotNull(new Basket());
  }
}
