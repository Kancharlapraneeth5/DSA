package arrays;

public class ReverseArray {
    public int [] reverseArray(int [] arr){

        if (arr == null){
            System.out.println("The array is empty.");
            return new int[0];
        }
        
        int i = 0, j = arr.length - 1;
        while (i < j){
            // swap the elements at index i and j
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        return arr;
    }
}
