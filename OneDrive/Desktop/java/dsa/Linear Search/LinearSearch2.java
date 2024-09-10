// for linearSearch of element
public class LinearSearch2 {
    public static void main(String[] args) {
        int[] nums ={23,50,6,7,9,-5,40};
        int target =40;

        int ans =linearSearch(nums, target);
        System.out.println(ans);
    }
    static int linearSearch(int arr[],int target){
        if (arr.length ==0){
            return -1;
        }
        for(int element : arr){
              if(element == target){
                return element;
            }
        }
        return Integer.MAX_VALUE;
    }
}