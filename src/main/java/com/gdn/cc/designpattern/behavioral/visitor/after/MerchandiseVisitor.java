package com.gdn.cc.designpattern.behavioral.visitor.after;

public class MerchandiseVisitor {

  double totalPrice;

  public void countForTax(Apple apple) {
    double applePrice = apple.getPrice();
    totalPrice += applePrice;
  }

  public void countForTax(Car car) {
    double carPrice = car.getPrice();
    double carLeasingPrice = car.getLeasingPrice();
    totalPrice += (carPrice + carLeasingPrice) * 1.15D;
  }

  public void countForTax(Laptop laptop) {
    double laptopPrice = laptop.getPrice();
    totalPrice += laptopPrice * 1.1D;
  }

  public double getTotalPrice() {
    return totalPrice;
  }

}
