package com.gdn.cc.designpattern.creational.abstractfactory;

public class ScreenConstructor {

  public void getScreen(AbstractScreenFactory screenFactory) {
    System.out.println(screenFactory.getLogo());
    System.out.println(screenFactory.getOs());
  }

}
