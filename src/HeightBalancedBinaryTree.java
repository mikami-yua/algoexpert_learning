public class HeightBalancedBinaryTree {
    static class BinaryTree {
        public int value;
        public BinaryTree left = null;
        public BinaryTree right = null;

        public BinaryTree(int value) {
            this.value = value;
        }
    }
    public static boolean flag;
    public boolean heightBalancedBinaryTree(BinaryTree tree) {
        // Write your code here.
        flag=true;
        help(tree);
        return flag;
    }
    public static int help(BinaryTree node){
        if (node==null) return 0;
        else {
            int left=help(node.left);
            int right=help(node.right);
            int curHeight=Math.max(left,right);
            if (Math.abs(left-right)>1){
                flag=false;
            }
            return curHeight+1;
        }
    }
}
