public class MaxSubsetSumNoAdjacent_1 {
    public static int maxSubsetSumNoAdjacent(int[] array) {
        // Write your code here.
        int[] dp=new int[array.length];
        if (array.length==0) return 0;
        if (array.length==1) return array[0];
        dp[0]=array[0];
        dp[1]=Math.max(array[0],array[1]);
        for (int i = 2; i < dp.length; i++) {
            dp[i]=Math.max(dp[i-1],dp[i-2]+array[i]);
        }
        return dp[array.length-1];
    }
}
