package queues;

public class Main {
    public static void main(String[] args) {
        Queues queue = new Queues(7);
        queue.enqueue(10);
        queue.enqueue(15);
        queue.enqueue(20);
        queue.enqueue(25);
        queue.enqueue(30);
        queue.print();

        System.out.println("Dequeued value: " + queue.dequeue().data);
        System.out.println("Dequeued value: " + queue.dequeue().data);
        queue.print();
    }
}
