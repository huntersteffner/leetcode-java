import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {

        System.out.println(isValid("()))"));
        System.out.println(isValid("(){}}{"));
        System.out.println(isValid("({[]()}[(){()}])"));
        System.out.println(isValid("({[]()}[(){())])"));
        System.out.println(isValid("()"));
        System.out.println(isValid("()[]{}"));
        System.out.println(isValid("(]"));
        System.out.println(isValid("([])"));
    }
    
    public static boolean isValid(String s) {
        
        Stack<Character> stack = new Stack<Character>();

        if (s.charAt(0) == ')' || s.charAt(0) == ']' || s.charAt(0) == '}') {
            return false;
        }

        for (int index = 0; index < s.length(); index++) {
            if (s.charAt(index) == '(') {
                stack.push(')');
            } else if (s.charAt(index) == '[') {
                stack.push(']');
            } else if (s.charAt(index) == '{') {
                stack.push('}');
            } else if(stack.isEmpty() || stack.pop() != s.charAt(index)) {
                return false;
            }
        }

        return stack.empty();
    }
}
