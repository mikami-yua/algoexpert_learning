import java.util.*;

public class FindNodesDistanceK {
    static class BinaryTree {
        public int value;
        public BinaryTree left = null;
        public BinaryTree right = null;

        public BinaryTree(int value) {
            this.value = value;
        }
    }

    static class ParentNode{
        public int value;
        public ParentNode left = null;
        public ParentNode right = null;
        public ParentNode parent=null;

        public ParentNode(int value) {
            this.value = value;
        }
    }

    public static ParentNode newTree;
    public static ParentNode targetNode;
    public ArrayList<Integer> findNodesDistanceK(BinaryTree tree, int target, int k) {
        // Write your code here.
        newTree=null;
        newTree=help(tree,null,target);
        ArrayList<Integer> ans=new ArrayList<>();
        ans=BST(targetNode,k);
        return ans;
    }
    public static ParentNode help(BinaryTree node,ParentNode parent,int target){
        if (node==null) return null;
        else {
            ParentNode temp=new ParentNode(node.value);
            temp.parent=parent;
            temp.left=help(node.left,temp,target);
            temp.right=help(node.right,temp,target);
            if (temp.value==target){
                targetNode=temp;
            }
            return temp;
        }
    }

    public static ArrayList<Integer> BST(ParentNode node,int k){
        //使用队列
        Queue<ParentNode> queue=new LinkedList<>();
        Set<ParentNode> set=new HashSet<>();
        queue.add(node);
        set.add(node);
        while (!queue.isEmpty() && k>0){
            int size= queue.size();;
            for (int i = 0; i < size; i++) {
                ParentNode temp=queue.poll();
                set.add(temp);
                if (temp.parent!=null && !set.contains(temp.parent)) queue.add(temp.parent);
                if (temp.left!=null && !set.contains(temp.left)) queue.add(temp.left);
                if (temp.right!=null && !set.contains(temp.right)){
                    queue.add(temp.right);
                }
                System.out.println(temp.value+" "+k);
            }
            k--;
            System.out.println(queue);
        }

        ArrayList<Integer> ans=new ArrayList<>();
        System.out.println(queue.size());
        while(!queue.isEmpty()){
            ParentNode temp=queue.poll();
            System.out.println(temp.value);
            ans.add(temp.value);
        }

        return ans;
    }
}
