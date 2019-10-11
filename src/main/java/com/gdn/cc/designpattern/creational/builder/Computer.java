package com.gdn.cc.designpattern.creational.builder;

public class Computer {

  public static class ComputerBuilder {
    private String hdd;
    private String cpu;
    private String ram;

    // optional
    private String gpu;
    private String wifiReceiver;
    private String bluetoothReceiver;
    private String dvdReader;

    public ComputerBuilder(String hdd, String cpu, String ram) {
      this.hdd = hdd;
      this.cpu = cpu;
      this.ram = ram;
    }

    public Computer build() {
      return new Computer(this);
    }

    public ComputerBuilder setGpu(String gpu) {
      this.gpu = gpu;
      return this;
    }

    public ComputerBuilder setWifiReceiver(String wifiReceiver) {
      this.wifiReceiver = wifiReceiver;
      return this;
    }

    public ComputerBuilder setBluetoothReceiver(String bluetoothReceiver) {
      this.bluetoothReceiver = bluetoothReceiver;
      return this;
    }

    public ComputerBuilder setDvdReader(String dvdReader) {
      this.dvdReader = dvdReader;
      return this;
    }

  }

  private String hdd;
  private String cpu;
  private String ram;

  // optional
  private String gpu;
  private String wifiReceiver;
  private String bluetoothReceiver;
  private String dvdReader;
  
  private Computer(ComputerBuilder computerBuilder) {
    this.hdd = computerBuilder.hdd;
    this.cpu = computerBuilder.cpu;
    this.ram = computerBuilder.ram;
    this.gpu = computerBuilder.gpu;
    this.wifiReceiver = computerBuilder.wifiReceiver;
    this.bluetoothReceiver = computerBuilder.bluetoothReceiver;
    this.dvdReader = computerBuilder.dvdReader;
  }

  public Computer(String hdd, String cpu, String ram, String gpu, String wifiReceiver,
      String bluetoothReceiver, String dvdReader) {
    super();
    this.hdd = hdd;
    this.cpu = cpu;
    this.ram = ram;
    this.gpu = gpu;
    this.wifiReceiver = wifiReceiver;
    this.bluetoothReceiver = bluetoothReceiver;
    this.dvdReader = dvdReader;
  }



  public String getCpu() {
    return cpu;
  }

  public String getGpu() {
    return gpu;
  }

  public String getHdd() {
    return hdd;
  }

  public String getRam() {
    return ram;
  }

  public String getWifiReceiver() {
    return wifiReceiver;
  }

  public void setCpu(String cpu) {
    this.cpu = cpu;
  }

  public void setGpu(String gpu) {
    this.gpu = gpu;
  }

  public void setHdd(String hdd) {
    this.hdd = hdd;
  }

  public void setRam(String ram) {
    this.ram = ram;
  }

  public void setWifiReceiver(String wifiReceiver) {
    this.wifiReceiver = wifiReceiver;
  }

  public String getBluetoothReceiver() {
    return bluetoothReceiver;
  }

  public void setBluetoothReceiver(String bluetoothReceiver) {
    this.bluetoothReceiver = bluetoothReceiver;
  }

  public String getDvdReader() {
    return dvdReader;
  }

  public void setDvdReader(String dvdReader) {
    this.dvdReader = dvdReader;
  }

  @Override
  public String toString() {
    return String.format("Laptop [hdd=%s, cpu=%s, ram=%s, gpu=%s, wifiReceiver=%s]", hdd, cpu, ram,
        gpu, wifiReceiver);
  }

}
