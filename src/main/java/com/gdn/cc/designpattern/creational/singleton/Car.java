package com.gdn.cc.designpattern.creational.singleton;

/**
 * Singleton pattern ensures only one object of a particular class is ever created.
 *
 * @author felix.w.wijaya
 */
public class Car {
  private static Car INSTANCE = null;

  public synchronized static Car getInstance() {
    // this technique also known as lazy initialization
    if (INSTANCE == null) {
      INSTANCE = new Car();
    }
    return INSTANCE;
  }

  public String print() {
    return "print car";
  }
  
  public Car() {
    try {
      Thread.sleep(5000);
    } catch (InterruptedException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }

}
