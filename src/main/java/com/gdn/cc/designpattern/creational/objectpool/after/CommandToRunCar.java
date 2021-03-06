package com.gdn.cc.designpattern.creational.objectpool.after;

import com.gdn.cc.designpattern.creational.factory.method.Car;

public class CommandToRunCar implements Command {

  @Override
  public void doSomething(Car car) {
    car.runCar();    
  }

}
