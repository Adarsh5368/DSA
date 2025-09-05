//Given a Binary Search Tree and two integers k1 and k2, find and print the elements which are in range k1 and k2 (both inclusive).

//Print the elements in increasing order.
// BINARYSEARCHTREE;

class TreeNode{
    int val;
    TreeNode left;
   TreeNode right;
   TreeNode(int val){
        this.val =val;
    }
}


public class CN1 {
    public void PrintInRange(TreeNode root, int k1 , int k2){
        if (root == null){
            return;
        }
        // Traverse left subtree if root.val > k1
        if (root.val > k1) {
            PrintInRange(root.left, k1, k2);
        }

        // Print current node if it's within range
        if (root.val >= k1 && root.val <= k2) {
            System.out.print(root.val + " ");
        }

        // Traverse right subtree if root.val < k2
        if (root.val < k2) {
            PrintInRange(root.right, k1, k2);
        }
    }
}
public void main(String[] args) {
    // Create BST:
    TreeNode root = new TreeNode(10);
    root.left = new TreeNode(5);
    root.right = new TreeNode(15);
    root.left.left = new TreeNode(2);
    root.left.right = new TreeNode(7);
    root.right.right = new TreeNode(20);

    CN1 sol = new CN1();
    int k1 = 5, k2 = 15;
    System.out.print("Nodes between " + k1 + " and " + k2 + ":");
    sol.PrintInRange(root, k1, k2);
}
//check all

