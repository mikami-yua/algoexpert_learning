public class MaxSubsetSumNoAdjacent_2 {
    public static int maxSubsetSumNoAdjacent(int[] array) {
        // Write your code here.
        int oneBefore,twoBefore;
        if (array.length==0) return 0;
        if (array.length==1) return array[0];
        twoBefore=array[0];
        oneBefore=Math.max(array[0],array[1]);
        int ans=oneBefore;
        for (int i = 2; i < array.length; i++) {
            ans=Math.max(oneBefore,twoBefore+array[i]);
            twoBefore=oneBefore;
            oneBefore=ans;
        }
        return ans;
    }
}
