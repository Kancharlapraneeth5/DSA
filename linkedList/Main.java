package linkedList;

public class Main {
    public static void main(String[] args) {
        Linkedlist list = new Linkedlist();

        // Test case - 1
        list.append(1000);
        list.append(2000);
        list.append(3000);
        list.append(4000);
        list.append(100);
        list.append(200);

        // For reversing the linked list

        ReverseLinkedlist rev_list = new ReverseLinkedlist();
        rev_list.head = list.head;
        rev_list.tail = list.tail;
        rev_list.reverse();

        // For finding the middle element of the linked list

        MiddleElement middle_list = new MiddleElement();
        middle_list.head = list.head;
        middle_list.length = list.length;
        System.out.println("the middle element is..."+middle_list.findMiddle().data);
        

        // For partitioning the linked list

        PartitionLinkedlist partition_list = new PartitionLinkedlist();
        partition_list.head = list.head;
        partition_list.partitionList(1500);

        // For finding the loop in the linked list

        LoopLinkedlist loop_list = new LoopLinkedlist();
        loop_list.head = list.head;
        loop_list.length = list.length;
        loop_list.createLoop();
        System.out.println("the loop is present in the linked list..."+loop_list.hasLoop());

        // For finding the kth node from the end of the linked list

        KthNodeFromEnd kth_list = new KthNodeFromEnd();
        kth_list.head = list.head;
        kth_list.length = list.length;
        System.out.println("the kthNode from the end is..."+kth_list.kthNodeFromEnd(3).data);
    }
}
