import java.util.Scanner;

public class Calculator {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        
        // take input from user

        int ans =0;
        while(true){
            System.out.println("Enter the operator");

            char op = in.next().trim().charAt(0);
            if( op =='+' || op == '-' || op == '*' || op =='/' || op =='%'){
                System.out.println(" enter two numbers");
                int num1 = in.nextInt();
                int num2 = in.nextInt();
                
                if(op == '+'){
                    ans = num1 + num2;
                }
                if(op == '-'){
                    ans = num1 - num2;
                }
                if(op == '*'){
                    ans = num1 * num2;
                }
                if(op == '/'){
                    if(num2 != 0){
                        ans = num1 /num2;
                    }
                }
                if(op == '%'){
                    if(num2 != 0){
                        ans = num1%num2;
                    }
                }
            }
            else if( op =='x' || op == 'X'){
                System.out.println("Exit");
                break;
            }
            else{
                System.out.println("invalid operator");
            }
            System.out.println(ans);
        }
        
    }
}