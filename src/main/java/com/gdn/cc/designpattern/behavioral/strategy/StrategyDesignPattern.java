package com.gdn.cc.designpattern.behavioral.strategy;

import java.util.ArrayList;
import java.util.List;

public class StrategyDesignPattern {

  private SortingStrategy sortingStrategy;

  public StrategyDesignPattern() {
    sortingStrategy = new AscendingSortingStrategy();
  }

  public void changeSortingStrategyTo(SortingStrategy sortingStrategy) {
    this.sortingStrategy = sortingStrategy;
  }

  public void sortName(List<String> names) {
    List<String> listToSort = new ArrayList<>();
    sortingStrategy.sort(listToSort);
  }

}
