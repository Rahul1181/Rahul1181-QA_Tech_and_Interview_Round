package IBM_Coding_Round;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int prime = Integer.MIN_VALUE;
        try{
            System.out.println("Enter a number: ");
            prime = sc.nextInt();

        }catch(InputMismatchException e){
            System.out.println("Error: Please enter a valid input");
            sc.next();
            
        }
        
        if(prime < 0){
            System.out.println("Prime cannot be negative number");
        }
        else if(primeOrNot(prime)){
            System.out.println("It is a prime number");
        }
        else{
            System.out.println("It is not a prime number");
        }
        sc.close();
    }
    public static boolean primeOrNot(int primeNum){
        //Edge cases
        if(primeNum == 1 || primeNum == 0){
            return false;
        }
        else if(primeNum == 2){
            return true;
        }
        else if(primeNum < 0){
            return false;
        }

        //Iterate to find if "i" can divide primeNum 
        for(int i =2 ; i<= primeNum/2 ;i++ ){
            if(primeNum%i == 0){
                return false;
            }
        }
        return true;
    } 
    
}
