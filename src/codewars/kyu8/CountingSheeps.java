package codewars.kyu8;

public class CountingSheeps {

    public static void main(String[] args) {
        System.out.println(countingSheep(0));
        System.out.println(countingSheep(1));
        System.out.println(countingSheep(2));
        System.out.println(countingSheep(3));
    }

    public static String countingSheep(int num) {
        StringBuilder result = new StringBuilder();
        if(num > 0) {
            for(int i = 1; i <= num; i++){
                result.append(i + " sheep...");
            }
        } else {
            return "";
        }
        return result.toString();
    }
}
