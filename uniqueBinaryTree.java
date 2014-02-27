// The problem can be solved as following:
// we know that f(0) = 1 and f(1) = 1, since if
// there is only one node in the tree or tree is null,
// the number of unique binary tree should be 1.
// Then we can infer that for given number n,
// the number of unique binary tree is Sum[k=1...n](f(k-1)*f(n-k))
// where 1<=k<=n;
public class Solution {
    public int numTrees(int n) {
        if (n == 0) return 1;
        if (n == 1) return 1;
        int result = 0;
        for (int i=1; i<=n; i++) {
            result += numTrees(i-1)*numTrees(n-i);
        }
        return result;
    }
}