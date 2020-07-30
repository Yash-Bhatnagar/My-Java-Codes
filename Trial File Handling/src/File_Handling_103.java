import java.util.Formatter;

public class File_Handling_103
{
    public static void main(String[] args) {
        try {
            Formatter ft=new Formatter("D:\\Yash\\Docs\\Self Study Stuff\\Java Core\\File test.txt");
            ft.format("%s %s   %s","1.","My name is Yash","Lets try next line\r\n");
            ft.format("%s\n%s","2.","Bye");
            ft.close();
            System.out.println("Done writing!!");

        }catch (Exception e){
            System.out.println("The error is : "+e.getLocalizedMessage());
        }
    }
}
