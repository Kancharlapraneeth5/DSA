package doublyLinkedlist;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedlist list = new DoublyLinkedlist();
        
        list.append(10);
        list.append(15);
        list.append(20);
        list.append(25);

        // list.printList();
        // System.out.println("The length of the doubly linked list is: " + list.getLength());

        // list.removeLast();
        // list.printList();

        // list.prepend(100);
        // list.printList();

        // list.removeFirst();
        // list.printList();

        // System.out.println("The node at the specific index is: " + list.getNode(0).data);

        // System.out.println("Setting node at the specific index is ..." + list.setNode(20, 65));
        // list.printList();

        list.insert(list.getLength(), 35);
        list.printList();

        list.remove(list.getLength() - 1);
        list.printList();
    }
}
