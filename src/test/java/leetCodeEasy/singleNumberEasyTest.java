package leetCodeEasy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class singleNumberEasyTest {

    @Test
    void singleNumber() {
        int[] ar = new int[]{2,2,1};
        assertEquals(1, singleNumberEasy.singleNumber(ar));
    }
}