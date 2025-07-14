class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] results = new int[nums.length];
        for(int i = 0; i< nums.length; i++){
            int numElems=0;
            for (int j = 0; j<nums.length; j++){
                if( j!=i && nums[j] < nums[i]){
                    numElems++;
                    results[i] = numElems;
                }
            }
        }
        return results;
    }
}