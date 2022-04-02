import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Spliterator;

public class FirstJavaClass{

    public static void main(String[] args) {

        System.out.println(BrakeCamelCase.camelCase("testStringThreeWords"));
        System.out.println(VowelCount.getCount("hello"));
        System.out.println(VowelCount.getCountOptimized("hello"));
        System.out.println(FindTheOddInt.findIt(new int[]{20,1,-1,2,-2,3,3,5,5,1,2,4,20,4,-1,-2,5}));


    }
}
