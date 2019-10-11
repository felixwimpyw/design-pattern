package com.gdn.cc.designpattern.behavioral.chain;

public class PromotionMailHandler implements EmailHandler {
  private EmailHandler next;

  @Override
  public void handleRequest(Email email) {
    if (email.getFrom().endsWith("@blibli.com")) {
      System.out.println("Adding new email on promotion box " + email);
    } else {
      if (next != null) {
        next.handleRequest(email);
      }
    }
  }

  @Override
  public void setNext(EmailHandler handler) {
    next = handler;
  }

}
