package Core_Java_Coding_Questions;

import java.util.Scanner;

//3. Write a Java program to swap two numbers without using a third variable.
public class SwapNumbers {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 2 numbers: ");
        int value1 = scanner.nextInt();
        int value2 = scanner.nextInt();

        // System.out.println("Swapping values using Arithmetic Operators " );
        // swapUsingArithmeticOperators(value1, value2);
        System.out.println("Swapping value using XOR: ");
        swapUsingXOR(value1, value2);
        scanner.close();

    }
    public static void swapUsingArithmeticOperators(int num1, int num2){
        
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        System.out.println("New values of Num1: " + num1);
        System.out.println("New values of Num2: " + num2);
    }

    public static void swapUsingXOR(int num1, int num2){
        //It acts as adding num1 and num2
        num1 = num1^num2;
        //It is like subtraction of num1 - num2
        num2 = num1 ^ num2;
        //It is like subtraction of num1 - num2(updated)
        num1 = num1 ^ num2;
        System.out.println("New values of Num1: " + num1);
        System.out.println("New values of Num2: " + num2);


    }
}
