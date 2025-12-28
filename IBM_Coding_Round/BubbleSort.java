package IBM_Coding_Round;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = {1,5,8,7,9,2,4,3};
        bubbleSort(arr);
        
    }
    public static void bubbleSort(int [] arr){
        
        for(int i=0;i< arr.length;i++){
            for(int j =0;j<arr.length - i -1;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.print("Sorted array using Bubble sort: ");
        for(int i =0;i< arr.length;i++){
            System.out.print(arr[i] + ", ");
        }
    } 
    
}
