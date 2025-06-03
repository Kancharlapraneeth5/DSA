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

        // Queue implementation using two stacks
        QueueWithStacks queueWithStacks = new QueueWithStacks();
        queueWithStacks.enqueue(10);
        queueWithStacks.enqueue(20);
        queueWithStacks.enqueue(30);
        System.out.println("Queue after enqueuing 10, 20, 30:");
        queueWithStacks.print();
        System.out.println("Dequeued value: " + queueWithStacks.dequeue());
        System.out.println("Queue after dequeue:");
        queueWithStacks.print();

    }
}
