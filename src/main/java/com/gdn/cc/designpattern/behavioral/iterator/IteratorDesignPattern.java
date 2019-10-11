package com.gdn.cc.designpattern.behavioral.iterator;

import java.util.Collection;

public class IteratorDesignPattern {

  public IteratorDesignPattern(Collection<String> collection) {
    if (collection.iterator().hasNext()) {
      String next = collection.iterator().next();
      System.out.println(next);
    }
  }

}
