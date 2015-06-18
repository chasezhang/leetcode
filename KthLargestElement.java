public class Solution {
    public int findKthLargest(int[] nums, int k) {
        if (k == 0 || nums == null) {
            return 0;
        } else {
            return getKth(nums.length - k + 1, nums, 0, nums.length - 1);
        }
    }
    
    public int getKth(int k, int[] nums, int start, int end) {
        int pivot = nums[end];
        int left = start;
        int right = end;
        
        while(true) {
            while(nums[left] < pivot && left < right) {
                left++;
            }
            while(nums[right] >= pivot && left < right) {
                right--;
            }
            if (left == right) {
                break;
            }
            swap(nums, left, right);
        }
        
        swap(nums, left, end);
        
        if (left + 1 == k) {
            return pivot;
        } else if (k < left + 1) {
            return getKth(k, nums, start, left-1);
        } else {
            return getKth(k, nums, left+1, end);
        }
    }
    
    public void swap(int[] nums, int left, int right) {
        int tmp = nums[left];
        nums[left] = nums[right];
        nums[right] = tmp;
    }
}