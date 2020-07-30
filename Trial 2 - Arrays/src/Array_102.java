import java.util.Arrays;

public class Array_102 {
    public static void main(String[] args) {
        int[] arr= new int[]{1,2,8,6};
        System.out.println("Values in arr :"+Arrays.toString(arr));

        int[] b = arr;
        //Both arr and b point to same location
        System.out.println("Address of arr : "+arr+"\nAddress of b   : "+b);

        b[2]=44;
        //Because both arr and b point to same location, therefore changing the values in b affects the values stored in arr
        System.out.println("Values contained in arr becomes : "+Arrays.toString(arr));

        int c[]=Arrays.copyOf(arr,arr.length);
        c[2]=56;

        System.out.println("Values in arr : "+Arrays.toString(arr));
        System.out.println("Values in c : "+Arrays.toString(c));
        //Note: Value of arr doesn't change here; because copyOf() creates a NEW Array

        //For Strings, value is copied instead of reference
        String str="Wubba laba Dab Dab";
        String str2=str;
        str2=str2.replace('a','i');
        //No change to original string
        System.out.println("Old String : "+str+"\nCopied String : "+str2);

    }
}
