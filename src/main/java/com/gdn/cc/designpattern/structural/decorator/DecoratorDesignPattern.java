package com.gdn.cc.designpattern.structural.decorator;

public class DecoratorDesignPattern {

  public DecoratorDesignPattern() {
    LegacyClass2 legacyClass = new LegacyClassDecorator();
    legacyClass.doSomethingLegacy();
  }

}
