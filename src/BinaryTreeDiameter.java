public class BinaryTreeDiameter {
    static class BinaryTree {
        public int value;
        public BinaryTree left = null;
        public BinaryTree right = null;

        public BinaryTree(int value) {
            this.value = value;
        }
    }
    public static int maxLength;

    public int binaryTreeDiameter(BinaryTree tree) {
        // Write your code here.
        maxLength=Integer.MIN_VALUE;
        help(tree);
        return maxLength;
    }

    public static int help(BinaryTree root){
        if (root==null) return 0;
        else {
            int leftLength=help(root.left);
            int rightLength=help(root.right);
            int longerChild = Math.max(leftLength,rightLength);
            if (leftLength+rightLength>maxLength)
                maxLength=leftLength+rightLength;
            System.out.println(root.value+"   "+leftLength+"  "+rightLength);
            return longerChild+1;
        }
    }
}
