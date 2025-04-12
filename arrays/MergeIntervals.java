package arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeIntervals {
    // In the below method we are using ArrayList to store the merged intervals because the size 
    // of the merged intervals is not known. (dynamic size).
    public ArrayList<int[]> mergeIntervals(int[][] intervals) {
        if (intervals.length == 0) {
            System.out.println("The array is empty.");
            return new ArrayList<>();
        }
        // sort the intervals in the array.
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        // with the help of the sorted array, we can merge the intervals.
        ArrayList<int[]> mergedList = new ArrayList<>();
        // add the first element of the main array to the merged list.
        mergedList.add(intervals[0]);
        int mainArray_index = 1;
        int merged_index = 0;
        while(mainArray_index < intervals.length){
            // merge condition possible c <= b
            if(intervals[mainArray_index][0] <= mergedList.get(merged_index)[1]){
                // the main array element falls in the merged array.
                if(mergedList.get(merged_index)[1] >= intervals[mainArray_index][1]){
                    mainArray_index++;
                }
                // merge the two intervals
                else if(intervals[mainArray_index][1] > mergedList.get(merged_index)[1]){
                    //merged[merged_index][1] = intervals[mainArray_index][1];
                    mergedList.get(merged_index)[1] = intervals[mainArray_index][1];
                    mainArray_index++;
                }
            }
            // no possiblitity of merging the two intervals.
            else{
                // merged_index++;
                mergedList.add(intervals[mainArray_index]);
                mainArray_index++;
            }
        }
        return mergedList;
    }
}
