import java.util.Scanner;

public class Number_Triangle {
    public static void main(String[] args) {

        System.out.println("Enter the desired number of rows to be contained in Number Triangle : ");

        Scanner sc = new Scanner(System.in);
        int num= sc.nextInt();

        System.out.println("The pattern is as follows :-");
        fn1(num);

    }
    public static void fn1(int num)
    {
        for (int a=num;a>0;a--)
        {
            for (int b=1;b<a;b++)
                System.out.print(" ");
            for (int c=1;c<num-a+1;c++)
                System.out.print(c);
            for (int d=num-a+1;d>=1;d--)
                System.out.print(d);
            System.out.print("\n");
        }
    }
}
