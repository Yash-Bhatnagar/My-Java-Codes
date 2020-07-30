package Overriding;

public class Program
{
    public static void main(String[ ] args)
    {
        Machine m0 = new Machine();
        m0.start();

        Machine m = new Machine(){
            @Override public void start()
            {
                System.out.println("Wooooo");
            }
        };
        m.start();

        Machine m2 = new Machine();
        m2.start();
    }
}

