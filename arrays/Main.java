package arrays;

public class Main {
    public static void main(String[] args) {

        // TwoSum test

        int [] arr_1 = {1,5,3,7,2};
        TwoSum twoSum = new TwoSum();
        int [] result_1 = twoSum.twoSum(arr_1, 10);
        System.out.println("The indices of the two numbers that add up to the target are: " + result_1[0] + " and " + result_1[1]);

        // MoveZeroesToEnd test

        MoveZeroesToEnd moveZeroes = new MoveZeroesToEnd();
        int [] arr_2 = {1, 0, 2, 0, 3};
        int [] result_2 = moveZeroes.moveZeroesToEnd(arr_2);
        System.out.print("The array after moving the zeroes to the end is: ");
        System.out.println();
        for (int i = 0; i < result_2.length; i++){
            System.out.println(result_2[i] + " ");
        }

        // Reverse an array test
        ReverseArray reverseArray = new ReverseArray();
        int [] arr_3 = {1,2,3,4,5,6,7,8,9};
        int [] result_3 = reverseArray.reverseArray(arr_3);
        System.out.print("The reversed array is: ");
        System.out.println();
        for (int i = 0; i < result_3.length; i++){
            System.out.println(result_3[i] + " ");
        }
    }
}

