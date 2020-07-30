import java.util.Scanner;
//Fibonacci series using multiple approaches

public class Fibonacci_series {

    //To declare and use gloabal variables, we have to make them static
    public static int a1=0;
    public static int a2=1;

    public static void main(String[] args) {
        System.out.print("How many numbers of Fibonacci series do you want to print?\nPlease enter : ");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();

        Scanner sc1= new Scanner(System.in);
        String choice;

        //Here label is used alonwith break operation
        loop:
            do {
                System.out.print("\nWhich approach do you want to use?\nEnter R(Recursive) or L(Loop) : ");
                choice=sc1.next();
                if (choice.equalsIgnoreCase("l")||choice.equalsIgnoreCase("r")){
                    break loop;
                }
                else{
                    System.out.println("The choice that you have entered \""+choice.charAt(0)+"\" is an INVALID Entry \nPlease enter a valid input");
                }
            }
            while(true);

        System.out.println("\nFibonacci series:");
        if ("l".equalsIgnoreCase(choice))
            LoopMethod(num);
        else
        {
            // To print whole series we have to use loop
            for (;a2<=num;a2++)
            {
                System.out.print(RecMethod(a2)+" ");
            }

            // TO find out n th term only, we can use recursion
            System.out.println("\nThe "+num+"th term of Fibonacci series is : "+RecMethod(num));
        }

    }

    //Fibonacci using Loop approach
    public static void LoopMethod(int num)
    {
        if(num==1)
            System.out.println(a1);
        else if (num==2)
            System.out.println(a1+" "+a2);
        else{
            System.out.print("0 1");
            for (num=num-2;num>0;num--)
            {
                a2=a2+a1;
                a1=a2-a1;
                System.out.print(" "+a2);
            }
        }
    }

    //Fibonacci using Recursion method
    public static int RecMethod(int num)
    {
        if(num==1)
            return 0;
        else if (num==2)
            return 1;
        else{
            return RecMethod(num-2)+RecMethod(num-1);
        }

    }


}
