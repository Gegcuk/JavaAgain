import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Spliterator;

public class FirstJavaClass{

    public static void main(String[] args) {

        System.out.println(BrakeCamelCase.camelCase("testStringThreeWords"));
        System.out.println(VowelCount.getCount("hello"));
        System.out.println(VowelCount.getCountOptimized("hello"));

    }
}
