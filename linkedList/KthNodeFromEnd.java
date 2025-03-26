package linkedList;

public class KthNodeFromEnd extends Linkedlist{
    // find the kth node from the end of the linked list
    public Node kthNodeFromEnd(int k){
        Node kthNode;

        int indexFromStart = length - (k - 1) -1;
        if(indexFromStart < 0){
            throw new Error("Invalid index");
        }
        else{
            kthNode = getNode(indexFromStart);
            return kthNode;
        }
    }
}
