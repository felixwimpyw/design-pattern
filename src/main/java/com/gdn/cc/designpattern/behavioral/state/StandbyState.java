package com.gdn.cc.designpattern.behavioral.state;

public class StandbyState implements State {

  @Override
  public void pressPlay(MP3Player context) {
    System.out.println("*dumdumdumdumdum*");
    context.setState(new PlayingState());
  }
}
