import java.util.Arrays;

public class VowelCount {
    /*
    Return the number (count) of vowels in the given string.

    We will consider a, e, i, o, u as vowels for this Kata (but not y).

    The input string will only consist of lower case letters and/or spaces.
     */



    public static int getCount(String str) {
        int vowelsCount = 0;
        for(char x: str.toCharArray()){
            if (x =='a'|| x == 'e' || x == 'i' || x == 'o' || x == 'u'){
                vowelsCount++;
            }
        }
        return vowelsCount;
    }

    public static int getCountOptimized(String str){
        return (int) str.chars().filter(c -> "aouie".indexOf(c) >= 0).count();
    }
}
