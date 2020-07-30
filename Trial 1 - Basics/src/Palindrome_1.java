import java.util.Scanner;

public class Palindrome_1 {
    public static void main(String[] args) {

        System.out.print("Enter a string to check whether it's Palindrome or not : ");

        Scanner sc=new Scanner(System.in);
        String str= sc.next();

        StringBuffer stra= new StringBuffer(str);
        stra=stra.reverse();

        String str3=stra.toString();

        if (str3.equals(str))
            System.out.println("Palindrome");


        else
            System.out.println("Not palindrome");


    }
}
