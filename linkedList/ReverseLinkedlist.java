package linkedList;

public class ReverseLinkedlist extends Linkedlist{
    // reverse the linked list
    public void reverse(Linkedlist linkedlist){ {
        if (linkedlist.head == null || linkedlist.head.next == null) return;  // Edge case: empty or single node list
        Node prev = null;
        Node current = linkedlist.head;
        Node after = null;
    
        while (current != null) {
            after = current.next;  // Store the next node
            current.next = prev;      // Reverse the link
            prev = current;           // Move prev and current one step forward
            current = after;
        }
        // After the loop, prev will be pointing to the new head
        Node temp = linkedlist.head;
        linkedlist.head = linkedlist.tail;
        linkedlist.tail = temp;

        head = linkedlist.head;
        linkedlist.print();
     }
   }
}
