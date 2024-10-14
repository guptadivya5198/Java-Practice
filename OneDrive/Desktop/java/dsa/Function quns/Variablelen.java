import java.util.Arrays;

public class Variablelen {
    public static void main(String[] args) {
        fun(2,3,5,78,8);
        fun2(3,67, "divya");
    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
    // multiple arguments
    static void fun2(int a, int b , String ...c){
        fun(a, b);
        System.out.println(Arrays.toString(c));
    }
}

