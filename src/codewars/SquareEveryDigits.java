package codewars;

import javax.swing.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Stream;

public class SquareEveryDigits {

    public static void main(String[] args) {
        squareDigits(9119);
    }

    public static int squareDigits(int n) {

        String nstr = String.valueOf(n);
        char[] nchararr = nstr.toCharArray();
        int[] narr = new int[nchararr.length];
        for(int i = 0; i < narr.length; i++){
            narr[i] = (int) Math.pow(Double.parseDouble(Character.toString(nchararr[i])), 2);
        }
        StringBuilder resString = new StringBuilder();
        for (int x: narr
             ) {resString.append(x);

        }

        return Integer.parseInt(resString.toString());
    }

    public static int squareDigitsOptimized(int n){
        return 0;
    }

}
