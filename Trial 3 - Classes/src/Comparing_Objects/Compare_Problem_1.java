package Comparing_Objects;

public class Compare_Problem_1
{
    String name;
    public Compare_Problem_1(String s)
    {
        this.name=s;
        System.out.println(s);
    }

    public static void main(String[] args) {
        Compare_Problem_1 a=new Compare_Problem_1("Hello");
        Compare_Problem_1 b=new Compare_Problem_1("Hello");
        if (a==b)
            System.out.println("Equal");
        else if (a.equals(b))
            System.out.println("DOT EQUALS");
        else
            System.out.println("Not equal");
    }
}
