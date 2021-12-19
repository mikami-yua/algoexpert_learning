import java.util.Arrays;

public class MinNumberOfJumps {
    public static int minNumberOfJumps(int[] array) {
        // Write your code here.
        int[] dp=new int[array.length];
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[0]=0;
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i]+i>=j){
                    dp[j]=Math.min(dp[j],dp[i]+1);
                }
            }
        }
        return dp[array.length-1];
    }
}
