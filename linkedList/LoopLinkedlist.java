package linkedList;

public class LoopLinkedlist extends Linkedlist{
    // create a loop in the linked list just for testing purpose
    public void createLoop(){
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = head;
    }

    // check if the linked list has a loop, here I used  Floyd's Tortoise and Hare algorithm (please refer once again)
    public boolean hasLoop(){

        Node slow = head;
	    Node fast = head;
	    
	    if(length == 0 || length == 1){
	        return false;
	    }
	    
	    else{
	        while(true){
	            slow = slow.next;
	            fast = fast.next.next;
	            
	            if(fast == null || fast.next == null){
	                return false;
	            }
	            if(fast == slow){
	                return true;
	            }
	        }
	    }
    }   
}
