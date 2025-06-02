package stacks;

public class Main {
    public static void main(String[] args) {
        // Balancing Parentheses 
        Stacks<Character> charStack = new Stacks<>();
        BalanceParanthesis balanceParanthesis = new BalanceParanthesis();
        String str = "(())()())";
        boolean isBalanced = balanceParanthesis.isBalanced(str, charStack);
        System.out.println("Is the string \"" + str + "\" balanced? " + isBalanced);


        // Sorting a stack of integers
        Stacks<Integer> intStack = new Stacks<>();
        SortStack sortStack_obj = new SortStack();
        intStack.push(4);
        intStack.push(2);
        intStack.push(5);
        intStack.push(1);
        intStack.push(3);
        System.out.println("Original Stack:");
        intStack.print();
        sortStack_obj.sortStack(intStack);
        System.out.println("Sorted Stack:");
        intStack.print();
    }
}
