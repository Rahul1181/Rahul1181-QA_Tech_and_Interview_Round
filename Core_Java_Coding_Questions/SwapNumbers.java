package Core_Java_Coding_Questions;

//3. Write a Java program to swap two numbers without using a third variable.
public class SwapNumbers {
    public static void main(String[] args){
        int num1 =42;
        int num2 = 49;
        int sum = num1 + num2;
        num1 = sum - num1;
        num2 = sum - num2;
        System.out.println("New values of Num1: " + num1);
        System.out.println("New values of Num2: " + num2);

    }
    
}
