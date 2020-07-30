import java.io.File;

public class FIle_Handling_101 {
    public static void main(String[] args) {
        File f=new File("D:\\Yash\\Docs\\Self Study Stuff\\Java Core\\File Handling Trial.txt");
        if (f.exists())
        {
            System.out.println(f.getName()+" exists!!");
        }
        else
        {
            System.out.println("False");
        }
    }
}
