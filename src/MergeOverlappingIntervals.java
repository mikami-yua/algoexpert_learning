import java.util.ArrayList;
import java.util.Arrays;

public class MergeOverlappingIntervals {
    public int[][] mergeOverlappingIntervals(int[][] intervals) {
        // Write your code here.
        int[][] clonarray=intervals.clone();
        Arrays.sort(clonarray,(a, b)->Integer.compare(a[0],b[0]));
        ArrayList<int[]> list=new ArrayList<>();
        list.add(clonarray[0]);
        int last=1;
        for (int i = 1; i < clonarray.length; i++) {
            if (clonarray[i][0]<=list.get(last-1)[1]){
                int end=Math.max(clonarray[i][1],list.get(last-1)[1]);
                int start=list.get(last-1)[0];
                int[] temp={start,end};
                list.set(last-1,temp);
            }else {
                int end=clonarray[i][1];
                int start=clonarray[i][0];
                int[] temp={start,end};
                list.add(temp);
                last++;
            }
        }
        int[][] ans=new int[list.size()][2];
        for (int i = 0; i < ans.length; i++) {
            ans[i]= list.get(i).clone();
        }
        return ans;
    }
}
