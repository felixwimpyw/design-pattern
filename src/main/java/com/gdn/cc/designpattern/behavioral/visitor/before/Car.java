package com.gdn.cc.designpattern.behavioral.visitor.before;

public class Car implements Merchandise {

  private String name;
  private int price;
  private int leasingPrice;

  public int getLeasingPrice() {
    return leasingPrice;
  }

  public String getName() {
    return name;
  }

  public int getPrice() {
    return price;
  }

  public void setLeasingPrice(int leasingPrice) {
    this.leasingPrice = leasingPrice;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setPrice(int price) {
    this.price = price;
  }

}
