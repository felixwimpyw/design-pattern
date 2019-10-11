package com.gdn.cc.designpattern.creational.objectpool;

import com.gdn.cc.designpattern.creational.factory.method.Car;

public class PrintCar {

  private final CarPoolHelper helper = new CarPoolHelper();

  public PrintCar() {
    helper.runWithResource(car -> car.printCar());
    // LAMBDA EXPRESSION
  }
}
