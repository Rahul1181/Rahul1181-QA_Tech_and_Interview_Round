package Core_Java_Coding_Questions;

//2. Write a program to find if a given integer or string is a palindrome.
public class Pallindrome{
    public static void main(String[] args){
        String pallindrome = "MADam";
        String temp = pallindrome.toLowerCase();
        StringBuffer stringBuffer = new StringBuffer(pallindrome);
        String ifPallindrome = stringBuffer.reverse().toString().toLowerCase();
        if(temp.equals(ifPallindrome)){
            System.out.println("It is a pallindrome ");
        }
        else{
            System.out.println("Not a pallindrome");
        }
            

    }
}
