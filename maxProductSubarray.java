public class Solution {
    public int maxProduct(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        
        int globalMax = nums[0];
        int localMax = nums[0];
        int localMin = nums[0];
        
        for(int i=1; i<nums.length; i++) {
            int tmp = localMax;
            localMax = Math.max(Math.max(nums[i]*tmp, nums[i]), nums[i]*localMin);
            localMin = Math.min(Math.min(nums[i]*tmp, nums[i]), nums[i]*localMin);
            globalMax = Math.max(localMax, globalMax);
        }
        
        return globalMax;
    }
}