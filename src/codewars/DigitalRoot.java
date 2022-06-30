package codewars;

import java.util.Arrays;
import java.util.stream.Stream;

public class DigitalRoot {

    public static void main(String[] args) {
        System.out.println(digital_root(16));
        System.out.println(digital_root(456));
        System.out.println(digital_root(4356));
        System.out.println(digital_root(45456));
        System.out.println(digital_root(456342));
        System.out.println(digital_root(456232342));
    }


    public static int digital_root(int n) {
        int result = String.valueOf(n).chars().map(i -> Integer.parseInt(String.valueOf((char) i))).sum();
        if (String.valueOf(result).length() > 1) result = digital_root(result);
        return result;
    }



}
