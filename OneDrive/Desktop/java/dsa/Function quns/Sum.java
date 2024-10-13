//  qun : take an input of two numbers and print the sum

import java.util.Scanner;

public class Sum{
    public static void main(String[] args){
    //    sum();
    //    int ans = sum2();
    //    System.out.println(ans);
        int ans = sum3(20,65,79);
        System.out.println(ans);
    }

    // PASS THE VALUE OF NUMBERS WHEN YOU ARE CALLING THE METHOD IN MAIN

    static int sum3(int a ,int b, int c){
        int sum = a + b + c;
        return sum;
    }
    static int sum2(){
         Scanner in = new Scanner(System.in);
        // 1st input
        System.out.print("enter your first number ");
        int num1 = in.nextInt();
        
        // 2nd input
         System.out.print("enter your second number ");
        int num2 = in.nextInt();

        // sum of numbers
        int sum = num1 + num2 ;
        return sum;
    }

    static void sum(){
         Scanner in = new Scanner(System.in);
        // 1st input
        System.out.print("enter your first number ");
        int num1 = in.nextInt();
        
        // 2nd input
         System.out.print("enter your second number ");
        int num2 = in.nextInt();

        // sum of numbers
        int sum = num1 + num2 ;
        System.out.println(sum);
    }
}