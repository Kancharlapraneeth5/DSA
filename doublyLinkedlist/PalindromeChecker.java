package doublyLinkedlist;

public class PalindromeChecker extends DoublyLinkedlist {
    public boolean isPalindrome(DoublyLinkedlist list) {
        Node temp_start = list.head;
        Node temp_end = list.tail;

        if (list.head == null && list.tail == null) {
            System.out.println("the list is empty");
            return true;
        }
        if (list.head.next == null) {
            System.out.println("the list has only one element");
            return true;
        }
        if (list.head != null && list.tail != null && list.head != list.tail){
            System.out.println("the list has more than one element");
            // temp_start != temp_end to check if the list has odd number of elements
            // temp_end.next != temp_start to check if the list has even number of elements
            while(temp_start != null && temp_end != null && temp_start != temp_end && temp_end.next != temp_start){
                if(temp_start.data != temp_end.data){
                    return false;
                }
                // to move the temp_start and temp_end pointers towards the center of the list
                temp_start = temp_start.next;
                // to move the temp_end pointer towards the center of the list
                temp_end = temp_end.prev;
            }
        }
        return true;
    }
}
