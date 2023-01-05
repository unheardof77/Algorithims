package leetCodeEasy;

import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class singleNumberEasy {

    static public int singleNumber(int[] nums){
        HashMap<Integer, Integer> numberFreq = new HashMap<>();
        for (int num : nums) {
            if (numberFreq.getOrDefault(num, 1) == null) {
                numberFreq.put(num, num);
            } else {
                numberFreq.put(num, null);
            }
        }
        AtomicInteger misMatch = new AtomicInteger();
        numberFreq.forEach((key, value) -> {
            if(value ==null) misMatch.set((int) key);
        });
        return misMatch.intValue();
    }
}
