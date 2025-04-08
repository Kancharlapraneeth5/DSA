package doublyLinkedlist;

public class ReverseDoublyLinkedlist extends DoublyLinkedlist {
    public void reverseList(DoublyLinkedlist list){
        Node temp = list.tail;
        Node prev = null;

        if (list.head == null && list.tail == null) {
            System.out.println("the list is empty");
            return;
        } 
        if (list.head.next == null) {
            System.out.println("the list has only one element");
            head = list.head;
            printList();
            return;
        }

        if (list.head != null && list.tail != null && list.head != list.tail) {
           
            System.out.println("the list has more than one element");
            while(temp.prev != null){
                temp.next = temp.prev;
                temp.prev = prev;
                prev = temp;
                temp = temp.next;
            }
            // to set the last node's prev to it's previous node.
            temp.prev = prev;
            // to break the loop and set the last node's next to null
            temp.next = null;
    
            // After the loop, swap the head and tail of the list
            Node temp_node = list.head;
            list.head = list.tail;
            list.tail = temp_node;
    
            // set the new head and tail of the list
            head = list.head;
            printList();
        }
    }
}
