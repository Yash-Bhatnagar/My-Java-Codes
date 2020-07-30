import java.util.Scanner;

// Data for input: This is some \"really\" great. (Text)!?

public class Crypto_Project {

    public static void main(String[] args)
    {
        String encrypttext= encrypt();

        String decrypttext=ungroupify(encrypttext);

        System.out.println("\nEnter the key to decrypt your code (Same as Caesar Cypher key):-");
        Scanner sc=new Scanner(System.in);
        int unlockkey=sc.nextInt();

        decrypttext=decrypt(decrypttext,unlockkey);

        System.out.println("\nDecrypted text is : "+decrypttext);

        //System.out.println(encrypttext);

    }




    public static String encrypt()
    {
        System.out.println("Enter a String");
        Scanner sc=new Scanner(System.in);
        String str= sc.nextLine();
        String normalizedtext=normalizeText(str);
        //System.out.println("New String is : "+normalizedtext);

        System.out.println("Enter a key value to perform Caesar Cypher ");
        int key=sc.nextInt();
        String CaesarCypheredtext= caesarify(normalizedtext,key);
        //System.out.println("After Caesar Cipher, String becomes : "+CaesarCypheredtext);

        System.out.println("Enter a value to divide the string into groups ");
        int shft =sc.nextInt();
        String grpedtext=groupify(CaesarCypheredtext,shft);
        //System.out.println("String after dividing into groups is : "+grpedtext;

        System.out.println("Final Result is : "+grpedtext);

        return grpedtext;
    }

    //Break into groups
    public static String groupify(String str,int shft)
    {
        String str_new="";
        for(int i=0;i<str.length();i+=shft)
        {
            if(i+shft>str.length())
            {
                str_new=str_new+str.substring(i);
                int x=i+shft-str.length();
                while(x>0)
                {
                    str_new=str_new+"x";
                    x--;
                }
            }
            else
                str_new=str_new+str.substring(i,i+shft)+" ";
        }
        return str_new;
    }

    //Joins the string again
    public static String ungroupify(String encrypttext)
    {
        encrypttext=encrypttext.replace(" ","");
        encrypttext=encrypttext.replace("x","");
        return encrypttext;
    }

    //Caesar Cipher
    public static String caesarify(String str,int key)
    {
        String str_new="";
        int crr=0;
        for(int i=0;i<str.length();i++)
        {
            if(((int)str.charAt(i)+key)>90) //For Greater than Z -- ASCII Value = 90
            {
                crr=((int)str.charAt(i)+key)-90+65-1;
                str_new=str_new+(char)crr;
            }
            else if(((int)str.charAt(i)+key)<65) //For Less than A -- ASCII Value= 65
            {
                crr=((int)str.charAt(i)+key)-65+90+1;
                str_new=str_new+(char)crr;
            }
            else {
                crr = ((int) str.charAt(i) + key);
                str_new=str_new+(char)crr;
            }
        }

        return str_new;
    }

    //Neutralizes effect of Caesar Cypher
    public static String decrypt(String str, int ukey)
    {

        String str_new="";
        int crr=0;
        for(int i=0;i<str.length();i++)
        {
            if(((int)str.charAt(i)-ukey)>90) //For Greater than Z -- ASCII Value = 90
            {
                crr=((int)str.charAt(i)-ukey)-90+65-1;
                str_new=str_new+(char)crr;
            }
            else if(((int)str.charAt(i)-ukey)<65) //For Less than A -- ASCII Value= 65
            {
                crr=((int)str.charAt(i)-ukey)-65+90+1;
                str_new=str_new+(char)crr;
            }
            else {
                crr = ((int) str.charAt(i) - ukey);
                str_new=str_new+(char)crr;
            }
        }

        return str_new;
    }

    //Noramlizes text
    public static String normalizeText(String str)
    {
        //remove spaces
        str=str.replace(" ","");

        //remove special chars
        str=str.replace(".","");
        str=str.replace(",","");
        str=str.replace(":","");
        str=str.replace(";","");
        str=str.replace("\'","");
        str=str.replace("!","");
        str=str.replace("?","");
        str=str.replace("(","");
        str=str.replace(")","");
        str=str.replace("\"","");
        str=str.replace("\\","");

        //Lower TO Upper Case
        str=str.toUpperCase();

        return str;

    }

}

