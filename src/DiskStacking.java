import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

public class DiskStacking {
    public static List<Integer[]> diskStacking(List<Integer[]> disks) {
        // Write your code here.
        int[] dp=new int[disks.size()];
        disks.sort(new Comparator<Integer[]>() {
            @Override
            public int compare(Integer[] o1, Integer[] o2) {
                return o1[2]-o2[2];
            }
        });
        for (int i = 0; i <dp.length; i++) {
            dp[i]=disks.get(i)[2];
        }
        //动态规划中使用list记录元素很难，记录数组下标即可，避免循环查找
        int maxHeight=Integer.MIN_VALUE;
        HashMap<Integer, Integer> map=new HashMap<>();//映射当前高度，和最下的盘子号
        for (int i = 0; i < dp.length; i++) {
            int curHeight=disks.get(i)[2];
            for (int j = 0; j < i; j++) {
                if (disks.get(j)[0]<disks.get(i)[0] && disks.get(j)[1]<disks.get(i)[1] && disks.get(j)[2]<disks.get(i)[2])
                    dp[i]=Math.max(dp[i],curHeight+dp[j]);
            }
            if (maxHeight<dp[i]) maxHeight=dp[i];
            map.put(dp[i],i);
        }
        int tempHeight=maxHeight;
        List<Integer[]> ans=new ArrayList<>();
        while (tempHeight>0){
            ans.add(disks.get(map.get(tempHeight)));
            tempHeight-=disks.get(map.get(tempHeight))[2];
        }
        ans.sort(new Comparator<Integer[]>() {
            @Override
            public int compare(Integer[] o1, Integer[] o2) {
                return o1[2]-o2[2];
            }
        });
        return ans;
    }
}
