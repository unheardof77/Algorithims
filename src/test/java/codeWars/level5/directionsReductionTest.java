package codeWars.level5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class directionsReductionTest {

    @Test
    void dirReduc() {
        assertArrayEquals(new String[]{"WEST"}, directionsReduction.dirReduc(new String[]{"NORTH","SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST"}));
        assertArrayEquals(new String[]{}, directionsReduction.dirReduc(new String[]{"NORTH","SOUTH","SOUTH","EAST","WEST","NORTH"}));
    }
}