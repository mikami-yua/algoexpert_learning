public class MaximumSumSubmatrix {
    public int maximumSumSubmatrix(int[][] matrix, int size) {
        // Write your code here.
        int[][] sums=new int[matrix.length][matrix[0].length];
        sums[0][0]=matrix[0][0];
        for (int i = 1; i < matrix[0].length; i++) {
            sums[0][i]=sums[0][i-1]+matrix[0][i];
        }
        for (int i = 1; i < matrix.length; i++) {
            sums[i][0]=sums[i-1][0]+matrix[i][0];
        }
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[0].length; j++) {
                sums[i][j]=sums[i-1][j]+sums[i][j-1]+matrix[i][j]-sums[i-1][j-1];
            }
        }

        int maxSub=Integer.MIN_VALUE;
        for (int i = size-1; i < sums.length; i++) {
            for (int j = size-1; j < sums[0].length; j++) {
                int total=sums[i][j];
                boolean touchesTop=(i-size)<0;
                if (!touchesTop){
                    total-=sums[i-size][j];
                }
                boolean touchesLeft=(j-size)<0;
                if (!touchesLeft){
                    total-=sums[i][j-size];
                }
                boolean touchLeftOrTop=touchesLeft||touchesTop;
                if (!touchLeftOrTop){
                    total+=sums[i-size][j-size];
                }

                maxSub=Math.max(total,maxSub);
            }
        }
        return maxSub;
    }
}
