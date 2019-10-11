package com.gdn.cc.designpattern.creational.objectpool.after;

import com.gdn.cc.designpattern.creational.factory.method.Car;
import com.gdn.cc.designpattern.creational.objectpool.CarPool;

public class CarPoolHelper {

  private final CarPool carPool = new CarPool();
  
  public CarPoolHelper() {}

  public void runWithResource(Command command){
    Car car = null;
    try {
      car = carPool.borrowFromPool();
      command.doSomething(car);
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      if (car != null) {
        carPool.returnToPool(car);
      }
    }
  }
  
}
