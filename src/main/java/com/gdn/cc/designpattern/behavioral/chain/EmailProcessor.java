package com.gdn.cc.designpattern.behavioral.chain;

public class EmailProcessor {

  private EmailHandler firstHandler;
  private EmailHandler lastHandler;

  public void addHandler(EmailHandler handler) {
    if (firstHandler == null) {
      firstHandler = handler;
      lastHandler = handler;
    } else {
      lastHandler.setNext(handler);
      lastHandler = handler;
    }
  }

  public void handleEmail(Email email) {
    firstHandler.handleRequest(email);
  }

}
