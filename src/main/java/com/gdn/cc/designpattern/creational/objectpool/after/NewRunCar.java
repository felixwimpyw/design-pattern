package com.gdn.cc.designpattern.creational.objectpool.after;

import com.gdn.cc.designpattern.creational.factory.method.Car;

public class NewRunCar {

  private final CarPoolHelper helper = null;

  public NewRunCar() {
    helper.runWithResource(new CommandToRunCar());
  }
}
