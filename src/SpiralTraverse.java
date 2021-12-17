import java.util.ArrayList;
import java.util.List;

public class SpiralTraverse {
    public static List<Integer> spiralTraverse(int[][] array) {
        // Write your code here.
        ArrayList<Integer> ans=new ArrayList<>();
        //每次循环填入一圈
        int startRow=0;
        int endRow=array.length-1;
        int startCol=0;
        int endCol=array[0].length-1;
        while (startRow<=endRow && startCol<=endCol){
            for (int i = startCol; i <= endCol; i++) {
                ans.add(array[startRow][i]);
            }
            if (startRow==endRow) break;
            for (int i = startRow+1; i <= endRow; i++) {
                ans.add(array[i][endCol]);
            }
            if (startCol==endCol) break;
            for (int i = endCol-1; i >= startCol; i--) {
                ans.add(array[endRow][i]);
            }
            for (int i = endRow-1; i >= startRow+1 ; i--) {
                ans.add(array[i][startRow]);
            }
            startRow++;
            endRow--;
            startCol++;
            endCol--;
        }


        return ans;

    }
}
