import java.util.Scanner;

public class Primenum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter your number");
        int n = in.nextInt();
        System.out.println(isPrime(n));
    }
    static boolean isPrime(int n){
            if(n <= 1){
                return false;
            }
            int c =2 ;
            while (c*c <= n) {
                if(n % c == 0){
                    return false;
                }
                c++;
            }
           return  c * c > n;
    }
}
