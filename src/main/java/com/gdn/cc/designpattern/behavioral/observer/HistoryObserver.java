package com.gdn.cc.designpattern.behavioral.observer;

public class HistoryObserver implements Observer {

  public void subscribe(Observable observable) {
    observable.addObserver(this);
  }

  @Override
  public void update(Observable o, Object arg) {
    // notify price change to customer
    Product product = (Product) arg;
    System.out.println("Saving price change history of product " + product.getProductName()
        + " on price " + product.getPrice());
  }

}
