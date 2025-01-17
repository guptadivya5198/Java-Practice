
import java.util.Arrays;

public class TwoDarraySearch {
    public static void main(String[] args) {
        int [][] arr = {
        {23,4,6},
        {12,18,44,56},
        {66,9,77},
        {65,99,770},
        };
        int target = 440;
        int[] ans = search(arr, target);
        System.out.println(Arrays.toString(ans));
    }
      static int[] search(int arr[][] , int target ){
        for(int row = 0; row < arr.length; row++){
            for(int col =0; col < arr[row].length; col++){
                if(arr[row][col] == target){
                    return new int[]{row , col};
                }
            }
        }
        return new int[]{-1,-1,};
      }
    }

