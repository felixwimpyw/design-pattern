package com.gdn.cc.designpattern.behavioral.state;

// Context
public class MP3Player {
  private State state;

  MP3Player(State state) {
    this.state = state;
  }

  public State getState() {
    return state;
  }

  public void play() {
    state.pressPlay(this);
  }

  public void setState(State state) {
    this.state = state;
  }
}
