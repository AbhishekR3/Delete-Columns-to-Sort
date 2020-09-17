// Delete Columns to Sort
// Abhishek Ramesh

import java.util.*;

public class sortColumns {
    //Creates the String array
    public static String[] myList = {"cba", "daf", "ghi"};

    //Deleting function
    public static int minDeletionSize(String[] A) {

        //Checks if strings are different length
        for (int i = 1; i < A.length; i++){
            if (A[i].length() != A[i-1].length()) {
              System.out.println(-1);
              System.exit(0);
            }
        }

        int ans = 0;
        boolean found = false;

        //Prints the values of not sorted columns
        for (int iElement = 0; iElement < A[0].length(); iElement++){
            for (int iCharacter = 0; iCharacter < A.length - 1; iCharacter++){
                if (A[iCharacter].charAt(iElement) > A[iCharacter+1].charAt(iElement)) {
                    System.out.println(ans);
                    ans++;
                    found = true;
                    break;
                }
            }

            //Increase the column value if it did not pass through the original if statement
            if (found==false){
            ans++;
            }

            found = false;
        }

        return -1;
    }

    //Main Function
    public static void main(String[] args) {
        System.out.println("Your string array was: " + Arrays.toString(myList));
        minDeletionSize(myList);

    }
}