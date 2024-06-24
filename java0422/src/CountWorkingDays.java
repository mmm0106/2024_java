import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountWorkingDays {

    @Test
    void countWorkingDays() {
        assertEquals(2,Main.countWorkingDays("2024/05/15","2024/05/16"));
        assertEquals(5,Main.countWorkingDays("2024/05/16","2024/05/22"));
        assertEquals(5,Main.countWorkingDays("2024/05/22","2024/05/28"));
        assertEquals(0,Main.countWorkingDays("2024/05/25","2024/05/26"));

    }
}