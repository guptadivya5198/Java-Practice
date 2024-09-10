import java.util.Arrays;

public class SearchStrin2 {
    public static void main(String[] args) {
        String name = "Divya";
        // char target = 'y' ;
        System.out.println(Arrays.toString(name.toCharArray()));
    }
    static boolean search2(String str ,char target){
        if(str.length()==0){
            return false;
        }
        for(char ch : str.toCharArray()){
            if(ch== target){
                return true;
            }
        }
        return false;
    }
}
