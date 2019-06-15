package warmup1;

import org.junit.Test;
import static org.junit.Assert.*;



public class TestDiff21 {

    @Test
    public void testDiff21() {
        assertEquals(21 - 12 , Diff21.diff21(12));
        assertEquals(33 , Diff21.diff21(-12));
        assertEquals(8, Diff21.diff21(25));
    }
}
