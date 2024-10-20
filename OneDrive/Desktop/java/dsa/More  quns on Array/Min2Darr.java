public class Min2Darr {
   public static void main(String[] args) {
            int [][] arr = {
        {23,4,6},
        {12,18,44,56},
        {66,9,77,0},
        {65,99,770},
        };
        System.out.println(min(arr));
    }
    static int min(int arr[][]){
        int min= Integer.MAX_VALUE;
        for(int row = 0; row < arr.length; row++){
            for(int col = 0 ; col < arr[row].length; col++){
                if(arr[row][col] < min){
                    min = arr[row][col];
                }
            }
        }
        return min;
   } 
}
