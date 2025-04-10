package arrays;

public class MaximumSubArray {
    // the below is the kadane's algorithm to find the maximum subarray sum.
    // // Time complexity is O(n) and space complexity is O(1).
    public Integer maxiSubArraySum(int [] arr) {

        if (arr == null || arr.length == 0) {
            System.out.println("The array is empty.");
            return null;
        }
        int current_sum = arr[0];
        int max_sum = arr[0];

        for (int i = 1; i < arr.length; i++){
            current_sum = Math.max(arr[i], current_sum + arr[i]);
            max_sum = Math.max(current_sum, max_sum);
        }
        return max_sum;    
    }
}

