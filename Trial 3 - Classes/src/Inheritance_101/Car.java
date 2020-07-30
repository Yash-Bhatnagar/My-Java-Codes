package Inheritance_101;

public class Car{
    public void m1()
    {
        System.out.println("Inheritance_101.Car 1");
    }
    protected void prot_m1()
    {
        System.out.println("Protected Method of Car 1");
    }
    public void m2()
    {
        System.out.println("Inheritance_101.Car 2");
    }
    public String oString()
    {
        System.out.println("SOUT");
        return "Vroom!!";
    }
    //Only toString() works, because when object is written in sout, it automatically calls toString() method
    //We are overriding toString() method here
    public String toString()
    {
        System.out.println("SOUT");
        return "Vroom!!";
    }
}
