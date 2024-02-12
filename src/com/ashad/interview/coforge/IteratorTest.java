package com.ashad.interview.coforge;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class IteratorTest {

    public static void main(String[] args) {

        List<String> colors = new ArrayList<>();

        colors.add("RED");
        colors.add("GREEN");
        colors.add("YELLOW");
        Iterator<String> iterator = colors.iterator();
        while(iterator.hasNext()){
            iterator.next();
            iterator.remove();
        }
        System.out.println("colors= "+colors);
//        for (String color : colors) {
//            colors.remove(color);
//            colors.add("Pink");
//        }

        CopyOnWriteArrayList<String> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        copyOnWriteArrayList.add("RED");
        copyOnWriteArrayList.add("GREEN");
        copyOnWriteArrayList.add("YELLOW");

        for(String color : copyOnWriteArrayList){
            copyOnWriteArrayList.remove("GREEN");
        }

        System.out.println("copyOnWriteArrayList= "+copyOnWriteArrayList);




    }
}
