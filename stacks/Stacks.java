package stacks;

import java.util.ArrayList;

public class Stacks<T> {
    private ArrayList<T> stackList;
    private int length;

    // Default constructor
    public Stacks() {
        stackList = new ArrayList<>();
        length = 0;
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return stackList.size() == 0;
    }

    // Constructor with an initial value
    public Stacks(T value) {
        stackList = new ArrayList<>();
        stackList.add(value);
        length = 1;
    }

    // Push a value onto the stack
    public void push(T value) {
        stackList.add(value); // Add to end (top of stack)
        length++;
    }

    // Pop a value from the stack
    public T pop() {
        if (stackList.isEmpty()) {
            System.out.println("The stack is empty; can't pop element.");
            throw new RuntimeException("Stack is empty");
        } else {
            T poppedValue = stackList.remove(stackList.size() - 1); // Remove last element
            length--;
            return poppedValue;
        }
    }

    // Peek at the top value of the stack without removing it
    public T peek() {
        if (stackList.isEmpty()) {
            System.out.println("The stack is empty; can't peek element.");
            throw new RuntimeException("Stack is empty");
        } else {
            return stackList.get(stackList.size() - 1); // Return last element without removing it
        }
    }

    // Print the values in the stack
    public void print() {
        if (stackList.isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            for (int i = stackList.size() - 1; i >= 0; i--) {
                System.out.print(stackList.get(i) + " ");
            }
            System.out.println();
        }
    }

    // Optional: Get the size of th
}