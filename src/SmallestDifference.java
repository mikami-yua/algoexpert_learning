import java.util.Arrays;

public class SmallestDifference {
    public static int[] smallestDifference(int[] arrayOne, int[] arrayTwo) {
        // Write your code here.
        Arrays.sort(arrayOne);
        Arrays.sort(arrayTwo);
        int onePointer=0;
        int twoPointer=0;
        int minNum=Integer.MAX_VALUE;
        int[] ans=new int[2];
        while (onePointer<arrayOne.length && twoPointer<arrayTwo.length){
            if (Math.abs(arrayOne[onePointer]-arrayTwo[twoPointer])<minNum){
                ans[0]=arrayOne[onePointer];
                ans[1]=arrayTwo[twoPointer];
                minNum=Math.abs(arrayOne[onePointer]-arrayTwo[twoPointer]);
                if (arrayOne[onePointer]<arrayTwo[twoPointer]){
                    onePointer++;
                }else {
                    twoPointer++;
                }
            }else {
                if (arrayOne[onePointer]<arrayTwo[twoPointer]){
                    onePointer++;
                }else {
                    twoPointer++;
                }
            }
        }

        return ans;
    }
}
