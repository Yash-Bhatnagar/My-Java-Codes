package Inheritance_101;

public class Inherit_101 {
    public static void main(String[] args) {
        Car mycar= new Car(); //Creating an object
        Truck myTruck = new Truck();



        System.out.println(mycar);
        //Only toString() works, because when object is written in sout, it automatically calls toString() method
        //We are overriding toString() method here

        mycar.m1();
        myTruck.m1();

        System.out.println(myTruck);
        //Because truck inherits Inheritance_101.Car class
    }
}

