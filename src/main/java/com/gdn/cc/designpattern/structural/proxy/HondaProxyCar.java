package com.gdn.cc.designpattern.structural.proxy;

import com.gdn.cc.designpattern.creational.factory.method.Car;
import com.gdn.cc.designpattern.creational.factory.method.HondaCar;

public class HondaProxyCar extends HondaCar {

  private HondaCar hondaCar;
  private String driver;

  public HondaProxyCar(String driver) {
    this.driver = driver;
  }

  public HondaCar getHondaCar() {
    if (hondaCar == null) {
      synchronized (HondaProxyCar.class) {
        hondaCar = new HondaCar();
      }
    }
    return hondaCar;
  }

  @Override
  public String printCar() {
    if (driver.contains("felix")) {
      return getHondaCar().printCar();
    } else {
      throw new UnsupportedOperationException();
    }
  }

  @Override
  public String runCar() {
    // TODO Auto-generated method stub
    return null;
  }

}
