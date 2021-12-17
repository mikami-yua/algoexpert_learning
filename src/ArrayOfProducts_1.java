public class ArrayOfProducts_1 {
    public int[] arrayOfProducts(int[] array) {
        // Write your code here.
        int[] ans=new int[array.length];
        for (int i = 0; i < array.length; i++) {
            int tempMul=1;
            for (int j = 0; j < array.length; j++) {
                if (i==j) continue;
                tempMul=tempMul*array[j];
            }
            ans[i]=tempMul;
        }


        return ans;
    }
}
