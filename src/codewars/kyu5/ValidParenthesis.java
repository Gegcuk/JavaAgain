package codewars.kyu5;

public class ValidParenthesis {

        public static void main(String[] args) {
            System.out.println(validParentheses("()"));
            System.out.println(validParentheses(")(()))"));
            System.out.println(validParentheses("("));
            System.out.println(validParentheses("(())((()())())"));
            System.out.println(validParentheses("())("));
            System.out.println(validParentheses("())L()((7)i0"));
        }

        public static boolean validParentheses(String parens)
        {
            char[] charArray = parens.toCharArray();
            int count = 0;

            for(char c: charArray){
                    if (c == ('(')) count++;
                    if (c == (')'))count--;
                    if (count < 0) return false;
            }
            return count == 0;
        }

}
