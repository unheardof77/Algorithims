package leetCodeMedium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class stringToIntAtoiTest {

    @Test
    void myAtoi() {
        assertEquals(2147483647, stringToIntAtoi.myAtoi("10000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000522545459"));
    }
}