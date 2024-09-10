// for linearSearch of index
public class Search {
    public static void main(String[] args) {
        int[] nums ={23,50,6,7,9,-5,40};
        int target =49;

        int ans =linearSearch(nums, target);
        System.out.println(ans);
    }
    static int linearSearch(int arr[],int target){
        if (arr.length ==0){
            return -1;
        }
        for(int i =0; i <arr.length; i++){
            int element = arr [i];
            if(element == target){
                return i;
            }
        }
        return -1;
    }
}