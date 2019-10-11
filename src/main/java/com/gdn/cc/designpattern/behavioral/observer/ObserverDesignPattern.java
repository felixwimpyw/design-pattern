package com.gdn.cc.designpattern.behavioral.observer;

import org.junit.Test;

public class ObserverDesignPattern {

  private final PriceChangeSubject subject = new PriceChangeSubject();

  public ObserverDesignPattern() {
    subject.addObserver(new HistoryObserver());
    subject.addObserver(new WishlistObserver());
  }

  private void priceChange(Product product) {
    subject.postPriceChange(product);
  }

  @Test
  public void run() {
    priceChange(new Product("sample-product", 1000));
  }

}
