package arrays;

import java.util.HashMap;

public class TwoSum {
    // the below approach is to use a hash map to store the indices of the elements in the array. O(n)
    // we can also implement the below approach using a two pointer technique. O(nlogn)
    public int [] twoSum(int[] arr, int target){

        if(arr == null || arr.length < 2){
            System.out.println("The array is empty or has less than two elements.");
            return new int[0];
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        int [] result = new int[2];

        for (int i = 0; i < arr.length; i++){
            int complement = target - arr[i];
            if(map.containsKey(complement)){
                result[0] = map.get(complement);
                result[1] = i;
                return result;
            }
            map.put(arr[i], i);
        }
        return result;
    }
}
