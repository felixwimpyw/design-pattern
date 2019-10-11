package com.gdn.cc.designpattern.creational.objectpool;

import com.gdn.cc.designpattern.creational.factory.method.Car;

public class CarPoolHelper {


  private final CarPool carPool = new CarPool();

  public void runWithResource(Command command) {

    Car car = null;
    try {
      car = carPool.borrowFromPool();
      command.execute(car);
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      if (car != null) {
        carPool.returnToPool(car);
      }
    }
  }

}
