public class FindSuccessor_2 {
    static class BinaryTree {
        public int value;
        public BinaryTree left = null;
        public BinaryTree right = null;
        public BinaryTree parent = null;

        public BinaryTree(int value) {
            this.value = value;
        }
    }

    public BinaryTree findSuccessor(BinaryTree tree, BinaryTree node) {
        // Write your code here.
        if (node.right!=null){
            return getLeftMostChild(node);
        }

        return getRightMostParent(node);
    }
    public static BinaryTree getLeftMostChild(BinaryTree node){
        BinaryTree curNode=node.right;
        while (curNode.left!=null){
            curNode=curNode.left;
        }
        return curNode;
    }

    public static BinaryTree getRightMostParent(BinaryTree node){
        BinaryTree curNode=node;
        while (curNode.parent!=null && curNode.parent.right==curNode){
            curNode=curNode.parent;
        }
        return curNode.parent;

    }
}
