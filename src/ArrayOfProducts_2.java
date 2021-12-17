public class ArrayOfProducts_2 {
    public int[] arrayOfProducts(int[] array) {
        // Write your code here.
        int[] ans=new int[array.length];
        int[] left=new int[array.length];
        int[] right=new int[array.length];
        for (int i = 0; i < array.length; i++) {
            left[i]=1;
            right[i]=1;
        }
        int tempMul=1;
        for (int i = 1; i < left.length; i++) {
            tempMul=tempMul*array[i-1];
            left[i]=tempMul;
        }
        tempMul=1;
        for (int i = right.length-2; i >=0 ; i--) {
            tempMul=tempMul*array[i+1];
            right[i]=tempMul;
        }
        for (int i = 0; i < ans.length; i++) {
            ans[i]=left[i]*right[i];
        }

        return ans;
    }
}
