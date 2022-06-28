import java.util.Arrays;
import java.util.Collections;

import static java.util.stream.IntStream.of;

public class MissingInArithmeticProgression {
    public static void main(String[] args) {
        findMissing(new int[]{ 1, 3, 4});
        findMissing(new int[]{ 1, 2, 4});
        findMissing(new int[]{ 4, 2, 1});
        findMissing(new int[]{ 4, 3, 1});
        findMissing(new int[]{ 4, 2, 1});
        findMissing(new int[]{ 1, 1, 1});
        findMissingOptimised(new int[]{ 4, 3, 1});
    }

    public static int findMissing(int[] numbers)
    {
        int diff= 0;
        int[] temp = new int[numbers.length];

        if(numbers[1] < numbers[0]){
            for(int i = 0, j = numbers.length-1; i < numbers.length; i++, j--){
                temp[i] = numbers[j];
            }
            numbers = temp;
        }


        for(int i = 1; i < numbers.length-1; i++){
            if (numbers[i] - numbers[i-1] == numbers[i+1] - numbers[i]){
                diff = numbers[i] - numbers[i-1];
                break;
            } else if(numbers[i] - numbers[i-1] < numbers[i+1] - numbers[i]){
                    diff = numbers[i] - numbers[i-1 ];
                    break;
                }
            else {
                diff = numbers[i + 1] - numbers[i];
                break;
            }
        }

        for(int i = 1; i < numbers.length; i++){
            if (numbers[i] - numbers[i-1] != diff){
                System.out.println("Diff = " + diff);
                System.out.println(numbers[i] - diff);
                return numbers[i] - diff;
            }
        }

        return numbers[0];
    }

    public static int findMissingOptimised(int[] numbers){
        System.out.println(of(numbers).sum());
        return (numbers[0] + numbers[numbers.length - 1]) * (numbers.length + 1)/2 - of(numbers).sum();
    }
}
