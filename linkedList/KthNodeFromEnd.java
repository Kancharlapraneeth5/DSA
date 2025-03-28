package linkedList;

public class KthNodeFromEnd extends Linkedlist{
    // find the kth node from the end of the linked list
    public Node kthNodeFromEnd(Linkedlist linkedlist, int k){
        Node kthNode;

        int indexFromStart = linkedlist.length - (k - 1) -1;
        if(indexFromStart < 0){
            throw new Error("Invalid index");
        }
        else{
            kthNode = linkedlist.getNode(indexFromStart);
            return kthNode;
        }
    }
}
