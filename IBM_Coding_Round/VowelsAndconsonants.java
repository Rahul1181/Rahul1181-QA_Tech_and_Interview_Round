package IBM_Coding_Round;

//Count vowels and consonants in a String
public class VowelsAndconsonants{
    public static void main(String[] args) {
        String str = "RahulMandal";
        System.out.println("Vowels in the String are: " + vowel(str));
        System.out.println("Consonant in the String are: " + consonant(str));
    }
    public static int vowel(String vowels){
        int vowelCount=0;
        char[] vowelArr = vowels.toCharArray();
        for(char ch: vowelArr){
            if(ch == 'a' || ch == 'e' || ch== 'i' || ch == 'o' || ch== 'u' || ch == 'A' || ch == 'E' || ch== 'I' || ch == 'O' || ch== 'U'){
                vowelCount++;
            }
        }
        return vowelCount;
    }
    public static int consonant(String consonants){
        int consonantCount =0;
        char[] consonantArr = consonants.toCharArray();
        for(char ch: consonantArr){
            if(ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u' && ch != 'A' && ch != 'E' && ch != 'I' && ch != 'O' && ch != 'U'){
                consonantCount++;
            }
        }
        return consonantCount;
    }
}