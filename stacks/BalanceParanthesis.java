package stacks;

import java.util.Stack;

public class BalanceParanthesis extends Stacks<Character> {
    public boolean isBalanced(String str, Stack<Character> charStack) {
        // An empty string is considered balanced
        if (str.length() == 0) {
            return true;
        }
    
        // If the string length is odd, it can't be balanced
        if (str.length() % 2 != 0) {
            return false;
        }
    
        // Push each character into the stack
        for (int i = 0; i < str.length(); i++) {
            charStack.push(str.charAt(i));
        }
    
        // If the top element is an opening parenthesis, it's an invalid ending
        if (charStack.peek() == '(') {
            return false;
        }
    
        int openParan = 0;
        int closedParan = 0;
    
        // Count open and closed parentheses
        while (!charStack.isEmpty()) {
            if (charStack.pop() == '(') {
                openParan++;
            } else {
                closedParan++;
            }
        }
    
        // Balanced only if counts are equal
        return openParan == closedParan;
    }
}
