import java.util.Scanner;

public class String_Buffer_101 {
    public static void main(String[] args) {
        String str_0="aba";
        StringBuffer str2=new StringBuffer(str_0);
        str2=str2.reverse();

        if (str2.equals(str_0))
            System.out.println("Dot Equals");
        else if (str_0.contentEquals(str2))
            System.out.println("content equal");
        else
            System.out.println("Neither");
    }

}