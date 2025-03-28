package linkedList;

public class MiddleElement extends Linkedlist{
    // find the middle element of the linked list, here I used  Floyd's Tortoise and Hare algorithm (please refer once again)
    public Node findMiddle(Linkedlist linkedlist){
        Node slowNode = linkedlist.head;
        Node fastNode = linkedlist.head;

        if(linkedlist.length == 0 || linkedlist.length == 1){
            return null;
        }
        else{
            while(fastNode != null && fastNode.next != null){
                slowNode = slowNode.next;
                fastNode = fastNode.next.next;
            }
            return slowNode;
        }
    }
 
}
