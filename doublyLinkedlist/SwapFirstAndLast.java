package doublyLinkedlist;

public class SwapFirstAndLast extends DoublyLinkedlist {
    public void swapFirstAndLast(DoublyLinkedlist list){

        if(list.getLength() < 2){
            list.printList();
            return;
        }
        else{
            int temp = list.head.data;
            list.head.data = list.tail.data;
            list.tail.data = temp;
            list.printList();
        }
    }
}
