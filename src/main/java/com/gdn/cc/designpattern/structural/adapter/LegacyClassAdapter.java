package com.gdn.cc.designpattern.structural.adapter;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LegacyClassAdapter {

  public List<String> addingSalt(List<String> units) {
    LegacyClass legacyClass = new LegacyClass();
    String[] arrayUnits = listToArrayString(units);
    String[] result = legacyClass.addingSalt(arrayUnits);
    return arrayToListString(result);
  }

  private List<String> arrayToListString(String[] units) {
    return Stream.of(units).collect(Collectors.toList());
  }

  private String[] listToArrayString(List<String> units) {
    return units.toArray(new String[units.size()]);
  }

}
