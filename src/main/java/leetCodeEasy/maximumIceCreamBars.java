package leetCodeEasy;

import java.util.Arrays;

public class maximumIceCreamBars {
    public static int maxIceCream(int[]costs, int coins){
        Arrays.sort(costs);
        int count = 0;
        int total = 0;
        for (int cost : costs) {
            if (total + cost <= coins) {
                total += cost;
                count++;
            }else{
                return count;
            }
        }
        return count;
    }
}
