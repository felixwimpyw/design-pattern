package com.gdn.cc.designpattern.behavioral.observer;

public class Product {

  private String productName;
  private int price;

  public Product() {
    // TODO Auto-generated constructor stub
  }

  public Product(String productName, int price) {
    super();
    this.productName = productName;
    this.price = price;
  }

  public int getPrice() {
    return price;
  }

  public String getProductName() {
    return productName;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  public void setProductName(String productName) {
    this.productName = productName;
  }

  @Override
  public String toString() {
    return String.format("Product [productName=%s, price=%s]", productName, price);
  }
}
