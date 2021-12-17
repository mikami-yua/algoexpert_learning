public class NodeDepths_1 {
    public static int nodeDepths(BinaryTree root) {
        // Write your code here.
        if (root==null) return 0;
        return help(root,0);
    }
    public static int help(BinaryTree curNode,int curDeepSum){
        int childDeep;
        if (curNode.left!=null && curNode.right!=null) {
            childDeep = help(curNode.left, curDeepSum+1)+help(curNode.right, curDeepSum+1);
        }else if (curNode.left!=null && curNode.right==null){
            childDeep=help(curNode.left,curDeepSum+1);
        }else if (curNode.right!=null && curNode.left==null){
            childDeep=help(curNode.right,curDeepSum+1);
        }else {
            return curDeepSum;
        }

        System.out.println(curNode.value+"  "+childDeep);
        return childDeep+curDeepSum;
    }

    static class BinaryTree {
        int value;
        BinaryTree left;
        BinaryTree right;

        public BinaryTree(int value) {
            this.value = value;
            left = null;
            right = null;
        }
    }
}
