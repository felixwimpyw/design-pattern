package com.gdn.cc.designpattern.creational.prototype;

public class PrototypeDesignPattern {

  private static final OperatingSystem WINDOWS_PROTOTYPE =
      new OperatingSystem("Windows 10", "specification", "windows", "100MB");
  private static final OperatingSystem MAC_PROTOTYPE =
      new OperatingSystem("Sierra 10.12", "specification", "apel", "99MB");
  
  public PrototypeDesignPattern() {
    OperatingSystem pcRoom1 = WINDOWS_PROTOTYPE.clone();
    pcRoom1.setComputerName("computerName1");
    OperatingSystem pcRoom2 = WINDOWS_PROTOTYPE.clone();
    pcRoom2.setComputerName("computerName2");
    OperatingSystem pcRoom3 = MAC_PROTOTYPE.clone();
    pcRoom3.setComputerName("computerName3");
  }

}
