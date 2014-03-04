public class Solution {
    public int searchInsert(int[] A, int target) {
        int result = binarySearch(A, 0, A.length - 1, target);
        if (result >= 0) return result;
        else {
            for (int i=0; i<A.length; i++) {
                if (A[i] > target) {
                    result = i;
                    return result;
                }
            }
        }
        return A.length;
    }
    
    public int binarySearch(int[] A, int low, int high, int target) {
        if (low <= high) {
            int mid = (low + high) / 2;
            if (A[mid] == target) return mid;
            if (A[mid] < target) return binarySearch(A, mid+1, high, target);
            else return binarySearch(A, low, mid-1, target);
        }
        return -1;
    }
}