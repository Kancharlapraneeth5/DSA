package linkedList;

public class MergeSortedLists extends Linkedlist {
    public void mergeSortedLists(Linkedlist list1, Linkedlist list2){
        Node temp_1; 
        Node temp_2;
        Node dummy;
        Node resultHead;

        // the below conditions to check if both lists are empty or any one of the lists are empty.
        if(list1.head == null && list2.head == null){
            System.out.println("Both lists are empty");
            return;
        }
        if(list1.head == null && list2.head != null){
            System.out.println("The first list is empty");
            list2.printListFromSpecificNode(list2.head);
            return;
        }
        if(list2.head == null && list1.head != null){
            System.out.println("The second list is empty");
            list1.printListFromSpecificNode(list1.head);
            return;
        }

        // if both lists are not empty.
        if(list1.head != null && list2.head != null) {
            System.out.println("I am in the else block...");
            if(list1.head != null && list2.head != null && list1.head.data <= list2.head.data){
                temp_1 = list1.head;
                temp_2 = list2.head;
                resultHead = list1.head;
            }
            else{
                temp_2 = list1.head;
                temp_1 = list2.head;
                resultHead = list2.head;
            }
    
            System.out.println("Both lists are not empty");
            dummy = temp_1.next;
            while(temp_1 != null){
                
                if(temp_1 != null && dummy != null && temp_2 != null && (temp_1.data < temp_2.data || temp_1.data == temp_2.data) && (dummy.data > temp_2.data || dummy.data == temp_2.data)){
                    temp_1.next = temp_2;
                    temp_2 = temp_2.next;
                    temp_1.next.next = dummy;
                    temp_1 = temp_1.next;
                }
                // move forward both the temp_1 and dummy if nothing matches for insertion operation.
                else if(temp_2 != null && dummy != null && dummy.next != null && temp_2.data > temp_1.data && temp_2.data > dummy.data){
                    temp_1 = dummy;
                    dummy = temp_1.next;
                }
                // insert the remaining second list at the end of the first list.
                else if(dummy != null && dummy.next == null && temp_2 != null){
                    dummy.next = temp_2;
                    break;
                }
                // insert the remaining second list at the end of the first list.
                else if(dummy == null && temp_1 != null && temp_1.next == null && temp_2 != null){
                    temp_1.next = temp_2;
                    break;
                }
                // total second list got inserted in the first list.
                else if(temp_2 == null){
                    break;
                }
            }
            System.out.println("The merged sorted linked list is: ");
            printListFromSpecificNode(resultHead);
        }
    }
}
