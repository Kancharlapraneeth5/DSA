package linkedList;

public class Main {
    public static void main(String[] args) {
        Linkedlist list = new Linkedlist();

        // Test case - 1
        list.append(1);
        list.append(1);
        list.append(0);
        list.append(1);
        list.append(0);
        list.append(1);

        // For reversing the linked list (Working fine) 

        // ReverseLinkedlist rev_list = new ReverseLinkedlist();
        // rev_list.reverse(list);

        // For finding the middle element of the linked list (working fine)

        // MiddleElement middle_list = new MiddleElement();
        // System.out.println("the middle element is..."+middle_list.findMiddle(list).data);
        

        // For partitioning the linked list (working fine)

        // PartitionLinkedlist partition_list = new PartitionLinkedlist();
        // partition_list.partitionList(list, 5);

        // For finding the loop in the linked list (working fine)

        // LoopLinkedlist loop_list = new LoopLinkedlist();
        // loop_list.createLoop(list);
        // System.out.println("the loop is present in the linked list..."+loop_list.hasLoop(list));

        // For finding the kth node from the end of the linked list (working fine)

        // KthNodeFromEnd kth_list = new KthNodeFromEnd();
        // System.out.println("the kthNode from the end is..."+kth_list.kthNodeFromEnd(list, 3).data);


        // For removing duplicates from the linked list (working fine)

        // RemoveDuplicates remove_list = new RemoveDuplicates();
        // remove_list.removeDuplicates(list);

        // For converting the binary number to decimal number 

        BinaryToDecimal binaryToDecimal = new BinaryToDecimal();
        System.out.println("the decimal number is..."+binaryToDecimal.convertBinaryToDecimal(list));
    }
}
