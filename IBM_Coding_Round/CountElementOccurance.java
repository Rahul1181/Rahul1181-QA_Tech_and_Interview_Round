package IBM_Coding_Round;

import java.util.HashMap;
import java.util.Map;

public class CountElementOccurance{
    public static void main(String[] args){
        String fullname = "Rahul Mandal";
        Map<Character, Integer> occurance = new HashMap<>();
        for(char readEachChar: fullname.toCharArray() ){
            occurance.put(readEachChar, occurance.getOrDefault(readEachChar, 0) +1);
        }
        System.out.println(occurance);
    }
}