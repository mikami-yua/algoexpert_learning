import java.util.Arrays;

public class TwoNumberSum_3 {

    public static int[] twoNumberSum(int[] array, int targetSum) {
        int[] ans={};
        Arrays.sort(array);
        int left=0;
        int right=array.length-1;
        while (left<right){
            if (array[left]+array[right]<targetSum){
                left++;
            }else if (array[left]+array[right]>targetSum){
                right--;
            }else {
                ans=new int[2];
                ans[0]=array[left];
                ans[1]=array[right];
                break;
            }
        }
        return ans;
    }
}
