import java.util.Scanner;

public class Largestnums{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the inputs");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        
        int max = Math.max(c,(Math.max(a,b)));
        System.out.print("Max number is : " );
        System.out.println(max);
    }
}