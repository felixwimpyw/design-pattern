package com.gdn.cc.designpattern.creational.objectpool;

import java.util.ArrayList;
import java.util.List;

import com.gdn.cc.designpattern.creational.factory.method.Car;
import com.gdn.cc.designpattern.creational.factory.method.HondaCar;

public class CarPool {

  List<Car> pool = new ArrayList<>();

  public CarPool() {
    initData(100);
  }

  public Car borrowFromPool() {
    try {
      return pool.remove(0);
    } catch (Exception e) {
      // wait or just return null
      return null;
    }
  }

  public void initData(int poolSize) {
    for (int i = 0; i < poolSize; i++) {
      pool.add(new HondaCar());
    }
  }

  public void returnToPool(Car object) {
    // reset object
    pool.add(object);
  }

}
