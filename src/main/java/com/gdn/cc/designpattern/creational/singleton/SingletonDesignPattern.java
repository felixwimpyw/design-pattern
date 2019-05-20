package com.gdn.cc.designpattern.creational.singleton;

public class SingletonDesignPattern {

  public void before() {
    Car car = new Car();
    car.print();
    // imagine this as different method
    Car car2 = new Car();
    car2.print();
  }

  public void after() {
    Car car = Car.getInstance();
    car.print();
    // imagine this as different method / class
    Car car2 = Car.getInstance();
    car2.print();
  }

}
