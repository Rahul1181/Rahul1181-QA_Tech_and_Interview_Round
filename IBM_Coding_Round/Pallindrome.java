package IBM_Coding_Round;

public class Pallindrome {
    public static void main(String[] args){
        String str = "baaaaaaabciiiid";
        int length =0;
        int maxlength =Integer.MIN_VALUE;
        for(char ch: str.toCharArray()){
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch =='u'){
                length++;
                if(maxlength < length){
                    maxlength = length;
                }
            }
            else{
                length =0;
            }
        }
        System.out.println(maxlength);
    }
    
}
