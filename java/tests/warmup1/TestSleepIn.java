package warmup1;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


public class TestSleepIn {


    private static SleepIn sleepIn;

    @Before
    public void setUp() {
        sleepIn =  new SleepIn();
    }

    @Test
    public void testSleepIn() throws Exception {
        //boolean isSleepin = sleepIn.sleepInOptiomal(getRandomBoolean(), getRandomBoolean());
        assertTrue("Expected True", sleepIn.sleepInOptiomal(true, true));
        assertTrue("Expected True", sleepIn.sleepInOptiomal(false, false));
        assertTrue("Expected True", sleepIn.sleepInOptiomal(false, true));
        assertFalse("Expected False", sleepIn.sleepInOptiomal(true, false));
    }
}
