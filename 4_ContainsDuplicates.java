class Solution {
    public boolean containsDuplicate(int[] nums) {
        // w/o Sets
        // Arrays.sort(nums);
        // for (int i = 0; i < nums.length - 1; i++) {
        //     if (nums[i] == nums[i + 1]) {
        //         return true;
        //     }
        // }
        // return false;

        // w/ Sets
        Set<Integer> setNums = new HashSet<>();
        for (int num:nums){
            if(!setNums.add(num)){
                return true;
            }
        }
        return false;
    }
}
