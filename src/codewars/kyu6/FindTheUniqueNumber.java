package codewars.kyu6;

import java.util.Arrays;

public class FindTheUniqueNumber {

    public static void main(String[] args) {
        System.out.println(findUniq(new double[]{0, 1, 0}));
        System.out.println(findUniq(new double[]{1, 1, 1, 2, 1, 1}));

    }

    public static double findUniq(double arr[]) {
        if(arr[0] != arr[arr.length-1]){
            if (arr[0] == arr[1]) return arr[arr.length-1];
            else return arr[0];
        } else {
            for (double v : arr) {
                if (v != arr[0]) return v;
            }
        }
        return arr[0];
    }

    public static double findUniqOptimized1(double arr[]){
        Arrays.sort(arr);
        return arr[0] == arr[1] ? arr[arr.length-1] : arr[0];
    }

}
