public class TwoNumberSum_1 {

    public static int[] twoNumberSum(int[] array, int targetSum) {
        // Write your code here.
        int ans1, ans2;
        boolean flag = false;
        int[] ans = {};
        for (int i = 0; i < array.length - 1; i++) {
            ans1 = array[i];
            for (int j = i + 1; j < array.length; j++) {
                ans2 = array[j];
                if (ans1 + ans2 == targetSum) {
                    ans = new int[2];
                    ans[0] = ans1;
                    ans[1] = ans2;
                    flag = true;
                    break;
                }
            }
            if (flag == true)
                break;
        }
        return ans;
    }

}
