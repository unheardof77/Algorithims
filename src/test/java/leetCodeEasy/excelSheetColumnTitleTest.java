package leetCodeEasy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class excelSheetColumnTitleTest {

    @Test
    void convertToTitle() {
        assertEquals("A", excelSheetColumnTitle.convertToTitle(1));
        assertEquals("AB", excelSheetColumnTitle.convertToTitle(28));
        assertEquals("ZY", excelSheetColumnTitle.convertToTitle(701));
    }
}