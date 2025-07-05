class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
    }
}

class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        // Base case: not found or match
        if (root == null || root.val == val) {
            return root;
        }

        // Value is less, go left
        if (val < root.val) {
            return searchBST(root.left, val);
        }

        // Value is greater, go right
        return searchBST(root.right, val);
    }
}
