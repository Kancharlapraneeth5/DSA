package queues;

public class Queues {
    private Node first;
    private Node last;
    int length = 0;

    protected class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    // constructor
    public Queues() {
        first = null;
        last = null;
    }
    // constructor with value
    public Queues(int value){
        Node newNode = new Node(value);
        first = newNode;
        last = newNode; 
        length++;
    }

    // To enqueue a value to the queue
    public void enqueue(int value){
        Node newNode = new Node(value);
        if(first == null){
            first = newNode;
            last = newNode;
        } else {
            last.next = newNode;
            last = newNode;
        }
        length++;
    }

    public Node dequeue(){
        if(first == null && last == null){
            System.out.println("Queue is empty can't dequeue element");
            return null;
        }
        Node dequeuedNode;
        if(first == last){
            dequeuedNode = first;
            first = null;
            last = null;
            length--;
            return dequeuedNode;
        }
        dequeuedNode = first;
        first = first.next;
        dequeuedNode.next = null; // Clear the next reference
        length--;
        return dequeuedNode;
    }
    // To print the values in the queue
    public void print(){
        if(first == null){
            System.out.println("Queue is empty");
            return;
        }
        Node current = first;
        while(current != null){
            System.out.println("" + current.data);
            current = current.next;
        }
    }
}
