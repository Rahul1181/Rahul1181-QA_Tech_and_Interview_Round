package IBM_Coding_Round;

//Find missing number in an array (1–N)
public class MissingNumber {
    public static void main(String[] args) {
        int[] arrNum = new int[]{1,2,3,5,4,6,8,7};
        System.out.println("Missing element is: " + missing(arrNum));
    }
    public static int missing(int[] arrNum){
        int lengthOfArr = arrNum.length;
        int sum =0;
        int iterate=0;
        int largest = Integer.MIN_VALUE;
        if(arrNum.length <= 1){
            return arrNum[0]+1;
        }
        else if(arrNum.length ==1 && arrNum[0] ==2){
            return 1;
        }
        for(int i =0;i< lengthOfArr;i++){
            sum+=arrNum[i];
        }
        //Find the largest number
        for(int i =0;i<lengthOfArr;i++){
            if(largest < arrNum[i]){
                largest =arrNum[i];
            }
        }
        for(int i =1;i<=largest;i++){
            iterate+=i;
        }
        if(iterate - sum > 0){
            return iterate - sum;
            
        }
            return largest+1;
       
    }

    
}
