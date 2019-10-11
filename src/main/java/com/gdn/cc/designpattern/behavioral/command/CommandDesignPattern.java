package com.gdn.cc.designpattern.behavioral.command;

public class CommandDesignPattern {
  public CommandDesignPattern() {
    Stock abcStock = new Stock();

    Order buyStockOrder = new BuyStock(abcStock);
    Order sellStockOrder = new SellStock(abcStock);

    Broker broker = new Broker();
    broker.takeOrder(buyStockOrder);
    broker.takeOrder(sellStockOrder);

    broker.placeOrders();
  }

}
