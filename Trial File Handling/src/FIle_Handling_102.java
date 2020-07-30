import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FIle_Handling_102 {
    public static void main(String[] args) {
        try
        {
            //Can't read a .docx file
            File f=new File("D:\\Yash\\Docs\\Self Study Stuff\\Java Core\\File 1.docx");
            Scanner sc=new Scanner(f);
            System.out.println("Before while");
            while (sc.hasNext())
            {
                System.out.println("In while");
                System.out.print(sc.next());
            }
            System.out.println("After while");
            sc.close();
        }
        catch(Exception e)
        {
            System.out.println("Error!!");
        }

        try {
            File f=new File("D:\\Yash\\Docs\\Self Study Stuff\\Java Core\\File Handling Trial.txt");
            Scanner sc=new Scanner(f);
            while (sc.hasNext())
            {
                System.out.print(sc.next()+" ");
            }
            sc.close();

        }catch (Exception e)
        {
            System.out.println("Error");
        }
    }
}
