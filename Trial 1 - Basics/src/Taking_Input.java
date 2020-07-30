import java.util.Scanner;

public class Taking_Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence");
        String str= sc.nextLine();
        System.out.println(str);

        System.out.println("Enter an Integer value");
        int inp= sc.nextInt();

        System.out.println("Enter a decimal value");
        double dbl= sc.nextDouble();

        System.out.println("Enter a word");
        String wrd = sc.next();

        /*
        This can't be written here

        System.out.println("Enter a sentence");
        String str= sc.nextLine();
        System.out.println(str);
        */


        System.out.println("Input Values are :"+inp+" , "+dbl+" , "+wrd+" , "+str);
    }
}
