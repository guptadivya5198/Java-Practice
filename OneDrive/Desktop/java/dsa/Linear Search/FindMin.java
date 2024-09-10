public class FindMin {
    public static void main(String[] args) {
       int[] arr = {19,3,5,7,1,55} ;
        System.out.println(min(arr));
    }
    // lets assume array is not empty
    static int min(int[] arr){
        int ans = arr[0];
        for(int i =1; i<arr.length; i++){
            if(arr[i]<ans){
                ans = arr[i];
            }
        }
        return ans;
    }

}
