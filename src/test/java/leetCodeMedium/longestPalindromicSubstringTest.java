package leetCodeMedium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class longestPalindromicSubstringTest {

    @Test
    void longestPalindrome() {
        assertEquals("ccc", longestPalindromicSubstring.longestPalindrome("ccc"));
        assertEquals("bab", longestPalindromicSubstring.longestPalindrome("babad"));
        assertEquals("racecar", longestPalindromicSubstring.longestPalindrome("racecar"));
        assertEquals("b", longestPalindromicSubstring.longestPalindrome("barcdab"));
        assertEquals("bb", longestPalindromicSubstring.longestPalindrome("abb"));
    }
}