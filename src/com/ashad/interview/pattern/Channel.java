package com.ashad.interview.pattern;

import java.util.ArrayList;
import java.util.List;

public class Channel {

    List<Subscriber> subscriberList = new ArrayList<>();

    public void subscribeChannel(Subscriber sc){
        subscriberList.add(sc);
    }

    public void unSubscribe(Subscriber sc){
        subscriberList.remove(sc);
    }

    void notifySubsciber(String msg){
        for (Subscriber sub : subscriberList) {
            sub.update("New video uploaded");
        }
    }

    void uploadVideo(String msg){
        notifySubsciber(msg);
    }

}
