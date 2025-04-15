package arrays;

// import java.util.ArrayList;
// import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // TwoSum test

        // int [] arr_1 = {1,5,3,7,2};
        // TwoSum twoSum = new TwoSum();
        // int [] result_1 = twoSum.twoSum(arr_1, 10);
        // System.out.println("The indices of the two numbers that add up to the target are: " + result_1[0] + " and " + result_1[1]);

        // MoveZeroesToEnd test

        // MoveZeroesToEnd moveZeroes = new MoveZeroesToEnd();
        // int [] arr_2 = {1, 0, 2, 0, 3};
        // int [] result_2 = moveZeroes.moveZeroesToEnd(arr_2);
        // System.out.print("The array after moving the zeroes to the end is: ");
        // System.out.println();
        // for (int i = 0; i < result_2.length; i++){
        //     System.out.println(result_2[i] + " ");
        // }

        // Reverse an array test

        // ReverseArray reverseArray = new ReverseArray();
        // int [] arr_3 = {1,2,3,4,5,6,7,8,9};
        // int [] result_3 = reverseArray.reverseArray(arr_3);
        // System.out.print("The reversed array is: ");
        // System.out.println();
        // for (int i = 0; i < result_3.length; i++){
        //     System.out.println(result_3[i] + " ");
        // }


        // MaximumSubArray test 
        // the below is the kadane's algorithm to find the maximum subarray sum.

        // MaximumSubArray maximumSubArray = new MaximumSubArray();
        // int [] arr_4 = {-3, -4, 2, 3, 5};
        // Integer result_4 = maximumSubArray.maxiSubArraySum(arr_4);
        // System.out.print("The maximum subarray sum is: ");
        // System.out.println(result_4);


        // MergeIntervals test
        // MergeIntervals mergeIntervals = new MergeIntervals();
        //int[][] intervals = {{1,3}, {8,10}, {2,6}};
        //int[][] intervals = {{1,10}, {2,6}, {3,9}};
        //int[][] intervals = {{1, 2}, {3, 4}, {5, 6}};
        // int[][] intervals = {{1, 5}, {2, 6}, {3, 7}};
        // int[][] intervals = {{1, 3}, {5, 8}, {2, 6}};
        // int[][] intervals = {{1, 2}, {2, 3}, {3, 4}};
        // int[][] intervals = {{5, 10}};
        // int [][] intervals = {{}};
        // ArrayList<int[]> mergedIntervals = mergeIntervals.mergeIntervals(intervals);

        // // print the merged intervals
        // System.out.println("The merged intervals array is: ");
        // for (int i = 0; i < mergedIntervals.size(); i++) {
        //     System.out.println(Arrays.toString(mergedIntervals.get(i)));
        // }

        // Product of array elements except itself test.

        ProductOfArrayExceptSelf prod_array = new ProductOfArrayExceptSelf();
        int [] arr = {1,2,3,4};
        //int [] arr = {2, 3, 0, 4};
        //int [] arr = {-1, 1, 0, -3, 3};
        //int [] arr = {5, 5};
        int [] result = prod_array.productOfArrayExceptSelf(arr);
        System.out.println("Printing array elements: ");
        for(int i = 0; i < result.length; i++){
            System.out.println(result[i]);
        }
    }
}

