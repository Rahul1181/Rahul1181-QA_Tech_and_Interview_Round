package Core_Java_Coding_Questions;

//1. Write a Java program to reverse a given string without using the StringBuffer class.
public class ReverseString {
    public static void main(String args[]){
         String name ="Vegabond";
        int stringLen = name.length();
        int index = 0; 
        char[] nameArray = new char[stringLen];
        for(int i =stringLen -1;i >= 0 ;i--){
            nameArray[index++] = name.charAt(i);
        }
        System.out.println(new String(nameArray));

        // StringBuffer stringBuffer = new StringBuffer(name);
        // System.out.println(stringBuffer.reverse().toString());
    }
    
}
