import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int[] arr ={1,3,5,89,7};
        Swap(arr, 0,4);
        System.out.println(Arrays.toString(arr));
    }

    static void Swap(int[] arr, int index1, int index2){
        int temp =  arr[index1];
         arr[index1] =  arr[index2];
        arr[index2] = temp;
    }
}