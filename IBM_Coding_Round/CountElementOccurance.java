package IBM_Coding_Round;

import java.util.HashMap;
import java.util.Map;

// 1. Count Occurrence of Characters
public class CountElementOccurance{
    public static void main(String[] args){
        String fullname = "Rahul Mandal";
        Map<Character, Integer> map = new HashMap<>();
        for(char readEachChar: fullname.toCharArray() ){
         map.put(readEachChar, map.getOrDefault(readEachChar, 0) +1);
        }
        System.out.println("The occurance of each element in the string are: " + map);
    }
}