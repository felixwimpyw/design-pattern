package com.gdn.cc.designpattern.behavioral.chain;

public class Email {

  private String from;

  public String getFrom() {
    return from;
  }

  public void setFrom(String from) {
    this.from = from;
  }

  @Override
  public String toString() {
    return String.format("Email [from=%s]", from);
  }

}
