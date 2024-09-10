public class SearchInrange {
    public static void main(String[] args) {
          int[] nums ={23,50,6,7,9,-5,40};
        int target =9;

        int ans =linearSearchInRange(nums, target,3,6);
        System.out.println(ans);
    }
    static int linearSearchInRange(int arr[],int target,int start ,int end){
        if (arr.length ==0){
            return -1;
        }
        for(int i =start; i <= end; i++){
            int element = arr [i];
            if(element == target){
                return i;
            }
        }
        return -1;
    
    }
}
