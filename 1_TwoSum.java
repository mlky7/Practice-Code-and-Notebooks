import java.util.*;

class Solution {
    public static int findIndex(int[] arr, int t){
        for(int i= 0; i<arr.length; i++){
            if(arr[i] == t)
                return i;
        }
        return -1;
    }

    public int[] twoSum(int[] nums, int target) {
        int len = nums.length;
        int[] results = new int[2];
        for(int i = 0; i < len; i++){
            int complement = target - nums[i];
            int index = findIndex(nums, complement);
            if(index != -1 && index != i){
                results[0] = i;
                results[1] = index;
                return results;
            }
        }
        return new int[]{}; // return empty if no match found
    }
}
