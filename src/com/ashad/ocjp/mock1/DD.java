package com.ashad.ocjp.mock1;

public class DD {

    public static void main(String[] args) {
        Car car1 = new Car("Auto");
        Car car2 = new Car("4W", 150, "Mannual");
        System.out.println(car1.type+":"+car1.maxSpeed+":"+car1.trans);
        System.out.println(car2.type+":"+car2.maxSpeed+":"+car2.trans);
    }

}

class Vehicle {
String type = "4W";
int maxSpeed=100;

    Vehicle(){

    }
    Vehicle(String type, int maxSpeed){
        this.type = type;
        this.maxSpeed =maxSpeed;
    }

}

class Car extends  Vehicle {
    String trans;
     Car(String trans){
         this.trans = trans;
     }

    Car(String type, int maxSpeed, String trans){
         super(type, maxSpeed);
        this.trans = trans;
    }

}
