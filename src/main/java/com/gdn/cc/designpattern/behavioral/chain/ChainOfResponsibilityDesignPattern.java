package com.gdn.cc.designpattern.behavioral.chain;

public class ChainOfResponsibilityDesignPattern {

  public ChainOfResponsibilityDesignPattern() {
    EmailProcessor processor = new EmailProcessor();
    processor.addHandler(new PromotionMailHandler());
    processor.addHandler(new OfficeMailHandler());

    Email email = new Email();
    email.setFrom("felix.w.wijaya@gdn-commerce.com");
    processor.handleEmail(email);
  }

}
