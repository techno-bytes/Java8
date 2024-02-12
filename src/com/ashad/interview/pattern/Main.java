package com.ashad.interview.pattern;

public class Main {

    public static void main(String[] args) {
        Subscriber sc = new Subscriber("Annu");
        Subscriber sc1 = new Subscriber("Aatif");

        Channel channel = new Channel();
        channel.subscribeChannel(sc);
        channel.subscribeChannel(sc1);
        sc.subscribeChannel(channel);
        sc1.subscribeChannel(channel);

        channel.uploadVideo("How to learn programming ???");

    }
}
