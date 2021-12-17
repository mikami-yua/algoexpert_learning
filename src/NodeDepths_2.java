import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class NodeDepths_2 {
    public static int nodeDepths(BinaryTree root) {
        // Write your code here.
        Map<BinaryTree,Integer> map=new HashMap<>();
        Stack<BinaryTree> stack=new Stack<>();
        int sum=0;
        map.put(root,0);
        stack.push(root);
        while (!stack.isEmpty()){
            BinaryTree tempNode = stack.pop();
            if (tempNode.left!=null){
                map.put(tempNode.left,map.get(tempNode)+1);
                stack.push(tempNode.left);
            }
            if (tempNode.right!=null){
                map.put(tempNode.right,map.get(tempNode)+1);
                stack.push(tempNode.right);
            }
            sum+=map.get(tempNode);
        }
        return sum;
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
