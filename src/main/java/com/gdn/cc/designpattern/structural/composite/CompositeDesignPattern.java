package com.gdn.cc.designpattern.structural.composite;

import org.junit.Test;

public class CompositeDesignPattern {
  public CompositeDesignPattern() {
    Folder music = new Folder("Music");
    music.addFiles(new File("Kangen Band", 100));
    music.addFiles(new File("Ada Band", 100));
    music.addFiles(new File("Sherina", 100));

    Folder document = new Folder("Document");
    Folder foto = new Folder("Foto");
    foto.addFiles(new File("foto1", 150));

    document.addFiles(new Folder("Presentasi"));
    document.addFiles(foto);

    music.ls();
    System.out.println();
    document.ls();
  }

  @Test
  public void displayTest() {}
}
