package IBM_Coding_Round;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SecondLargestNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> dynamicList = new ArrayList<>();
        
        System.out.println("Enter numbers (type 'done' when finished):");
        
        while (true) {
            System.out.print("Enter a number or 'done': ");
            
            if (scanner.hasNextInt()) {
                int num = scanner.nextInt();
                dynamicList.add(num);
            } 
            else {
                String input = scanner.next();
                
                if (input.equalsIgnoreCase("done")) {
                    break;
                } 
                else {
                    System.out.println("Invalid input! Please enter a number or 'done'.");
                }
            }
        }
        
        // Close scanner
        scanner.close();
        
        // Find and display second largest
        int secondLargest = secLargestDistinct(dynamicList);
        
        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("Could not find second largest. Need at least 2 numbers.");
        } else {
            System.out.println("Second largest number is: " + secondLargest);
        }
        
        // Show the list for verification
        System.out.println("All numbers entered: " + dynamicList);
    }
    
    // Method to find second largest (with duplicates considered)
    public static int secLargest(List<Integer> list) {
        // Validation
        if (list == null || list.size() < 2) {
            return Integer.MIN_VALUE;
        }
        
        // Sort the list
        Collections.sort(list);
        
        // Return second last element
        return list.get(list.size() - 2);
    }
    
    // Alternative: Find second largest distinct number
    public static int secLargestDistinct(List<Integer> list) {
        if (list == null || list.size() < 2) {
            return Integer.MIN_VALUE;
        }
        
        // Create a new list to avoid modifying original
        List<Integer> sorted = new ArrayList<>(list);
        Collections.sort(sorted);
        
        // Find second largest (skip duplicates)
        int largest = sorted.get(sorted.size() - 1);
        
        for (int i = sorted.size() - 2; i >= 0; i--) {
            if (sorted.get(i) != largest) {
                return sorted.get(i);
            }
        }
        // All numbers are the same
        return Integer.MIN_VALUE;
    }
}