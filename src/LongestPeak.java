public class LongestPeak {
    public static int longestPeak(int[] array) {
        // Write your code here.
        int maxLength=0;
        for (int i = 1; i < array.length-1;) {
            if (array[i]>array[i-1] && array[i]>array[i+1]){
                int[] side=help(array,i);
                int tempLength=side[0]+side[1]+1;
                if (maxLength<tempLength){
                    maxLength=tempLength;
                }
                i=i+side[1]+1;
            }else {
                i++;
            }
        }
        return maxLength;
    }
    public static int[] help(int[] array,int index){
        int[] ans=new int[2];
        int left=1,right=1;
        int leftIndex=index-1,rightIndex=index+1;
        while (leftIndex>0){
            if (array[leftIndex]>array[leftIndex-1]){
                left++;
                leftIndex--;
            }else {
                break;
            }
        }
        while (rightIndex<array.length-1){
            if (array[rightIndex]>array[rightIndex+1]){
                right++;
                rightIndex++;
            }else {
                break;
            }
        }
        ans[0]=left;
        ans[1]=right;
        return ans;
    }
}
