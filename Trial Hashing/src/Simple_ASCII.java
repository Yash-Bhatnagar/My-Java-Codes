public class Simple_ASCII {
    public static void main(String[] args) {
        System.out.println("String :"+sascii("ABc",16));
    }
    public static int sascii(String str,int k)
    {
        int sum=0;
        char ch_arr[];
        ch_arr=str.toCharArray();
        for (int i=0;i<str.length();i++)
        {
            sum=sum+ch_arr[i];
        }
        return sum % k;
    }
}
