public class Minimumnums {
    public static void main(String[] args) {
        int[] arr = {13,18,44,7,5,89};
        System.out.println(minimum(arr));
    }
    static int minimum(int[] arr){
        // assume arr is not empty
        int ans = arr[0];
        for(int i = 1; i<arr.length; i++){
            if(arr[i] < ans){
                ans = arr[i];
            }
        }
        return ans;
    }
}
