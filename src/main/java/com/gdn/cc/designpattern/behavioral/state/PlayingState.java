package com.gdn.cc.designpattern.behavioral.state;

public class PlayingState implements State {

  @Override
  public void pressPlay(MP3Player context) {
    System.out.println("-STOP-");
    context.setState(new StandbyState());
  }
}
