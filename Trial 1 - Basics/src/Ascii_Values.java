public class Ascii_Values {
    public static void main(String[] args) {
        char ch_a='a', ch_A='A',ch_=' ';
        int a=ch_a, A=ch_A, s=ch_;
        System.out.println("ASCII Code of 'a' is :"+a);
        System.out.println("ASCII Code of 'A' is :"+A);
        System.out.println("ASCII Code of ' ' (space) is :"+s);

        a++;
        String new1= Character.toString((char)a);
        System.out.println(new1);

        ++a;
        System.out.println((char)a);

        System.out.println("ASCII code of z is : "+(int)'z');
        System.out.println("ASCII code of Z is : "+(int)'Z');
    }
}
