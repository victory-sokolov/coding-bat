package warmup1;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.List;

@RunWith(Parameterized.class)
public class SumDoubleTest {

    private int x;
    private int y;
    private int expected;

    public SumDoubleTest(int x, int y, int expected) {
        this.x = x;
        this.y = y;
        this.expected = expected;
    }


    @Parameterized.Parameters(name = "{index}: SumDouble({0}, {1}) => {2}") // showing message in test
    public static List<Object[]> testSumData() {
        return Arrays.asList(new Object[][] {
          {1, 2 ,3}, {3, 2, 5}, {3, 4, 7}, {3, 3, 12}, {-3, -5, -8}
        });
    }

    @Test
    public void testSumDouble() {
        Assert.assertEquals(SumDouble.sumDouble(x, y), expected);
    }
}
