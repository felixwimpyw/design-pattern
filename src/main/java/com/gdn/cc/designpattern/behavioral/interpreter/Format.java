package com.gdn.cc.designpattern.behavioral.interpreter;

public class Format {

  public static String apply(String format, String... object) {
    String result = format;
    for (int i = 0; i < object.length; i++) {
      result = result.replace("$" + i, object[i]);
    }
    return result;
  }

}
