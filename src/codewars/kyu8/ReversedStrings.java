package codewars.kyu8;

public class ReversedStrings {

    public static void main(String[] args) {
        System.out.println(Kata.solution("drow"));
    }
}

class Kata {

    public static String solution(String str) {

        return new StringBuilder(str).reverse().toString();
    }

}