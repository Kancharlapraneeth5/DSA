package stacks;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        // Declare a stack of Integers
        // Stacks<Integer> stack = new Stacks<>(5);

        // stack.push(10);
        // stack.push(15);
        // stack.push(20);
        // stack.push(25);

        // stack.print();

        // System.out.println("\nPopped value: " + stack.pop());
        // stack.print();

        // // Declare a stack of strings
        // Stacks<String> stringStack = new Stacks<>("Hello");
        // stringStack.push("World");
        // stringStack.push("Java");
        // stringStack.push("Stacks");

        // stringStack.print();

        // System.out.println("\nPopped value: " + stringStack.pop());

        // stringStack.print();

        Stack<Character> charStack = new Stack<>();
        BalanceParanthesis balanceParanthesis = new BalanceParanthesis();
        String str = "(())()()";
        boolean isBalanced = balanceParanthesis.isBalanced(str, charStack);
        System.out.println("Is the string \"" + str + "\" balanced? " + isBalanced);
    }
}
