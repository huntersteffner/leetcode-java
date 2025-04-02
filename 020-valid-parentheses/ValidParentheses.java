import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {

        
        System.out.println(isValid("({[]()}[(){()}])"));
        System.out.println(isValid("({[]()}[(){())])"));
        System.out.println(isValid("()"));
        System.out.println(isValid("()[]{}"));
        System.out.println(isValid("(]"));
        System.out.println(isValid("([])"));
    }
    
    public static boolean isValid(String s) {
        
        Stack<Character> stack = new Stack<Character>();

        for (int index = 0; index < s.length(); index++) {
            if (s.charAt(index) == '(') {
                stack.push(')');
            } else if (s.charAt(index) == '[') {
                stack.push(']');
            } else if (s.charAt(index) == '{') {
                stack.push('}');
            } else {
                if (s.charAt(index) == stack.peek()) {
                    stack.pop();
                } else {
                    break;
                }
            }
        }

        return stack.empty();
    }
}
