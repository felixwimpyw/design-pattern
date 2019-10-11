package com.gdn.cc.designpattern.behavioral.interpreter;

public class InterpreterDesignPattern {

  public InterpreterDesignPattern(String designPatternName, String purpose) {
    String format = Format.apply("This is $0 design pattern for $1", designPatternName, purpose);
    System.out.println(format);
  }

}
