package com.gdn.cc.designpattern.creational.abstractfactory;

public class AbstractFactoryDesignPattern {

  public AbstractFactoryDesignPattern() {
    ScreenConstructor constructor = new ScreenConstructor();
    constructor.getScreen(new WindowsScreenFactory());
  }
}
