package linkedList;

public class BinaryToDecimal extends Linkedlist{
    public int convertBinaryToDecimal(Linkedlist linkedlist){
        Node temp = linkedlist.head;
        int decimalValue = 0;
        int power = linkedlist.length - 1;

        while(temp != null && power >= 0){
            decimalValue += temp.data * Math.pow(2, power);
            power--;
            temp = temp.next;
        }
        return decimalValue;
    }
}
