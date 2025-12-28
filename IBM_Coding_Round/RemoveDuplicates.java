package IBM_Coding_Round;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

//Remove duplicate elements from a list
public class RemoveDuplicates {
    public static void main(String[] args) {
        int [] arrNum = {1,2,3,9,8,7,7,5,4,5};
        System.out.println("List of unique elements are: " + remDuplicates(arrNum));
        System.out.println("List of unique elements are: " + remDuplicatePreserveOrder(arrNum));
        
    }
    //You have to assign the Set type as well 
    public static Set<Integer> remDuplicates(int [] arrNum){
        Set<Integer> set = new HashSet<>();
        for(int eachElement : arrNum){
            set.add(eachElement);
        }
        return set;
    }
    
    //This method preserve the order of the Array
    public static Set<Integer> remDuplicatePreserveOrder(int [] arrNum){
        Set<Integer> set = new LinkedHashSet<>();
        for(int eachElement : arrNum){
            set.add(eachElement);
        }
        return set;
    }
    
}
