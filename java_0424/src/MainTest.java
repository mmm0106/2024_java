import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void getPrime() {
        assertEquals(7,Main.getPrime(4));
        assertEquals(11,Main.getPrime(5));
        assertEquals(17,Main.getPrime(7));
    }
}