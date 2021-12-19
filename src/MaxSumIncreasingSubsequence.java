import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.*;

public class MaxSumIncreasingSubsequence {
    public static List<List<Integer>> maxSumIncreasingSubsequence(int[] array) {
        // Write your code here.
        Map<Integer, List<Integer>> dpMap=new HashMap<>();//key存放dp数组的下标
        int[] dp;
        dp=array.clone();
        for (int i = 0; i < dp.length; i++) {
            List<Integer> init=new ArrayList<>();
            init.add(array[i]);
            dpMap.put(i,init);
        }
        for (int i = 1; i < array.length; i++) {
            List<Integer> tempList;
            for (int j = 0; j < i; j++) {
                if (array[j]<array[i] && dp[j]+array[i]>dp[i]){
                    dp[i]=dp[j]+array[i];
                    tempList=new ArrayList<>(dpMap.get(j));
                    tempList.add(array[i]);
                    dpMap.put(i,tempList);
                }
            }
        }
        int max=Integer.MIN_VALUE;
        List<Integer> list=null;
        for (int i = 0; i < dp.length; i++) {
            if (max<dp[i]){
                max=dp[i];
                list=dpMap.get(i);
            }
        }
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> temp=new ArrayList<>(max);
        ans.add(temp);
        ans.add(list);
        return ans;
    }
}
