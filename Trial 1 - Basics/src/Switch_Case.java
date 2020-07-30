public class Switch_Case {
    public static void main(String[] args) {
        final int a=2;
        for (int c=0;c<4;c++)
        {
            switch (c)
            {
                case a:
                    System.out.print("a ");
                default:
                    System.out.print("Default ");
                case a-1:
                    System.out.print("a-1 ");
                    break;
                case a-2:
                    System.out.print("a-2 ");

            }

            System.out.println("");

        }
    }
}
