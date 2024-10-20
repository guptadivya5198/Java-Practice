
public class LinerSearch {
    public static void main(String[] args) {
        int[] ar = {13,33,45,65,75,43,66};
        int target = 143;
        System.out.println(linerSearch(ar, target));
    }
    static int linerSearch(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }
        for( int i =0; i < arr.length; i++){
            int element = arr[i];
            if(element == target ){
                return i;
            }
        }
        return -1;
    }
}
