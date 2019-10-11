package com.gdn.cc.designpattern.creational.objectpool.after;

public class NewPrintCar {

  CarPoolHelper helper;

  public NewPrintCar() {
    helper.runWithResource(new CommandToPrintCar());
  }
}
