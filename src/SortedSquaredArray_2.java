public class SortedSquaredArray_2 {
    public int[] sortedSquaredArray(int[] array) {
        // Write your code here.
        int[] ans=new int[array.length];
        int start=0;
        int end=(array.length)-1;
        int i=ans.length-1;
        while (i>=0){
            if (array[start]*array[start]<array[end]*array[end]){
                ans[i]=array[end]*array[end];
                end--;
            }else {
                ans[i]=array[start]*array[start];
                start++;
            }
            i--;
        }
        return ans;
    }
}
