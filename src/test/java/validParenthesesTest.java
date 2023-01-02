import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class validParenthesesTest {

    @Test
    void validParentheses() {
        assertTrue(validParentheses.validParentheses("()"));
        assertFalse(validParentheses.validParentheses("zk(/rU|O(z6(YY(CI)a"));
        assertTrue(validParentheses.validParentheses("32423(sgsdg)"));
        assertFalse(validParentheses.validParentheses("()()((()"));
        assertTrue(validParentheses.validParentheses("adasdasfa"));
    }
}