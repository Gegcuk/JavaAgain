package codewars.kyu5;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SimplePigLatin {

    public static void main(String[] args) {
        System.out.println(pigIt("Pig latin is cool"));
        System.out.println(pigIt("This is my string !"));
        System.out.println(pigIt("Acta est fabula"));
        System.out.println(pigIt("This is my string !"));
    }


    public static String pigIt(String str) {
        String resultString = Arrays.stream(str.split(" ")).map(i -> i.substring(1) + i.charAt(0) + "ay").collect(Collectors.joining(" "));
        System.out.println(resultString.charAt(str.length()-3));
        if(Character.isAlphabetic(str.charAt(str.length()-1))){
            return resultString;
        } else {
            return resultString.substring(0, resultString.length()-2);
        }
    }

}
