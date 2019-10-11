package com.gdn.cc.designpattern.structural.facade;

public class FacadeDesignPattern {

  private ITSupport itSupport = new ITSupport();
  private FinanceSupport financeSupport = new FinanceSupport();
  private OperationSupport operationSupport = new OperationSupport();

  public void doComplain(String complainSubject, String complainBody) {
    if (complainSubject.contains("bug")) {
      itSupport.investigateError(complainBody);
    } else if (complainSubject.contains("refund")) {
      financeSupport.requestRefund(complainBody);
    } else {
      operationSupport.manuallyServingComplain(complainBody);
    }
  }

}
