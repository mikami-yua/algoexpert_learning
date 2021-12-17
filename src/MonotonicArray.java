public class MonotonicArray {
    public static boolean isMonotonic(int[] array) {
        // Write your code here.
        if (array.length<=2) return true;
        if (array[0]-array[array.length-1]<0){
            //增
            for (int i = 0; i < array.length-1; i++) {
                if (array[i+1]-array[i] <0) return false;
            }
        }else {
            for (int i = 0; i < array.length-1; i++) {
                if (array[i+1]-array[i] >0) return false;
            }
        }

        return true;
    }
}
