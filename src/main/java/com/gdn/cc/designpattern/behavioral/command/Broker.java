package com.gdn.cc.designpattern.behavioral.command;

import java.util.ArrayList;
import java.util.List;

public class Broker {
  private List<Order> orderList = new ArrayList<>();

  public void placeOrders() {
    for (Order order : orderList) {
      order.execute();
    }
    orderList.clear();
  }

  public void takeOrder(Order order) {
    orderList.add(order);
  }
}
