public class Findmax {
        public static void main(String[] args) {
       int[] arr = {19,3,5,7,91,55} ;
        System.out.println(max(arr,0,3));
    }
    // lets assume array is not empty
    static int max(int[] arr,int start, int end){
        int ans = arr[0];
        for(int i =start; i<=end; i++){
            if(arr[i]>ans){
                ans = arr[i];
            }
        }
        return ans;
    }
}
