package com.gdn.cc.designpattern.behavioral.state;

import org.junit.Test;

public class StateDesignPattern {

  public StateDesignPattern() {
    MP3Player mp3Player = new MP3Player(new StandbyState());
    mp3Player.play();
    mp3Player.play();
  }

  @Test
  public void run() {

  }

}
