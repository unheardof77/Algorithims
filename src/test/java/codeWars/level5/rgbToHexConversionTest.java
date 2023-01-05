package codeWars.level5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class rgbToHexConversionTest {

    @Test
    void rgb() {
        assertEquals("000000", rgbToHexConversion.rgb(0, 0, 0));
        assertEquals("FFFFFF", rgbToHexConversion.rgb(255,255,255));
        assertEquals("FEFDFC", rgbToHexConversion.rgb(254,253,252));
        assertEquals("00FF7D", rgbToHexConversion.rgb(-20, 275, 125));
        assertEquals("010203", rgbToHexConversion.rgb(1,2,3));
    }
}