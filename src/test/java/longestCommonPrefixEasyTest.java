import leetCodeEasy.longestCommonPrefixEasy;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class longestCommonPrefixEasyTest {

    @Test
    void longestCommonPrefix() {
        String[] arOfStr = new String[]{"flower","flow","flight"};
        assertEquals("fl", longestCommonPrefixEasy.longestCommonPrefix(arOfStr));
    }
}