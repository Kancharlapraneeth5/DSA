package linkedList;

public class ReverseBetween extends Linkedlist{
    public void reverseBetweenLinkedlist(Linkedlist linkedlist, int m, int n){
        Node startNode;
        Node endNode; 
        Node afterEndNode;
        Node beforeStartNode;
        if(m < 0 || n > linkedlist.length || m > n){
            throw new Error("Invalid index");
        }
        // setting the startNode
        if(m == 0){
            startNode = linkedlist.head;
        }
        else{
            startNode = linkedlist.getNode(m);
        }
        // setting the endNode
        if(n == linkedlist.length - 1){
            endNode = linkedlist.tail;
        }
        else{
            endNode = linkedlist.getNode(n);
        }
        // setting the beforeStartNode
        if(startNode != linkedlist.head){
            beforeStartNode = linkedlist.getNode(m - 1);
            beforeStartNode.next = null; // Break the link to the rest of the list
        }
        else{
            beforeStartNode = null;
        }
        // setting the afterEndNode 
        if(endNode != linkedlist.tail){
            afterEndNode = endNode.next;
            endNode.next = null; // Break the link to the rest of the list
        }
        else{
            afterEndNode = null;
        }
        
        // Reverse the linked list from m to n
        Node prev = null;
        Node current = startNode;
        Node after = null;
    
        while (current != null) {
            after = current.next;  // Store the next node
            current.next = prev;      // Reverse the link
            prev = current;           // Move prev and current one step forward
            current = after;
        }

        // Case - 1: m = 0 and n = length - 1 (head and tail)
        if(beforeStartNode == null && afterEndNode == null){
            linkedlist.head = endNode;
            linkedlist.tail = startNode;
        }
        // Case - 2: m = 0 and n != length - 1 (head, beforeTail)
        else if(beforeStartNode == null && afterEndNode != null){
            linkedlist.head = endNode;
            startNode.next = afterEndNode;
        } 
        // Case - 3: m != 0 and n = length - 1 (afterHead, tail)
        else if(beforeStartNode != null && afterEndNode == null){
            beforeStartNode.next = endNode;
            linkedlist.tail = startNode;
        }
        // Case - 4: m != 0 and n != length - 1 (afterHead, beforeTail)
        else{
            beforeStartNode.next = endNode;
            startNode.next = afterEndNode;
        }
        linkedlist.print();
    }
}
