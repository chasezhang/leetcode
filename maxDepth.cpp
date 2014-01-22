struct TreeNode {
	int val;
	TreeNode *left;
	TreeNode *right;
}

int maxDepth(TreeNode *root) {
	if (root == NULL) return 0;

	int left = maxDepth(root->left) + 1;
	int right = maxDepth(root->right) + 1;

	return left > right ? left : right;
}
