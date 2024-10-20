public class MaxinTwoDArr {
    public static void main(String[] args) {
             int [][] arr = {
        {23,4,6},
        {12,18,44,56},
        {66,9,77},
        {65,99,770},
        };
        System.out.println(max(arr));
    }
    static int max(int arr[][]){
        int max = Integer.MIN_VALUE;
        for(int row = 0; row < arr.length; row++){
            for(int col = 0 ; col < arr[row].length; col++){
                if(arr[row][col] > max){
                    max = arr[row][col];
                }
            }
        }
        return max;
    }
}
