import leetCodeEasy.searchInsertPositionEasy;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class searchInsertPositionEasyTest {

    @Test
    void searchInsert() {
        int[] ar = new int[]{1,2,3,4,5,6,7,8,9};
        assertEquals(0, searchInsertPositionEasy.searchInsert(ar, 1));
//        assertEquals(1, leetCodeEasy.searchInsertPositionEasy.searchInsert(ar, 2));
        assertEquals(2, searchInsertPositionEasy.searchInsert(ar, 3));
//        assertEquals(3, leetCodeEasy.searchInsertPositionEasy.searchInsert(ar, 4));
        assertEquals(4, searchInsertPositionEasy.searchInsert(ar, 5));
        assertEquals(5, searchInsertPositionEasy.searchInsert(ar, 6));
        assertEquals(6, searchInsertPositionEasy.searchInsert(ar, 7));
        assertEquals(7, searchInsertPositionEasy.searchInsert(ar, 8));
        assertEquals(8, searchInsertPositionEasy.searchInsert(ar, 9));
    }
}