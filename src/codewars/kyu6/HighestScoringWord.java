package codewars.kyu6;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class HighestScoringWord {

    static Map<Character, Integer> letterScore = new HashMap<>();


    static {
        for(int i = 97, j = 1; i < 123; i++, j++){
            letterScore.put((char) i, j);
        }

    }

    public static void main(String[] args) {
        high("aa b");
        high("b aa");
        high("bb d");
        high("aaa b");
        high("what time are we climbing up to the volcano");

    }


    public static String high(String s) {
        String result = "";
        String[] words = s.split(" ");
        Map<String, Integer> wordsScoreMap = new HashMap<>();
        for(String w: words){
            wordsScoreMap.put(w, countScore(w));
        }

        Integer max = wordsScoreMap.values().stream().max(Integer::compare).get();

        for (String str: words) {
            if (wordsScoreMap.get(str) == max){
                result = str;
                break;
            }
        }
        return result;
    }

    private static Integer countScore(String w) {
        int score = 0;
        char[] charArray = w.toCharArray();
        for(char c: charArray){
            score+=letterScore.get(c);
        }
        return score;
    }

    public static String highOptimized(String s){
        return Arrays.stream(s.split(" ")).max(Comparator.comparingInt(value -> value.chars().map(i -> i-96).sum())).get();
    }
}
