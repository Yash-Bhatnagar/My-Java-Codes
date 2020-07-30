import java.util.Arrays;

public class Array_101 {
    public static void main(String[] args) {
        int[] arr= new int[]{10,1,5,6,8,4};

        //This is actually the location in memory of the array
        System.out.println(arr);

        //Converts the array to String form
        System.out.println("Original values are : "+Arrays.toString(arr));

        System.out.println("Elements of array are : ");
        //Using for-each loop or Enhanced for loop
        for (int t : arr)
        {
            System.out.print(t+" ");
        }

        //Creates a NEW array with values in same order
        System.out.println("\nNew Array of length 4 becomes : "+Arrays.toString(Arrays.copyOf(arr,4)));
        System.out.println("New Array of length 10 becomes : "+Arrays.toString(Arrays.copyOf(arr,10)));

        //Returns the index of the mentioned value in SORTED array
        System.out.println("Returns negative number because array is not sorted :"+Arrays.binarySearch(arr,10));

        //Sorts the original array in ascending order
        Arrays.sort(arr);
        System.out.println("Sorted array : "+Arrays.toString(arr));

        //Returns the index of the mentioned value in SORTED array
        System.out.println("After sorting array the index of 10 is : "+Arrays.binarySearch(arr,10));
        //Returns negative number because value is not present in array
        System.out.println("Index of 2 (not in array is) : "+Arrays.binarySearch(arr,2));

        //Replaces every index of array with the given value
        Arrays.fill(arr,10);
        System.out.println("New Values are : "+Arrays.toString(arr));

    }
}
