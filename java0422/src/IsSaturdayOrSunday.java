import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsSaturdayOrSunday {

    @Test
    void isSaturdayOrSunday() {
        assertEquals(true,Main.isSaturdayOrSunday("2023/05/14"));
        assertEquals(false,Main.isSaturdayOrSunday("2023/05/15"));
        assertEquals(false,Main.isSaturdayOrSunday("2023/05/16"));
        assertEquals(false,Main.isSaturdayOrSunday("2023/05/17"));
        assertEquals(false,Main.isSaturdayOrSunday("2023/05/18"));
        assertEquals(false,Main.isSaturdayOrSunday("2023/05/19"));
        assertEquals(true,Main.isSaturdayOrSunday("2023/05/20"));
        assertEquals(true,Main.isSaturdayOrSunday("2023/05/21"));
        assertEquals(false,Main.isSaturdayOrSunday("2023/05/22"));
        assertEquals(false,Main.isSaturdayOrSunday("2023/05/23"));
        assertEquals(false,Main.isSaturdayOrSunday("2023/05/24"));
        assertEquals(false,Main.isSaturdayOrSunday("2023/05/25"));
    }
}