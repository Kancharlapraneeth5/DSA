package stacks;

public class SortStack extends Stacks<Integer> {
    public void sortStack(Stacks<Integer> stack){
        Stacks<Integer> newStack = new Stacks<>();

        while (!stack.isEmpty()) {
            int poppedItem = stack.pop();

            while (!newStack.isEmpty() && poppedItem < newStack.peek()) {
                stack.push(newStack.pop());
            }
            newStack.push(poppedItem);
        }

        while (!newStack.isEmpty()) {
            stack.push(newStack.pop());
        }
    }
}
