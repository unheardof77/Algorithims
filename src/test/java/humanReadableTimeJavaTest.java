import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class humanReadableTimeJavaTest {

    @Test
    void makeReadable() {
        assertEquals("00:00:00", humanReadableTimeJava.makeReadable(0));
        assertEquals( "00:00:00", humanReadableTimeJava.makeReadable(0));
        assertEquals( "00:00:05", humanReadableTimeJava.makeReadable(5));
        assertEquals( "00:01:00", humanReadableTimeJava.makeReadable(60));
        assertEquals( "23:59:59", humanReadableTimeJava.makeReadable(86399));
        assertEquals( "99:59:59", humanReadableTimeJava.makeReadable(359999));
    }
}