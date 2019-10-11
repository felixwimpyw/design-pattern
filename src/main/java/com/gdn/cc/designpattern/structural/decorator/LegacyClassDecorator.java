package com.gdn.cc.designpattern.structural.decorator;

public class LegacyClassDecorator extends LegacyClass2 {

  @Override
  public void doSomethingLegacy() {
    System.out.println("before doing something");
    super.doSomethingLegacy();
    System.out.println("after doing something");
  }

}
