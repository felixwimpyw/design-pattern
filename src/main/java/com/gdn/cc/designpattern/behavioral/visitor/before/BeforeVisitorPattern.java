package com.gdn.cc.designpattern.behavioral.visitor.before;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.Test;

public class BeforeVisitorPattern {

  private static List<Merchandise> getListOfMerchandise() {
    Car car = new Car();
    car.setPrice(200);
    car.setLeasingPrice(50);
    Laptop laptop = new Laptop();
    laptop.setPrice(100);
    return Stream.of(car, laptop).collect(Collectors.toList());
  }

  public BeforeVisitorPattern() {
    countMerchandise(getListOfMerchandise());
  }

  public void countMerchandise(List<Merchandise> cart) {
    // let's count totalPrice with VAT for all items but for food it is free, for electronic is 10%,
    // and for car has additional leasing price and "pajak barang mewah" 5%

    double totalPrice = 0;
    for (Merchandise merchandise : cart) {
      if (merchandise instanceof Car) {
        Car car = (Car) merchandise;
        double carPrice = car.getPrice();
        double carLeasingPrice = car.getLeasingPrice();
        totalPrice += (carPrice + carLeasingPrice) * 1.15D;
      } else if (merchandise instanceof Laptop) {
        Laptop laptop = (Laptop) merchandise;
        double laptopPrice = laptop.getPrice();
        totalPrice += laptopPrice * 1.1D;
      } else if (merchandise instanceof Apple) {
        Apple apple = (Apple) merchandise;
        double applePrice = apple.getPrice();
        totalPrice += applePrice;
      }
    }
    System.out.println("Total Price is : " + totalPrice);
  }

  @Test
  public void run() {

  }

}
