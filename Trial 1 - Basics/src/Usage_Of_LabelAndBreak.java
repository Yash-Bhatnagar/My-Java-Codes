public class Usage_Of_LabelAndBreak {
    public static void main(String[] args) {

        // Here label for outer loop is "outer"
        outer:
        for (int i = 0; i < 10; i++) {
         //outer loop

            for (int j = 0; j < 10; j++) {
             //inner loop
                if (j == 1)
                    break outer;
                System.out.println("In Inner for loop and value of j = " + j);
            }//end of inner loop

            System.out.println("In outer for loop"); //Won't be printed
        } // end of outer loop

        int ab=0;

        loop:
        while (true)
        {
            if(ab==1)
                break loop;
            else
                System.out.println("In while loop");
            ab++;
        }

        //If you want to know more open: https://www.geeksforgeeks.org/g-fact-64/

    }
}
