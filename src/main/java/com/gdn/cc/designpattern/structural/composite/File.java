package com.gdn.cc.designpattern.structural.composite;

public class File {

  protected String name;
  protected int size;

  public File() {}

  public File(String name, int size) {
    this.name = name;
    this.size = size;
  }

  public String getName() {
    return name;
  }

  public int getSize() {
    return size;
  }

  public void ls() {
    System.out.println("Filename = " + name + ", Size = " + getSize() + "KB");
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setSize(int size) {
    this.size = size;
  }

}
