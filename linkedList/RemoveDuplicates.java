package linkedList;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates extends Linkedlist{
        public void removeDuplicates(Linkedlist linkedlist){
        // Adding the existing elements in the linkedlist to the set (which removes duplicates)
        Set<Integer> numbers = new HashSet<>();
        Node temp = linkedlist.head;
        while(temp != null){
            numbers.add(temp.data);
            temp = temp.next;
        }
        
       Node result = linkedlist.head;
       linkedlist.length = 0;
        for (Integer number : numbers) {
            Node newNode = new Node(number);
            result.next = newNode;
            result = result.next;
            linkedlist.length++;
        }
        
        if(linkedlist.head != null){
            linkedlist.head = linkedlist.head.next;
        }
        head = linkedlist.head;
        print();
    }
}
