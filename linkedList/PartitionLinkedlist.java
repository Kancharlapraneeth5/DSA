package linkedList;

public class PartitionLinkedlist extends Linkedlist{
    // partition the linked list based on the value x
    public void partitionList(Linkedlist linkedlist, int x){

        Node finalListStartingNode;

        Node least = null;
        Node highest = null;
        Node least_next = null;
        Node highest_next = null;
        Node temp = linkedlist.head;

        while(temp != null){
            // for lowest partition
            if(least == null && temp == linkedlist.head && temp.data < x){
                least = temp;
                least_next = temp;
            }
            // for highest partition
            if(highest == null && temp == linkedlist.head && temp.data >= x){
                highest = temp;
                highest_next = temp;
            }
            // for lowest partition
            if(least == null && temp.next != null && temp.next.data < x){
                least = temp.next;
                least_next = temp.next;
                temp = least_next;
            }
            // for highest partition
            if(highest == null && temp.next != null && temp.next.data >= x){
                highest = temp.next;
                highest_next = temp.next;
                temp = highest_next;
            }
            // for lowest partition
            if(least != null && temp.next != null && temp.next.data < x){
                least_next.next = temp.next;
                least_next = temp.next;
                if(temp.data >= x){
                    temp.next = null;
                }
                temp = least_next;
            }
            // for highest partition
            if(highest != null && temp.next != null && temp.next.data >= x){
                highest_next.next = temp.next;
                highest_next = temp.next;
                if(temp.data < x){
                    temp.next = null;
                }
                temp = highest_next;
            }
            if(temp.next == null){
                break;
            }
        }
        if(least == null){
            finalListStartingNode = highest;
        }
        else if(highest == null){
            finalListStartingNode = least;
        }
        else{
            least_next.next = highest;
            finalListStartingNode = least;
        }

        printListFromSpecificNode(finalListStartingNode);
    }

}
