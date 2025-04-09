package doublyLinkedlist;

public class SwapAdjacentNodePairs extends DoublyLinkedlist{
    public void swapAdjacentNodePairs(DoublyLinkedlist list){
        if(list.head == null && list.tail == null) {
            System.out.println("the list is empty");
            return;
        }
        if(list.head.next == null) {
            System.out.println("the list has only one element");
            head = list.head;
            printList();
            return;
        }

        Node temp_1 = list.head;
        Node temp_2 = temp_1.next;
        
        if(list.head != null && list.tail != null && list.head != list.tail){
            System.out.println("the list has more than one element");
            while(temp_1 != null && temp_1.next != null){
                // swap the temp_1 and temp_2 nodes
                temp_1.next = temp_2.next;
                temp_2.next = temp_2.prev;
                temp_2.prev = temp_1.prev;
                temp_1.prev = temp_2;

                // connecting the swapped nodes to the rest of the list
                if(temp_1.next != null) {
                    temp_1.next.prev = temp_1;
                }   
                // connecting the swapped nodes to the rest of the list
                if(temp_2.prev != null) {
                    temp_2.prev.next = temp_2;
                }
                // increment the temp_1 and temp_2 pointers to the next pair of nodes
                if(temp_1.next != null) {
                    temp_1 = temp_1.next;
                    temp_2 = temp_1.next;
                } 
            }
            // setting the new head.
            head = list.head.prev;
            System.out.println("the new head is: " + head.data);
            printList();
        }
    }
}
