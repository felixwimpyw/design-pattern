package com.gdn.cc.designpattern.creational.factory.method;

/**
 * Factory Method pattern abstracting the process of object generation so type of the object
 * instantiated can be determined at run-time.
 * 
 * @author felix.w.wijaya
 */
public class FactoryMethodDesignPattern {

  public FactoryMethodDesignPattern() {

  }
  
  public void before(CarType carType) {
    if (carType == CarType.HONDA) {
      HondaCar hondaCar = new HondaCar();
      hondaCar.printCar();
    } else if (carType == CarType.MAZDA) {
      MazdaCar mazdaCar = new MazdaCar();
      mazdaCar.printCar();
    }
  }
  
  public void after(CarType carType) {
    Car car = CarFactory.getCar(carType);
    car.printCar();
  }

}
