package BINARYSEARCHTREE;

class Treenode{
    int val;
    Treenode left , right ;
    Treenode(int val){
        this.val= val;
    }
}

public class FLOORBST {
    public Treenode FloorInBST(Treenode root, int x){
        Treenode floor = null;
        while (root != null) {
            if (root.val == x) {
                return root;
            }
            if (root.val < x) {
                floor = root;
                root = root.right;
            } else {
                root = root.left;
            }
        }

        return floor;
    }
}
