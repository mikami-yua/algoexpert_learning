public class WaterArea {
    public static int waterArea(int[] heights) {
        // Write your code here.
        if (heights.length==0) return 0;
        int[] leftHeigths=new int[heights.length];
        int[] rightHeights=new int[heights.length];
        leftHeigths[0]=0;
        int maxValue=leftHeigths[0];
        for (int i = 1; i < leftHeigths.length; i++) {
            if (heights[i-1]>maxValue){
                maxValue=heights[i-1];
            }
            leftHeigths[i]=maxValue;
        }
        rightHeights[rightHeights.length-1]=0;
        maxValue=rightHeights[rightHeights.length-1];
        for (int i = rightHeights.length-2; i >=0 ; i--) {
            if (heights[i+1]>maxValue){
                maxValue=heights[i+1];
            }
            rightHeights[i]=maxValue;
        }
        int[] water=new int[heights.length];
        for (int i = 0; i < water.length; i++) {
            int waterLine=Math.min(leftHeigths[i],rightHeights[i]);
            if (heights[i]>=waterLine){
                water[i]=0;
            }else {
                water[i]=waterLine-heights[i];
            }
        }
        int ans=0;
        for (int i = 0; i < water.length; i++) {
            ans+=water[i];
        }
        return ans;
    }
}
