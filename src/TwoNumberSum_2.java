import java.util.HashMap;

public class TwoNumberSum_2 {
    public static int[] twoNumberSum(int[] array, int targetSum) {
        // Write your code here.
        int[] ans={};
        HashMap<Integer,Integer> hash=new HashMap<>();
        for(int i=0;i<array.length;i++){
            int miner=targetSum-array[i];
            if(hash.containsKey(miner)){
                ans=new int[2];
                ans[0]=miner;
                ans[1]=array[i];
            }else {
                hash.put(array[i],0);
            }
        }
        return ans;
    }
}
