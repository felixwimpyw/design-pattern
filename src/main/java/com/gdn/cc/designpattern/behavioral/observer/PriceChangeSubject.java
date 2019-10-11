package com.gdn.cc.designpattern.behavioral.observer;

public class PriceChangeSubject extends Observable {
  public PriceChangeSubject() {}

  public void postPriceChange(Product product) {
    setChanged();
    notifyObservers(product);
  }

}
