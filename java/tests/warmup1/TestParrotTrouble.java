package warmup1;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;



@RunWith(Parameterized.class)
public class TestParrotTrouble {

    private boolean talking;
    private int hours;
    private boolean expected;

    public TestParrotTrouble(boolean talking, int hours, boolean expected) {
        this.hours = hours;
        this.talking = talking;
        this.expected = expected;
    }

    @Parameterized.Parameters(name = "{index}: ParrotTrouble({0},{1}) => {2}")
    public static List<Object[]> data() {
        return Arrays.asList(new Object[][] { { true, 6, true }, { true, 7, false }, { false, 6, false } });
    }

    @Test
    public void testParrotTrouble() {
        Assert.assertThat(ParrotTrouble.parrotTrouble(talking, hours), is(equalTo(expected)));
    }
}
