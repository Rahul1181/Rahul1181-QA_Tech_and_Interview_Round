package IBM_Coding_Round;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

//Sort a HashMap by values
public class SortHashmap {
    public static void main(String[] args) {
        Map<String, Integer> scores = new HashMap<>();
        scores.put("Virat", 95);
        scores.put("Rohit", 89);
        scores.put("Ishan", 56);
        scores.put("Viraj", 89);
        scores.put("Shikhar", 100);
        scores.put("Parthiu", 75);

        System.out.println("Scores in Ascending order is: " + sortByValue(scores));
        System.out.println("Scores in Ascending order is: " + sortByDesc(scores));
        
    }
    //Sort the map based on the score of each player in Ascending order
    public static Map<String, Integer> sortByValue(Map<String, Integer> playerScore){
        List<Map.Entry<String, Integer>> scoreBoard = new ArrayList<>(playerScore.entrySet());
        
        //Sort the ArrayList
        Collections.sort(scoreBoard, new Comparator<Map.Entry<String, Integer>>(){
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2){
                return o1.getValue().compareTo(o2.getValue());
            }
        });

        //Convert back the List to HashMap so we need LinkedHashMap to sort 
        Map<String, Integer> sortedScore = new LinkedHashMap<>();
        for(Map.Entry<String, Integer> entry : scoreBoard){
            sortedScore.put(entry.getKey(), entry.getValue());
        }
        
        return sortedScore;
    }
    //Sort the scores in Descending order
    public static Map<String, Integer> sortByDesc(Map<String, Integer> scores){
        List<Map.Entry<String, Integer>> listArr = new ArrayList<>(scores.entrySet());

        //Sort it in Descending order
        Collections.sort(listArr, new Comparator<Map.Entry<String, Integer>>(){
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2){
                return o2.getValue().compareTo(o1.getValue());
        }
        });

        Map<String, Integer> sortedDescMap = new LinkedHashMap<>();
        for(Map.Entry<String, Integer> entry: listArr){
            sortedDescMap.put(entry.getKey(), entry.getValue());
        }
        return sortedDescMap;
    }
    
}
