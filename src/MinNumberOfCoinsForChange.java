import java.util.Arrays;

public class MinNumberOfCoinsForChange {
    public static int minNumberOfCoinsForChange(int n, int[] denoms) {
        // Write your code here.
        Arrays.sort(denoms);
        int[] dp=new int[n+1];
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[0]=0;
        for (int i = 0; i < denoms.length; i++) {
            for (int j = 0; j < dp.length; j++) {
                if (j>=denoms[i]){
                    if (dp[j-denoms[i]]!=Integer.MAX_VALUE)
                        dp[j]=Math.min(dp[j-denoms[i]]+1,dp[j]);
                }
            }
        }

        if (dp[n]==Integer.MAX_VALUE) return -1;
        return dp[n];
    }
}
