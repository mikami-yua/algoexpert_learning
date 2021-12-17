import java.util.ArrayList;
import java.util.List;

public class BranchSums {
    public static class BinaryTree {
        int value;
        BinaryTree left;
        BinaryTree right;

        BinaryTree(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }
    public static ArrayList<Integer> list=new ArrayList<>();
    public static List<Integer> branchSums(BinaryTree root) {
        // Write your code here.
        list.clear();
        help(root,0);
        return list;
    }
    public static void help(BinaryTree curNode,int curSum){
        if (curNode.left!=null) {
            int cunVal = curNode.value;
            help(curNode.left, curSum+cunVal);
        }
        if (curNode.right!=null){
            int cunVal = curNode.value;
            help(curNode.right, curSum+cunVal);
        }
        if (curNode.left==null && curNode.right==null){
            int cunVal = curNode.value;
            list.add(curSum+cunVal);
        }
    }
}
