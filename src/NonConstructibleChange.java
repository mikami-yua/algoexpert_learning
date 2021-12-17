import java.util.Arrays;

public class NonConstructibleChange {
    public int nonConstructibleChange(int[] coins) {
        Arrays.sort(coins);
        int change=0;
        for (int i = 0; i < coins.length; i++) {
            if ((change+1)>=coins[i]){
                change+=coins[i];
            }else {
                break;
            }
        }
        return change+1;
    }
}
