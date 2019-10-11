package com.gdn.cc.designpattern.behavioral.visitor.before;

public class Apple implements Merchandise {

  private String name;
  private int price;

  public String getName() {
    return name;
  }

  public int getPrice() {
    return price;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setPrice(int price) {
    this.price = price;
  }

}
