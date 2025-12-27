package Core_Java_Coding_Questions;

//1. Write a Java program to reverse a given string without using the StringBuffer class.
public class ReverseString {
    public static void main(String args[]){
         String name ="Vegabond";
        // int stringLen = name.length();
        // int index = 0; 
        // char[] nameArray = new char[stringLen];
        // for(int i =stringLen -1;i >= 0 ;i--){
        //     nameArray[index++] = name.charAt(i);
        // }
        // System.out.println(new String(nameArray));


        //2nd method to reverse a String
        // StringBuffer stringBuffer = new StringBuffer(name);
        // System.out.println(stringBuffer.reverse().toString());


        //3rd method (Recursion)
        System.out.println("String Reverse is " + reverseStr("IBM"));
    }
    //3rd method to reverse a String (Recursion)
    public static String reverseStr(String fullname){
        //Edge cases
        if(fullname.isEmpty() || fullname.length() == 1){
            return fullname;
        }
        //Everytime function is called it will capture 1 element and add it with 0th element and the string is reducing at every iteration
        return reverseStr(fullname.substring(1)) + fullname.charAt(0);
    }
    
}
