import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsWeekday {

    @Test
    void isWeekday() {
        assertEquals(false,Main.isWeekday("2023/05/14"));
        assertEquals(true,Main.isWeekday("2023/05/15"));
        assertEquals(true,Main.isWeekday("2023/05/16"));
        assertEquals(true,Main.isWeekday("2023/05/17"));
        assertEquals(true,Main.isWeekday("2023/05/18"));
        assertEquals(true,Main.isWeekday("2023/05/19"));
        assertEquals(false,Main.isWeekday("2023/05/20"));
        assertEquals(false,Main.isWeekday("2023/05/21"));
        assertEquals(true,Main.isWeekday("2023/05/22"));
        assertEquals(true,Main.isWeekday("2023/05/23"));
        assertEquals(false,Main.isWeekday("2023/05/27"));
        assertEquals(false,Main.isWeekday("2023/05/28"));

    }
}