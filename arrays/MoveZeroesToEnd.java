package arrays;

public class MoveZeroesToEnd {
    public int [] moveZeroesToEnd(int [] arr){
       
        if(arr == null){
            System.out.println("The array is empty.");
            return new int[0];
        }

        int i = 0, j = i + 1;

        while (j < arr.length){
            if(arr[i] == 0 && arr[j] != 0){
                // swap the zero and the non-zero element
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j++;
            }
            else if(arr[i] == 0 && arr[j] == 0){
                    j++;
            }
            else if(arr[i] != 0 && arr[j] == 0){
                i++;
                j++;
            }
            // if both elements are non-zero
            else{
                i = j + 1;
                j = i + 1;
            }
        }
        return arr;
    }
}
