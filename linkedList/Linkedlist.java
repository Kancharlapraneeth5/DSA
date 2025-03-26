package linkedList;
public class Linkedlist {
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

    // print the linked list from a specific node
    public void printListFromSpecificNode(Node node){
        Node temp = node;
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
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