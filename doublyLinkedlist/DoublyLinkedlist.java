package doublyLinkedlist;

public class DoublyLinkedlist {
        Node head;
        Node tail;
        int length = 0;
        protected class Node{
            int data;
            Node next;
            Node prev;
            Node(int data){
                this.data = data;
                this.next = null;
                this.prev = null;
            }
        }
        // constructor
        public DoublyLinkedlist(){
            head = null;
            tail = null;
        }  
        // constructor with value 
        public DoublyLinkedlist(int value){
            Node newNode = new Node(value);
            head = newNode;
            tail = newNode;
            length++;
        }
        // to get the head of the doubly linked list
        public Node getHead(){
            return head;
        }
        // to get the tail of the doubly linked list
        public Node getTail(){
            return tail;
        }
        // to get the length of the doubly linked list
        public int getLength(){
            return length;
        }
        // to add a new node at the end of the doubly linked list
        public void append(int value){
            Node newNode = new Node(value);
            if(length == 0){
                head = newNode;
                tail = newNode;
            }else{
                tail.next = newNode;
                newNode.prev = tail;
                tail = newNode;
                tail.next = null;
            }
            length++;
        }
        // to remove the last node from the doubly linkedlist
        public void removeLast(){
            Node temp = tail;
            if (length == 0){
                return;
            }
            else if(length == 1){
                temp = head;
                head = null;
                tail = null;
            }
            else{
                temp = tail;
                tail = tail.prev;
                tail.next = null;
                temp.prev = null;
            }
            length--;
            System.out.println("The removed element is: " + temp.data);
        }
        // to add a new node at the beginning of the doubly linked list
        public void prepend(int value){
            Node newNode = new Node(value);
            if(length == 0){
                head = newNode;
                tail = newNode;
            }
            else{
                newNode.next = head;
                head.prev = newNode;
                head = newNode;
            }
            length++;
        }
        // to remove the first node in the doubly linked list
        public void removeFirst(){
            Node temp;
            if(length == 0){
                return;
            }
            else if(length == 1){
               temp = head;
               head = null;
               tail = null;
            }
            else{
                temp = head;
                head = head.next;
                head.prev = null;
            }
            length--;
            System.out.println("The removed element is: " + temp.data);
        }
        // to get the node at a specific index
        public Node getNode(int index){
            Node temp;
            if(index < 0 || index >= length){
                return null;
            }
            // the below if and else increase the efficiency of the code (Optimized)..
            // if the index is less than half of the length of the list, we start from the head
            if(index < length/2){
                temp = head;
                for(int i = 0; i < index; i++){
                    temp = temp.next;
                }
            }
            // if the index is greater than half of the length of the list, we start from the tail
            else{
                temp = tail;
                for(int i = (length - 1); i > index; i--){
                    temp = temp.prev;
                } 
            }
            return temp;
        }
        // to set the value of a node at a specific index
        public boolean setNode(int index, int value){
            Node temp = getNode(index);
            if(temp != null){
                temp.data = value;
                return true;
            }
            else{
                return false;
            }
        }
        // to insert a value at a specific index in the doubly linked list
        public void insert(int index, int value){
            if(index < 0 || index > length){
                throw new Error("Invalid index");
            }
            if (index == 0){
                prepend(value);
                return;
            }
            else if (index == length){
                append(value);
                return;
            }
            else{
                Node newNode = new Node(value);
                Node before = getNode(index - 1);
                Node after = before.next;

                before.next = newNode;
                newNode.prev = before;
                newNode.next = after;
                after.prev = newNode;   
                length++;
            }
        }
        public void remove(int index){
            if(index < 0 || index >= length){
                throw new Error("Invalid index");
            }
            if(index == 0){
                removeFirst();
                return;
            }
            else if(index == length - 1){
                removeLast();
                return;
            }
            // the below removing a specific node other than head and tail can also
            // be done by using after & before nodes (refer the above insert method).
            // the below method uses only one pointer (node -- temp) to remove the node.
            else{
                Node temp = getNode(index);
                if(temp.prev != null){
                    temp.prev.next = temp.next;
                }
                if(temp.next != null){
                    temp.next.prev = temp.prev;
                }
                temp.next = null;
                temp.prev = null;
                length--;
                System.out.println("The removed element is: " + temp.data);
            }
        }
        // to print the doubly linked list
        public void printList(){
            Node temp = head;
            System.out.println();
            while(temp != null){
                System.out.println(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
}
