import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeNumberSum {
    public static List<Integer[]> threeNumberSum(int[] array, int targetSum) {
        // Write your code here.
        ArrayList<Integer[]> ans=new ArrayList<>();
        Arrays.sort(array);
        for (int i = 0; i < array.length-2; i++) {
            int tempNum=targetSum-array[i];
            int left=i+1;
            int right=array.length-1;
            while (left<right){
                if (array[left]+array[right]<tempNum){
                    left++;
                }else if(array[left]+array[right]>tempNum){
                    right--;
                }else {
                    Integer[] tempArr=new Integer[3];
                    tempArr[0]=array[i];
                    tempArr[1]=array[left];
                    tempArr[2]=array[right];
                    ans.add(tempArr);
                    left++;
                    right--;
                }
            }
        }

        return ans;
    }
}
