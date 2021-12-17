import java.util.ArrayList;

public class FindSuccessor_1 {
    static class BinaryTree {
        public int value;
        public BinaryTree left = null;
        public BinaryTree right = null;
        public BinaryTree parent = null;

        public BinaryTree(int value) {
            this.value = value;
        }
    }
    public static ArrayList<BinaryTree> list;
    public BinaryTree findSuccessor(BinaryTree tree, BinaryTree node) {
        // Write your code here.
        list=new ArrayList<>();
        help(tree);
        list.add(null);
        for (int i = 0; i <list.size(); i++) {
            if (list.get(i)==node){
                return list.get(i+1);
            }
        }
        return null;
    }
    public static void help(BinaryTree root){
        if (root==null) return;
        else {
            help(root.left);
            list.add(root);
            help(root.right);
        }
    }
}
