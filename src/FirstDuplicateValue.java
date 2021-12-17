import java.util.HashSet;
import java.util.Set;

public class FirstDuplicateValue {
    public int firstDuplicateValue(int[] array) {
        // Write your code here.
        Set set=new HashSet();
        for (int i = 0; i < array.length; i++) {
            if (!set.contains(array[i])){
                set.add(array[i]);
            }else {
                return array[i];
            }
        }
        return -1;
    }
}
