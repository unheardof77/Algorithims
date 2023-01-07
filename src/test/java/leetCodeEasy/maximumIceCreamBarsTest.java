package leetCodeEasy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class maximumIceCreamBarsTest {

    @Test
    void maxIceCream() {
        int[] ar = new int[]{1,3,2,4,1};
        assertEquals(4, maximumIceCreamBars.maxIceCream(ar, 7));
    }
}