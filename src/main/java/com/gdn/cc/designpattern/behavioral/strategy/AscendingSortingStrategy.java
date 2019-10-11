package com.gdn.cc.designpattern.behavioral.strategy;

import java.util.List;

public class AscendingSortingStrategy implements SortingStrategy {

  @Override
  public List<String> sort(List<String> listToSort) {
    // sort ascendingly
    return listToSort;
  }

}
