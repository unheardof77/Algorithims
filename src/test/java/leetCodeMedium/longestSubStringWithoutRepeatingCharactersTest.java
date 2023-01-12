package leetCodeMedium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class longestSubStringWithoutRepeatingCharactersTest {

    @Test
    void lengthOfLongestSubstring() {
        assertEquals(0, longestSubStringWithoutRepeatingCharacters.lengthOfLongestSubstring(""));
        assertEquals(1, longestSubStringWithoutRepeatingCharacters.lengthOfLongestSubstring("b"));
        assertEquals(3, longestSubStringWithoutRepeatingCharacters.lengthOfLongestSubstring("pwwkew"));

    }
}