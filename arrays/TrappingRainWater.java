package arrays;

public class TrappingRainWater {

    public Integer trappingRainWater(int [] arr){
        // check if the array is empty or null.
        if (arr == null || arr.length == 0){
            return null;
        }

        
        int [] leftMax = new int[arr.length];
        int [] rightMax = new int[arr.length];
        int max_left = arr[0];
        int max_right = arr[arr.length - 1];

        // iterate left to right.. to get the left max array.
        for(int i = 0; i < arr.length; i++){
            if(arr[i] >= max_left){
                max_left = arr[i];
                leftMax[i] = max_left;
            }else{
                leftMax[i] = max_left;
            }
        }

        // iterate right to left.. to get the right max array.
        for (int i = arr.length - 1; i >= 0; i--){
            if(arr[i] >= max_right){
                max_right = arr[i];
                rightMax[i] = max_right;
            }else{
                rightMax[i] = max_right;
            }
        }

        // total water trapped.
        int totalWater = 0;
        for(int i = 0; i < arr.length; i++){
            int water_at_index = Math.min(leftMax[i], rightMax[i]) - arr[i];
            if(water_at_index > 0){
                totalWater += water_at_index;
            }
        }
        return totalWater;
    }
}
