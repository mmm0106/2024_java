import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GetNextWeekday {

    @Test
    void getNextWeekday() {
        assertEquals("2023/05/15",Main.getNextWeekday("2023/05/14"));
        assertEquals("2023/05/17",Main.getNextWeekday("2023/05/16"));
        assertEquals("2023/05/19",Main.getNextWeekday("2023/05/18"));
        assertEquals("2023/05/22",Main.getNextWeekday("2023/05/20"));

    }
}
