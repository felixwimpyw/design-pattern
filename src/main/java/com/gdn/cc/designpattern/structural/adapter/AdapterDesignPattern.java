package com.gdn.cc.designpattern.structural.adapter;

import java.util.List;

/**
 * Adapter adapt an interface to an expected interface.
 * 
 * @author felix.w.wijaya
 */
public class AdapterDesignPattern {

  public AdapterDesignPattern(List<String> units) {
    LegacyClassAdapter adapter = new LegacyClassAdapter();
    adapter.addingSalt(units);
  }
}
