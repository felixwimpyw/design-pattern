package com.gdn.cc.designpattern.creational.abstractfactory;

public class WindowsOS implements OperatingSystem {

  @Override
  public String getOsDetail() {
    return "Windows 10";
  }

}
