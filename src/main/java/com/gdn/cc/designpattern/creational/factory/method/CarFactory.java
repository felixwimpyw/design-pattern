package com.gdn.cc.designpattern.creational.factory.method;

public class CarFactory {

  public static Car getCar(CarType carType) {
    switch (carType) {
      case HONDA:
        return new HondaCar();
      case MAZDA:
        return new MazdaCar();
      default:
        return null;
    }
  }

}

