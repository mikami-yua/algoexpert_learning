import java.util.ArrayList;
import java.util.List;

public class KnapsackProblem {
    public static List<List<Integer>> knapsackProblem(int[][] items, int capacity) {
        int[][] dp=new int[items.length+1][capacity+1];
        for (int i = 0; i < dp[0].length; i++) {
            dp[0][i]=0;
        }
        for (int i = 0; i < dp.length; i++) {
            dp[i][0]=0;
        }
        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                if (j>=items[i-1][1]){
                    dp[i][j]=Math.max(items[i-1][0]+dp[i-1][j-items[i-1][1]],dp[i-1][j]);
                }
                else {
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        List<List<Integer>> ans=new ArrayList<>();
        ans.add(new ArrayList<>(dp[dp.length-1][dp[0].length-1]));
        List<Integer> list=new ArrayList<>();
        int colIndex= dp[0].length-1;
        for (int i = dp.length-1 ; i > 0; i--) {
            if (dp[i][colIndex]!=dp[i-1][colIndex]){
                list.add(i-1);
                colIndex=colIndex-items[i-1][1];
            }
        }
        ans.add(list);
        return ans;
    }
}
