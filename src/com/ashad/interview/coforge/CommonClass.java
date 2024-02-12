package com.ashad.interview.coforge;

import java.io.File;
import java.io.FileInputStream;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.concurrent.atomic.AtomicInteger;

public class CommonClass {

    public static void main(String[] args) {

       try(PrintWriter pw = new PrintWriter(new File("employee.ser"))){
           pw.println("adhlkjsahkjshaf");
           System.out.println();
       }catch (Exception e){

       }

//       potato//////////////////???           ?????????????????????????????

       Hashtable<String , String> hashTable = new Hashtable<>();
//       hashTable.put(null, null);
//        System.out.println(hashTable);

        AtomicInteger atomicInteger = new AtomicInteger(2);
        int sed = atomicInteger.getAndDecrement();
        System.out.println("sed= "+sed);

        HashMap<String, String> hm = new HashMap();
        hm.put(null, null);
        hm.put(null, "three");
        hm.put("ann", null);
        System.out.println(hm);


    }
}
