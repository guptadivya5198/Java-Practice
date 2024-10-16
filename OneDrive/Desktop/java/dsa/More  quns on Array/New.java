import java.util.Arrays;

public class New {
    public static void main(String[] args) {
        int[] arr = {1,4,7,8};
        // System.out.println(Arrays.toString(arr));
        change(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void change( int[] nums){
        nums[0] = 99;
    }
}
