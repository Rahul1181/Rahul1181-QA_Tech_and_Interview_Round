package IBM_Coding_Round;


//Reverse each word in a sentence
public class ReverseEachWord {
    public static void main(String[] args) {
        String sentence = "Sir Rahul Mandal";

        System.out.println("Reverse of String is:  " + new String(reverseWords(sentence)));

    }
    public static String reverseWords(String sentence){
        String [] words = sentence.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i < words.length; i++){
            sb.append(reverse(words[i]));
            if(i < words.length -1){
                sb.append(" ");
            }
        }
        return sb.toString();
    }

    public static String reverse(String word){
        char[] reverseWord = new char[word.length()];
        int index = 0;
        for(int i = word.length() - 1; i >= 0 ; i--){
            reverseWord[index++] = word.charAt(i);
        }
        return new String(reverseWord);
    }
    
}
