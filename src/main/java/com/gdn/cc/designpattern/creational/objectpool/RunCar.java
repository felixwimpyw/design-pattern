package com.gdn.cc.designpattern.creational.objectpool;

import com.gdn.cc.designpattern.creational.factory.method.Car;

public class RunCar {

  private final CarPoolHelper carPoolHelper = new CarPoolHelper();

  public RunCar() {
    //anonymous class
    carPoolHelper.runWithResource(car -> {
        car.runCar();
    });
  }
}
