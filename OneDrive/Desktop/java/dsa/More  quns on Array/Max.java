public class Max {
    public static void main(String[] args) {
        int[] arr = {1,4,23,79,115};
        System.out.println(max(arr));
    }
   static int max(int[] arr){
    int maxVal = arr[0];
    for(int i =1; i< arr.length ; i++){
        if(maxVal < arr[i]){
            maxVal = arr[i];
        }
    }
    return maxVal;
   }
}
