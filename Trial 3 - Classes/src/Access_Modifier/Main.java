package Access_Modifier;

import Inheritance_101.Car;

public class Main {
    public static void main(String[] args) {


        System.out.println("Creating obj of class Access_Modifier.A");
        A obj1 = new A();

        System.out.println("\nCreating obj of class Access_Modifier.B");
        B obj = new B();

        System.out.println("\nCalling various methods");
        obj.M1();//Public Method
        obj.M2();//Protected method
        //obj.M3(); Will return error

        //obj1.M3(); Error
        System.out.println("\nPrivate is only accessible from class");
        System.out.println("Protected is accessible from sub-class");

        System.out.println("\nPublic methods are accessible anywhere in the project");
        Car c1=new Car();
        c1.m1();
        //c1.prot_m1(); Error




    }
}
