import java.util.Arrays;

public class NumberOfWaysToMakeChange {
    public static int numberOfWaysToMakeChange(int n, int[] denoms) {
        // Write your code here.
        int[] dp=new int[n+1];
        Arrays.fill(dp,0);
        dp[0]=1;
        for (int i = 0; i < denoms.length; i++) {
            for (int j = 1; j < dp.length; j++) {
                if (j<denoms[i]){
                    dp[j]=dp[j];
                }else {
                    dp[j]=dp[j-denoms[i]]+dp[j];
                }
            }
        }
        return dp[n];
    }
}
