package com.gdn.cc.designpattern.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class ArtisticNumberDrawer {

  private Map<Integer, ArtisticNumber> artisticNumbers = new HashMap<>();

  public void drawAslinya(int number) {
    ArtisticNumber artisticNumber = ArtisticNumber.complexDrawing(number);
    artisticNumber.show();
  }

  public void draw(int number) {
    ArtisticNumber artisticNumber = artisticNumbers.get(number);
    if (artisticNumber == null) {
      artisticNumber = ArtisticNumber.complexDrawing(number);
      artisticNumbers.put(number, artisticNumber);
    }
    artisticNumber.show();
  }

}
