package com.ashad.interview.pattern;

public class Subscriber {

    private String name;
    private Channel channel;

    public Subscriber(String name) {
        this.name = name;
    }

    public void update(String msg) {
        System.out.println(msg);
    }

    void subscribeChannel(Channel channel){
        this.channel = channel;
    }
}
