package com.gdn.cc.designpattern.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Folder extends File {

  private List<File> files = new ArrayList<>();

  public Folder() {}

  public Folder(String name) {
    this.name = name;
  }

  public void addFiles(File file) {
    files.add(file);
    size += file.size;
  }

  @Override
  public void ls() {
    System.out.println("Folder Name = " + name);
    System.out.println("Found " + files.size() + " files, with total size of " + size + "KB");
    files.stream().forEach(e -> e.ls());
  }

}
