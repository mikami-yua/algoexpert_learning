public class InvertBinaryTree {
    public static void invertBinaryTree(BinaryTree tree) {
        // Write your code here.
        help(tree);
    }
    public static void help(BinaryTree root){
        if (root==null) return;
        else {
            BinaryTree temp;
            temp=root.left;
            root.left=root.right;
            root.right=temp;
            help(root.left);
            help(root.right);
        }
    }

    static class BinaryTree {
        public int value;
        public BinaryTree left;
        public BinaryTree right;

        public BinaryTree(int value) {
            this.value = value;
        }
    }
}
