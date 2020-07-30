package Comparing_Objects;

public class Compare_Solution_2 {
    String name;

    //Overriding is needed to make .equals() work!!
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;

        Compare_Solution_2 other = (Compare_Solution_2) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }


    public Compare_Solution_2(String s)
    {
        this.name=s;
        System.out.println(s);
    }

    public static void main(String[] args) {
        Compare_Solution_2 a=new Compare_Solution_2("Hello");
        Compare_Solution_2 b=new Compare_Solution_2("Hello");
        if (a==b)
            System.out.println("Equal");
        else if (a.equals(b))
            System.out.println("DOT EQUALS WORKS");
        else
            System.out.println("Not equal");
    }
}
