package codewars.kyu6;

import java.util.Arrays;

public class WriteNumberInExpandedForm {

    public static String expandedForm(int num)
    {
        StringBuilder result = new StringBuilder();
        for(int i = 0, j = String.valueOf(num).length(); i < String.valueOf(num).length(); i++, j--){
            if (Integer.parseInt(String.valueOf(String.valueOf(num).toCharArray()[i])) != 0)result.append((int) (Integer.parseInt(String.valueOf(String.valueOf(num).toCharArray()[i]))*Math.pow(10, j-1))).append(" + ");
        }
        return result.toString().replace(" + 0", "").substring(0, result.length() - 3 );
    }

    public static void main(String[] args) {
        System.out.println(expandedForm(12));
        System.out.println(expandedForm(42));
        System.out.println(expandedForm(70304));
    }

}
