package com.gdn.cc.designpattern.creational.abstractfactory;

public class WindowsScreenFactory implements AbstractScreenFactory {

  @Override
  public Logo getLogo() {
    return new WindowsLogo();
  }

  @Override
  public OperatingSystem getOs() {
    return new WindowsOS();
  }


}
