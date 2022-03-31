public class BrakeCamelCase {
    /*
    Complete the solution so that the function will break up camel casing, using a space between words.
     */

    public static String camelCase(String input) {

        char[] chars = input.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        for(char x: chars){
            if (x < 91){
                stringBuilder.append(" ").append(x);
            } else {
                stringBuilder.append(x);
            }
        }

        return stringBuilder.toString().trim();
    }

    public static String camelCaseOptimized(String input){
        return input.replaceAll("([A-Z])", " $1");
    }
}
