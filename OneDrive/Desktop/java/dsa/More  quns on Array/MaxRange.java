public class MaxRange {
    public static void main(String[] args) {
        int[] arr ={1,4,6,9,2};
        System.out.println(maxRange(arr, 2 ,4));
    }
    static int maxRange (int[] arr, int start , int end){
        int maxval = arr[start];
        for(int i = start; i<end; i++){
            if(arr[i]> maxval){
                maxval = arr[i];
            }
        }
        return maxval;
    }
}
