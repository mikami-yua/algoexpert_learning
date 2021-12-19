public class NumberOfWaysToTraverseGraph {
    public int numberOfWaysToTraverseGraph(int width, int height) {
        // Write your code here.
        int[][] dp=new int[height][width];
        for (int i = 0; i < width; i++) {
            dp[0][i]=1;
        }
        for (int i = 0; i < height; i++) {
            dp[i][0]=1;
        }
        for (int i = 1; i < height; i++) {
            for (int j = 1; j < width; j++) {
                dp[i][j]=dp[i-1][j]+dp[i][j-1];
            }
        }
        return dp[height-1][width-1];
    }
}
