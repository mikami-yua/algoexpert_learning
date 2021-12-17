import java.util.List;

public class MoveElementToEnd {
    public static List<Integer> moveElementToEnd(List<Integer> array, int toMove) {
        // Write your code here.
        int left=0,right=array.size()-1;
        while (left<right){
            if (array.get(left)!=toMove){
                left++;
            }
            if (array.get(right)==toMove){
                right--;
            }
            if (array.get(left)==toMove && array.get(right)!=toMove){
                int temp=array.get(left);
                array.set(left,array.get(right));
                array.set(right,temp);
                left++;
                right--;
            }
        }

        return array;
    }
}
