import leetCodeEasy.addBinaryEasy;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.*;

class addBinaryEasyTest {

    @Test
    void convertToDecimal() {
        assertEquals(new BigInteger("526700554598729746900966573811"), addBinaryEasy.convertToDecimal("110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011"));
//        assertEquals(5, leetCodeEasy.addBinaryEasy.convertToDecimal("101"));
//        assertEquals(345, leetCodeEasy.addBinaryEasy.convertToDecimal("000101011001"));
    }

    @Test
    void addBinary() {
        assertEquals("1010", addBinaryEasy.addBinary("101", "101"));
        assertEquals("110111101100010011000101110110100000011101000101011001000011011000001100011110011010010011000000000", addBinaryEasy.addBinary("10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101", "110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011"));
    }
}