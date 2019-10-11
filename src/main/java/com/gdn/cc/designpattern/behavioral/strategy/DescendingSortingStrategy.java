package com.gdn.cc.designpattern.behavioral.strategy;

import java.util.List;

public class DescendingSortingStrategy implements SortingStrategy {

  @Override
  public List<String> sort(List<String> listToSort) {
    // sort descendingly
    return listToSort;
  }

}
