package IBM_Coding_Round;

import java.util.HashSet;
import java.util.Set;

// 2. Find Duplicate Elements in Array
public class DuplicateElementsInArray {
    public static void main(String[] args) {
        //We will use HashSet for this solution because Set stores only the unique values
        int[] arrOfNum = new int[]{1,2,1,5,6,4,8,5,9,6,3};
        Set<Integer> setOfInteger = new HashSet<>();
        for(int num: arrOfNum){
            // If block is triggered when integer is already present in the set
            if(!setOfInteger.add(num)){
                System.out.println("Duplicate elements in the array are: " + num);
            }
        }
    }
    
}
