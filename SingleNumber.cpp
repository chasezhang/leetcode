/*
 Usr XOR operation to get the unique number.
 @parameter n - the length of array A
 */
class Solution {
	public:
		int singleNumber(int A[], int n) {
			int result = A[0];
			if (n <= 1) return result;
			for (int i=1; i<n; i++) {
				result = result xor A[i];
			}
			return result;
		}
}
