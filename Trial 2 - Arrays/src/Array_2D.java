import java.util.Arrays;

public class Array_2D {
    public static void main(String[] args) {
        int[][]arr=new int[4][5];

        System.out.println("\nDifferent operations on 2D Array :-\n");
        System.out.println("arr.length prints the no. of rows : "+arr.length);
        System.out.println("arr[x].length prints the no. of columns in that row : "+arr[0].length+" , "+arr[3].length);
        System.out.println("Arrays.toString(arr) prints the address of different arrays stored in it : "+Arrays.toString(arr));

        int i,j,ctr=1;
        for (i=0;i<arr.length;i++)
        {
            //arr[i].length indicates the length of the row -- which is same for all -- i.e : column size
            for (j=0;j<arr[i].length;j++)
            {
                arr[i][j]=ctr;
                ctr++;
            }
        }

        System.out.println("\nValues in 2D array are entered in the following format :-");
        //For printing 2D array
        for (j=0;j<arr.length;j++)
        {
            System.out.println(Arrays.toString(arr[j]));
        }

        //String array
        String[][] str=new String[3][5];
        for (i=0;i<str.length;i++)
        {
            //arr[i].length indicates the length of the row -- which is same for all -- i.e : column size
            for (j=0;j<str[i].length;j++)
            {
                str[i][j]=i+" "+j;
            }
        }
        System.out.println("\nIndex of a [3]X[5] Array are as follows :-");
        for (j=0;j<str.length;j++)
        {
            System.out.println(Arrays.toString(str[j]));
        }


    }
}
