package com.gdn.cc.designpattern.behavioral.observer;

public class WishlistObserver implements Observer {

  public void subscribe(Observable observable) {
    observable.addObserver(this);
  }

  @Override
  public void update(Observable o, Object arg) {
    // notify price change to customer
    Product product = (Product) arg;
    System.out.println("There is price change of product " + product.getProductName() + " to "
        + product.getPrice());
  }

}
