package stacks;

public class BalanceParanthesisDiffParanthesis extends Stacks<Character> {
    public boolean isBalanced(String str){

        // An empty string is considered balanced
        if (str.length() == 0) {
            return true;
        }
    
        // If the string length is odd, it can't be balanced
        if (str.length() % 2 != 0) {
            return false;
        }
    
        Stacks<Character> CharStack = new Stacks<>();

        for(int i = 0; i < str.length(); i++){
            char currentChar = str.charAt(i);
            if(currentChar == '{' || currentChar == '(' || currentChar == '['){
                CharStack.push(currentChar);
            }
            if(currentChar == '}' || currentChar == ')' || currentChar == ']'){
                if(CharStack.isEmpty()){
                    return false;
                }
                char topChar = CharStack.pop();
                if((currentChar == '}' && topChar != '{') || 
                   (currentChar == ')' && topChar != '(') || 
                   (currentChar == ']' && topChar != '[')){
                    return false;
                }
            }
        }
        return CharStack.isEmpty(); // If stack is empty, all parentheses were balanced
    }
}
