import java.util.Scanner;

public class ArmStrongNum {
    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
        System.out.println("enter your number");
        int n = in.nextInt();
        System.out.println(isArmStrong(n));

        //all 3 digit armstrong numbers are 
        System.out.print("all 3 digit armstrong numbers are: ");
        for (int i = 100; i< 1000; i++){
            if(isArmStrong(i)){
                System.out.print(i + " ");
            }
        }
    }
      static boolean isArmStrong(int n){
        int origional =  n;
        int sum = 0;
        while(n > 0){
            int rem = n % 10; 
             n = n/10;
             sum = sum + rem*rem*rem;
        }
        return sum == origional;
      }
}
