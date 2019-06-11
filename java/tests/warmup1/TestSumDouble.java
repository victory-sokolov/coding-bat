package warmup1;

import helpers.RandomTestData;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestSumDouble {

    @Test
    public void testSumDouble() {
       assertEquals(6, SumDouble.sumDouble(2, 4));
       assertEquals(20, SumDouble.sumDouble(5, 5));
       assertEquals(-6 ,SumDouble.sumDouble(-1, -5));
       assertEquals(4 ,SumDouble.sumDouble(9, -5));
    }
}
