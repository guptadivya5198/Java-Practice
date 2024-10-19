import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        int[] arr = {7,4,98,46,32,56};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void reverse(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start < end){
            Swap(arr, start, end);
            start++;
            end--;
        }
    }
    static void Swap (int[] arr, int index1,int index2){
            int temp = arr[index1];
            arr[index1] = arr[index2];
            arr[index2] = temp;
        
    }
}
