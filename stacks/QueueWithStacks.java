package stacks;

import java.util.Stack;

public class QueueWithStacks {
 
    private Stack<Integer> stack1;
    private Stack<Integer> stack2;

    public QueueWithStacks() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    // the below method is used to enqueue an element into the queue with stacks
    public void enqueue(int value) {
        stack1.push(value);
    }

    // the below method is used to dequeue an element from the queue with stacks
    public Integer dequeue(){
        if(stack1.isEmpty() && stack2.isEmpty()){
            return null;
        }
        shiftStacks();
        return stack2.pop();
    }

    // To get the front element of the queue without removing it
    public Integer peek() {
        if(stack1.isEmpty() && stack2.isEmpty()){
            return null;
        }
        shiftStacks();
        return stack2.peek();
    }

    // Tp print the elements in the queue (stack implementation)
    public void print() {
        if(stack1.isEmpty() && stack2.isEmpty()){
            System.out.println("Queue is empty");
            return;
        }
        else {
            shiftStacks();
            for (int i = stack2.size() - 1; i >= 0; i--) {
                System.out.print(stack2.get(i) + " ");
            }
            System.out.println();
        }
    }
    
    // To shift the elements from stack1 to stack2
    public void shiftStacks(){
        while(!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
    }
}
