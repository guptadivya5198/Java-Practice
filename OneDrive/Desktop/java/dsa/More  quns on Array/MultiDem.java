import java.util.Arrays;
import java.util.Scanner;

public class MultiDem {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [][] arr = new int[3][];

         for (int row = 0; row < arr.length; row++) {
            System.out.print("Enter the number of columns for row " + row + ": ");
            int cols = in.nextInt();
            arr[row] = new int[cols];  // Initialize the row with the user-defined number of columns
        }

        // input
        // for loop for row
        System.out.println("Ente integers (for matrix):");
        for (int row =0; row< arr.length; row++){
                // for loop for col
             for(int col =0; col< arr[row].length; col++){
                    arr[row][col] = in.nextInt();
                }
            }

            // output 
            System.out.println("\nThe matrix is:");
            for (int row =0; row < arr.length; row++){
                // for (int col =0; col< arr[row].length; col++){
                //     System.out.print(arr[row][col] + " ");
                // }
                // System.out.println();

                // instead of above code we can write this
                System.out.println(Arrays.toString(arr[row]));
            }
    }
}
