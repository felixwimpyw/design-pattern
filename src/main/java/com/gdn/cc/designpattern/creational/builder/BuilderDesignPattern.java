package com.gdn.cc.designpattern.creational.builder;

public class BuilderDesignPattern {

  public BuilderDesignPattern() {

  }
  
  public void before() {
    Computer computer =
        new Computer("Seagate", "Intel", "Samsung", "Nvidia", "Logitech", "Sony", null);
    
    System.out.println(computer);
  }
  
  public void after() {
    Computer computer =
        new Computer.ComputerBuilder("Seagate", "Intel", "Samsung")
            .setGpu("Nvidia")
            .setWifiReceiver("Logitech")
            .setBluetoothReceiver("Sony")
            .build();

    System.out.println(computer);
  }

}
