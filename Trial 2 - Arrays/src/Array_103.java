import java.util.Arrays;

public class Array_103 {
    public static void main(String[] args) {
        int[]a=new int[]{2,55,6,23};
        System.out.println("Original array is: "+Arrays.toString(a));
        square(a);
        //Values of 'a' automatically gets changed as both 'a' and 'b' point to same address
        System.out.println("Its square is: "+Arrays.toString(a));

    }
    public static void square(int[] b)
    {
        for (int i=0;i<b.length;i++)
        {
            b[i]=b[i]*b[i];
        }
        //Note: Here we are not returning any value
    }
}
