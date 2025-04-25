package arrays;

public class TrappingRainWater {

    public Integer trappingRainWater(int [] arr){
        // check if the array is empty or null.
        if (arr == null || arr.length == 0){
            return null;
        }

        int max_left = arr[0];
        int left = 0;
        int right = arr.length - 1;
        int max_right = arr[arr.length - 1];
        int waterTrapped = 0;
        int totalWater = 0;

        while(left < right){
            // the below if and else decides which side to move.
            // if the left side is smaller than the right side, move the left pointer.
            if(max_left < max_right){
                left++;
                // check if the left side is smaller than the max_left.
                // if it is, then we can trap water.
                if (arr[left] < max_left){
                    waterTrapped = max_left - arr[left];
                    totalWater += waterTrapped;
                }
                // if it is not, then we need to update the max_left.
                else{
                    max_left = arr[left];
                }
            }
            // if the right side is smaller than the left side, move the right pointer.
            else{
                right--;
                // check if the right side is smaller than the max_right.
                // if it is, then we can trap water.
                if(arr[right] < max_right){
                    waterTrapped = max_right - arr[right];
                    totalWater += waterTrapped;
                }
                // if it is not, then we need to update the max_right.
                else{
                    max_right = arr[right];
                }
            }
        }
        return totalWater;
    }
}
