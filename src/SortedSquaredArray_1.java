import java.util.Arrays;

public class SortedSquaredArray_1 {
    public int[] sortedSquaredArray(int[] array) {
        int[] ans=new int[array.length];
        for (int i=0;i<array.length;i++){
            ans[i]=array[i]*array[i];
        }
        Arrays.sort(ans);
        return ans;
    }
}
