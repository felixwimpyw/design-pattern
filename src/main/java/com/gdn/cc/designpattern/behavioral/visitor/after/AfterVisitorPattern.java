package com.gdn.cc.designpattern.behavioral.visitor.after;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AfterVisitorPattern {

  private static List<Merchandise> getListOfMerchandise() {
    Car car = new Car();
    car.setPrice(200);
    car.setLeasingPrice(50);
    Laptop laptop = new Laptop();
    laptop.setPrice(100);
    return Stream.of(car, laptop).collect(Collectors.toList());
  }

  public AfterVisitorPattern() {
    countMerchandise(getListOfMerchandise());
  }

  public void countMerchandise(List<Merchandise> cart) {
    MerchandiseVisitor visitor = new MerchandiseVisitor();
    for (Merchandise merchandise : cart) {
      merchandise.visit(visitor);
    }
    System.out.println(visitor.getTotalPrice());
  }

}
