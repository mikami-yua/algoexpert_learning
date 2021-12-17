import java.util.List;

public class ValidSubsequence {
    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
        int arrayPointer=0;
        int sequencePointer=0;
        while (arrayPointer<array.size() && sequencePointer<sequence.size()){
            if (array.get(arrayPointer)==sequence.get(sequencePointer)){
                if (sequencePointer==sequence.size()-1){
                    return true;
                }
                arrayPointer++;
                sequencePointer++;

            }else {
                arrayPointer++;
            }
        }
        return false;
    }
}
