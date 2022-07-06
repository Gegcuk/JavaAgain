package codewars.kyu7;

import java.util.Arrays;
import java.util.stream.Collectors;

public class JadenCasingStrings {

    public static void main(String[] args) {
        System.out.println(toJadenCase("hello world!"));

    }

    public static String toJadenCase(String phrase) {

        if(phrase!=null && !phrase.equals("")){
            return Arrays.stream(phrase.split(" ")).map(i -> i.substring(0,1).toUpperCase() + i.substring(1)).collect(Collectors.joining(" "));
        }
        return null;
    }
}
