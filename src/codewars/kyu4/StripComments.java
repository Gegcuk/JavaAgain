package codewars.kyu4;

import java.util.Arrays;

public class StripComments {

    public static String stripComments(String text, String[] commentSymbols) {
        if(text.isBlank()) return "";
        String[] temp = text.split("\n");
        Arrays.sort(commentSymbols);
        StringBuilder stringBuilder = new StringBuilder();
        for(String string: temp){
            if (string.startsWith(" ") && string.length() > 1){
                stringBuilder.append(" ");
            }
            int counter = 0;
            for(String comment: commentSymbols){
                if (string.contains(comment)) {
                    stringBuilder.append(string.substring(0, string.indexOf(comment)).trim()).append("\n");
                    counter++;
                }
            }
            if(counter == 0){
                stringBuilder.append(string.trim()).append("\n");
            }

        }
        return stringBuilder.substring(0, stringBuilder.length()-1);
    }


    public static void main(String[] args) {
        System.out.println(stripComments( "a #b\nc\nd $e f g", new String[] { "#", "$" } ));
        System.out.println(stripComments( "apples, pears # and bananas\ngrapes\nbananas !apples", new String[] { "#", "!" } ));
        System.out.println(stripComments( " ", new String[] { "#", "!" } ));
    }
}
