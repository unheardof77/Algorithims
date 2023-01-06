package leetCodeEasy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class plusOneEasyTest {

    @Test
    void plusOne() {
        int[] arr = {1,2,3};
        int[] cor = {1,2,4};
        assertEquals(cor, plusOneEasy.plusOne(arr));
    }
}