import java.util.Scanner;

public class Factorial {

    public static int num;
    public static String choice;

    public static void main(String[] args)
    {
        System.out.println("Enter a number to find its factorial : ");
        choice=inp();

        System.out.println("\nThe factorial of "+num+" is :- ");
        if ("l".equalsIgnoreCase(choice))
        {
            LoopMethod(num);
        }
        else
        {
            System.out.println(RecMethod(num));
        }

    }

    public static String inp()
    {
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();

        loop:
        do {
            System.out.print("\nWhich approach do you want to use?\nEnter R(Recursive) or L(Loop) : ");
            choice=sc.next();
            if (choice.equalsIgnoreCase("l")||choice.equalsIgnoreCase("r")){
                break loop;
            }
            else{
                System.out.println("The choice that you have entered \""+choice.charAt(0)+"\" is an INVALID Entry \nPlease enter a valid input");
            }
        }
        while(true);

        return choice;
    }

    //By Loop
    public static void LoopMethod(int num)
    {
        for (int i=num-1;i>1;i--)
        {
            num=num*i;
        }
        System.out.print(num);
    }

    //By Recursion
    public static int RecMethod(int num)
    {
        if (num==1)
            return 1;
        else
            return num*RecMethod(num-1);
    }

}
