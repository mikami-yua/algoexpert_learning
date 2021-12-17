public class MaxPathSumInBinaryTree {
    public static int maxPath;
    public static int maxPathSum(BinaryTree tree) {
        // Write your code here.
        maxPath=Integer.MIN_VALUE;
        help(tree);
        return maxPath;
    }

    public static int help(BinaryTree node){
        if (node==null) return 0;
        else {
            int left=help(node.left);
            int right=help(node.right);
            int curPath=Math.max(left,right)+node.value;
            int curMax=Math.max(Math.max(Math.max(left+right+node.value,left+node.value),right+ node.value), node.value);
            if (curMax > maxPath){
                maxPath=curMax;
            }
            return curPath;
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
