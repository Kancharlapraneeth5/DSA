package linkedList;
public class Linkedlist{
    Node head;
    Node tail;
    int length = 0;
    protected class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    // constructor
    public Linkedlist(){
        head = null;
        tail = null;
    }  
    // constructor with value 
    public Linkedlist(int value){
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length++;
    }
    // get the length of the linked list
    public int getLength(){
        if(head == null && tail == null){
            return 0;
        }else{
            return length;
        }
    }
    // get the head of the linked list
    public void getHead(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        System.out.println(head.data);
    }
    // get the tail of the linked list  
   public void getTail(){
        if(tail == null){
            System.out.println("List is empty");
            return;
        }
        System.out.println(tail.data);
    }
    // get a specific node from the linked list
    public Node getNode(int index){
        if(index < 0 || index >= length){
            throw new Error("Invalid index");
        }
        Node temp = head;

        if(head == tail){
            return temp;
        }
        else{
            for(int i = 0; i < index; i++){
                temp = temp.next;
            }
            return temp;
        }
    }
    // modify the value of a specific node in the linked list
    public boolean set(int index, int value){
        if(index < 0 || index >= length){
            throw new Error("Invalid index");
        }
        Node temp = head;
        for(int i = 0; i < index; i++){
            temp = temp.next;
        }
        temp.data = value;
        if(getNode(index).data == value){
            return true;
        }
        return false;
    }
    // insert a value at a specific index in the linked list
    public boolean insert(int index, int value){
        if(index < 0 || index > length){
            throw new Error("Invalid index");
        }
        if (index == 0){
            prepend(value);
            return true;
        }
        if (index == length){
            append(value);
            return true;
        }
        Node newNode = new Node(value);
        Node temp = head;
        for(int i = 0; i < index - 1; i++){
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        length++;

        if(getNode(index).data == value){
            return true;
        }
        return false;
    }
    // remove a value at a specific index in the linked list
    public boolean remove(int index){
        if(index < 0 || index >= length){
            throw new Error("Invalid index");
        }
        Node temp = head;
        for(int i = 0; i < index - 1; i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        length--;
        if(getNode(index).data == temp.next.data){
            return true;
        }
        return false;
    }
    // remove the first element from the linked list
    public void removeFirst(){
        // case -1
        if(head == null && tail == null){
            System.out.println("List is empty");
            return;
        }
        // case -2
        if(head == tail){
            System.out.println("the removed element is:"+ head.data);
            head = null;
            tail = null;
            length--;
            return;
        }
        // case - 3
        System.out.println("the removed element is:"+ head.data);
        head = head.next;
        length--;
    }
    // remove the last element from the linked list
    public void removeLast(){
        // case -1
        if(head == null && tail == null){
            System.out.println("List is empty");
            return;
        }
        // case -2
        if(head == tail){
            System.out.println("the removed element is:"+ tail.data);
            head = null;
            tail = null;
            length--;
            return;
        }
        // case - 3
        Node temp = head;
        while(temp.next != tail){
            temp = temp.next;
        }
        System.out.println("the removed element is:"+ temp.next.data);
        temp.next = null;
        tail = temp;
        length--;
    }
    // append the value to the linked list
    public void append(int value){
        Node newNode = new Node(value);
        if(length == 0){
            head = newNode;
            tail = newNode;
            tail.next = null;
        }else{
            tail.next = newNode;
            tail = newNode;
            tail.next = null;
        }
        length++;
    }
    // prepend the value to the linked list
    public void prepend(int value){
        Node newNode = new Node(value);
        if(length == 0){
            head = newNode;
            tail = newNode;
            tail.next = null;
        }else{
            newNode.next = head;
            head = newNode;
        }
        length++;
    }
    // reverse the linked list
    public void reverse() {
        if (head == null || head.next == null) return;  // Edge case: empty or single node list
        Node prev = null;
        Node current = head;
        Node after = null;
    
        while (current != null) {
            after = current.next;  // Store the next node
            current.next = prev;      // Reverse the link
            prev = current;           // Move prev and current one step forward
            current = after;
        }
        // After the loop, prev will be pointing to the new head
        Node temp = head;
        head = tail;
        tail = temp;
    }
    // find the middle element of the linked list, here I used  Floyd's Tortoise and Hare algorithm (please refer once again)
    public Node findMiddle(){
        Node slowNode = head;
        Node fastNode = head;

        if(length == 0 || length == 1){
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
    // find the kth node from the end of the linked list
    public Node kthNodeFromEnd(int k){
        Node kthNode;

        int indexFromStart = getLength() - (k - 1) -1;
        if(indexFromStart < 0){
            throw new Error("Invalid index");
        }
        else{
            kthNode = getNode(indexFromStart);
            return kthNode;
        }
    }
    // print the linked list
    public void print(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        while(temp !=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}