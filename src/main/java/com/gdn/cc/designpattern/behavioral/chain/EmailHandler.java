package com.gdn.cc.designpattern.behavioral.chain;

public interface EmailHandler {
  public void handleRequest(Email email);

  public void setNext(EmailHandler handler);
}
