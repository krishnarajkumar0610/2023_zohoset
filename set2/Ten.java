import java.util.ArrayList;

public class Ten {
    public static void main(String[] args) {
        String[] parentheses = { "((()))", "(()())", "(())()", "()(()", "()()()" };
        for (int i = 0; i < parentheses.length; i++) {
            if (validateParenthesis(parentheses[i])) {
                System.out.println(parentheses[i] + " - Valid");
            } else {
                System.out.println(parentheses[i] + " - Invalid");
            }
        }
    }

    public static boolean validateParenthesis(String parentheses) {
        ArrayList<Character> stack = new ArrayList<>();
        
        for (int i = 0; i < parentheses.length(); i++) {
            char currentChar = parentheses.charAt(i);
            
            if (currentChar == '(') {
                stack.add('(');
            } else if (currentChar == ')') {
                if (stack.isEmpty() || stack.remove(stack.size() - 1) == ')') {
                    return false; // If stack is empty or top of stack is not matching '('
                }
            }
        }
        
        return stack.isEmpty(); // If stack is empty, all parentheses matched correctly
    }
}
