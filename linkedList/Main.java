package linkedList;

public class Main {
    public static void main(String[] args) {
        Linkedlist list = new Linkedlist();
        list.append(1);
        list.append(2);
        list.append(3);
        list.append(4);
        // list.append(50);
        // list.append(60);
        // System.out.println();
        // list.print();
        // list.removeLast();
        // System.out.println("Removed last element"); 
        // list.print();
        // System.out.println("Adding a new element at the begining");
        // list.prepend(5);
        // list.print();
        // list.removeFirst();
        // list.print();
        // System.out.println("the element at the required index is..."+list.getNode(0));
        // System.out.println("the element at the required index is..."+list.getNode(1));
        // System.out.println("the element at the required index is..."+list.getNode(2));
        // System.out.println("the element at the required index is..."+list.getNode(3));
        // System.out.println("the element at the required index is..."+list.getNode(4));

        // System.out.println("the element modified at the respective index.."+list.set(1, 100));
        // System.out.println("printing the final list...");
        // list.print();
        // System.out.println("the element inserted at the respective index.."+list.insert(list.getLength(), 500));
        // System.out.println("printing the final list...");
        // list.print();
        // System.out.println("the element removed at the respective index.."+list.remove(3));
        // System.out.println("printing the final list...");
        // list.print();
        list.reverse();
        //list.insert(list.getLength(), 500);
        System.out.println("printing the final reverse list...");
        list.print();
        //list.findMiddle();
        System.out.println("the middle element is..."+list.findMiddle().data);
        //list.createLoop();
        System.out.println("the loop is present in the linked list..."+list.hasLoop());
        System.out.println("the kthNode from the end is..."+list.kthNodeFromEnd(5).data);
    }
}
