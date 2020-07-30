
import java.util.Arrays;

public class Array_2D_101 {
    public static void main(String[] args) {
        int [][] arr={{1,2,3},{44},{21,65,76,54,45}};

        System.out.println("Array is allocated following positions: ");
        System.out.println(Arrays.toString(arr[0]));
        System.out.println(Arrays.toString(arr[1]));
        System.out.println(Arrays.toString(arr[2]));

        System.out.println("\nUsing enhanced for loop");
        //Printing 2D array using enhanced for-loop
        for (int[] t: arr)
        {
            System.out.println(Arrays.toString(t));
        }

        //Out of bound error
        //System.out.println(arr[0][3]);

    }
}
