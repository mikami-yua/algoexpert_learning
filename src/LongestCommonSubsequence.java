import java.util.ArrayList;
import java.util.List;

public class LongestCommonSubsequence {
    public static List<Character> longestCommonSubsequence(String str1, String str2) {
        // Write your code here.
        char[] firstArray=str1.toCharArray();
        char[] secondArray=str2.toCharArray();
        String[][] dp=new String[secondArray.length+1][firstArray.length+1];
        for (int i = 0; i < dp.length; i++) {
            dp[i][0]="";
        }
        for (int i = 0; i < dp[0].length; i++) {
            dp[0][i]="";
        }

        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                int left=dp[i][j-1].length();
                int upper=dp[i-1][j].length();
                if (left>upper) {
                    if (firstArray[j - 1] == secondArray[i - 1]) {
                        dp[i][j]=dp[i-1][j-1]+firstArray[j - 1];
                    } else {
                        dp[i][j]=dp[i][j-1];
                    }
                }else {
                    if (firstArray[j - 1] == secondArray[i - 1]) {
                        dp[i][j]=dp[i-1][j-1]+firstArray[j - 1];
                    } else {
                        dp[i][j]=dp[i-1][j];
                    }
                }
            }
        }
        List<Character> ans=new ArrayList<>();
        for (int i = 0; i < dp[dp.length-1][dp[0].length-1].length(); i++) {
            ans.add(dp[dp.length-1][dp[0].length-1].charAt(i));
        }
        return ans;
    }
}
