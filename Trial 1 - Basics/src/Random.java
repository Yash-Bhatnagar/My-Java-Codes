import java.util.*;
public class Random {
    public static void main(String[] args){

      Random r= new Random();
      System.out.println("Random data(not necessarily String) is: "+r);

      java.util.Random rand=new java.util.Random();

      int a= rand.nextInt(10); //Upper limit is bound to 10

      double b= rand.nextDouble();//Can't set any bound

      System.out.println("Random number within 10 is: "+a);
      System.out.println("Random double(decimal) value is: "+b);

      double r1=Math.random(); // Returns a number between 0 and 1, i.e. decimal value
      int num= (int) (r1*10);
      System.out.println("Random number between 0 and 10 is: "+num);


    }
}
