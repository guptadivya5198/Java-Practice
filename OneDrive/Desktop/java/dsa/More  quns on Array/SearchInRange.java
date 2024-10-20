

public class SearchInRange {
    public static void main(String[] args) {
        int[] nums = {18,12,3,46,-7};
        int target = -9;
        System.out.println(searchInRange(nums, target, 0,4));
    }
    static int searchInRange(int[] arr, int target,  int start, int end){
        if(arr.length ==0){
            return -1;
        }

        for(int i = start; i <= end; i++){
            int element = arr[i];
            if(element == target){
                return i;
            }
        }
        return -1;
    }
}
