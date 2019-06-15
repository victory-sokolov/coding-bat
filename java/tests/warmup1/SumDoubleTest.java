package warmup1;

import helpers.RandomTestData;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class SumDoubleTest {

    private int input;
    private int expected;

    public TestSumDouble(int input, int expected) {
        this.input = input;
        this.expected = expected;
    }


    @Parameterized.Parameters(name = "{index}: SumDouble({0} => {1})")
    public static List<Integer> testSumData() {
        return Arrays.asList(new testData[][] {
            { 6, SumDouble.sumDouble(2, 4) }, { 20, SumDouble.sumDouble(5, 5) },
            { -6, SumDouble.sumDouble(-1, -5) }, { 4, SumDouble.sumDouble(9, -5) } });
    }

    @Test
    public void testSumDouble() {
        assertThat(SumDouble.compute(input), is(equaltTo(excpected)));
    }
}
