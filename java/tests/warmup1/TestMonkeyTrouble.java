package warmup1;


import org.junit.Test;
import static org.junit.Assert.*;

public class TestMonkeyTrouble {

    @Test
    public void testMonkeyTrouble() {
        assertTrue(MonkeyTrouble.monkeyTrouble(true, true));
        assertTrue(MonkeyTrouble.monkeyTrouble(false, false));

        assertFalse(MonkeyTrouble.monkeyTrouble(true, false));
        assertFalse(MonkeyTrouble.monkeyTrouble(false, true));
    }
}
