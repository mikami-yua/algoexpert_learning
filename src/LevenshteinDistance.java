public class LevenshteinDistance {
    public static int levenshteinDistance(String str1, String str2) {
        // Write your code here.
        int[][] dp=new int[str1.length()+1][str2.length()+1];
        for (int i = 0; i < str2.length()+1; i++) {
            dp[0][i]=i;
        }
        for (int i = 0; i < str1.length()+1; i++) {
            dp[i][0]=i;
        }
        for (int i = 1; i < str1.length()+1; i++) {
            for (int j = 1; j < str2.length()+1; j++) {
                if (str1.charAt(i-1)==str2.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1];
                }else {
                    dp[i][j]=1+Math.min(Math.min(dp[i-1][j],dp[i][j-1]),dp[i-1][j-1]);
                }
            }
        }
        return dp[str1.length()][str2.length()];
    }
}
