public class Maximum {
    public static void main(String[] args) {
        int[] arr= {1,3,9,5,78};
        System.out.println(max(arr));
    }
    // imagine arr in not empty
     static int max( int[] arr){
        int maxVal = arr[0];
        for(int i = 0 ; i<arr.length; i++){
            maxVal= arr[i];
        }
        return maxVal;
    }
}
