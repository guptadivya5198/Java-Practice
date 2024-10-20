public class MaxNums {
    public static void main(String[] args) {
        int[] arr = {13,18,44,7,5,89};
        System.out.println(maxnums(arr));
    }
    static int maxnums(int[] arr){
        // assume array is not empty
        int ans=  arr[0];
        for(int i = 1; i <arr.length; i++){
            if( arr[i] > ans){
                 ans = arr[i];
            }
        }
        return ans;
    }
}
