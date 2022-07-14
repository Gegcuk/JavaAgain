package codewars.kyu5;

import java.util.Arrays;

public class MaximumSubarraySum {

    public static void main(String[] args) {
        System.out.println(sequence(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
        System.out.println(sequence(new int[]{-1, 15, -25, 47, -28, -40, -43, -17, -20, -23, 39, -43, -26, 25, 13}));
        System.out.println(sequence(new int[]{-18, 50, -9, 4, -37, -30, 36, -35, -43, 12, -35}));
        System.out.println(sequence(new int[]{4, 11, -11, 39, 36, 10, -6, 37, -10, -32, 44, -26, -34, 43, 43}));
    }

    public static int sequence(int[] arr) {
        int max = 0;
        for(int i = 0; i < arr.length; i++){
            int temp;
            for(int j = arr.length; j >= i; j--){
                temp = Arrays.stream(Arrays.copyOfRange(arr, i, j)).sum();
                if (temp >= max) max = temp;
            }
        }
        return max;
    }
}
