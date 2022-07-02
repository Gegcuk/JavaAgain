package codewars.kyu8;

import java.util.Arrays;

public class LostWithoutMap {

    public static int[] map(int[] arr) {
        return Arrays.stream(arr).map(i -> i*2).toArray();
    }

    public static void main(String[] args) {

    }
}
