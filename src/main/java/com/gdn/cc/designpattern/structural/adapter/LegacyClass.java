package com.gdn.cc.designpattern.structural.adapter;

public class LegacyClass {
  private static final String SALT = "salt";

  public String[] addingSalt(String[] units) {
    for (int i = 0; i < units.length; i++) {
      units[i] = units[i] + SALT;
    }
    return units;
  }


}
