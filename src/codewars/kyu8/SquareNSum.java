package codewars.kyu8;

import java.util.Arrays;

public class SquareNSum {


    public static void main(String[] args) {
        System.out.println(squareSum(new int[] {1,2,2}));
        System.out.println(squareSum(new int[] {1,2}));
        System.out.println(squareSum(new int[] {5, -3, 4}));
        System.out.println(squareSum(new int[] {}));
    }

    public static int squareSum(int[] n)
    {
        return Arrays.stream(n).map(i -> i*i).sum();
    }
}
