package warmup1;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.List;

@RunWith(Parameterized.class)
public class Makes10Test {

  private int x;
  private int y;
  private boolean result;

  public Makes10Test(int x, int y, boolean result) {
    this.x = x;
    this.y = y;
    this.result = result;
  }

  @Parameterized.Parameters(name = "{index} : Makes10({0}, {1}) => {2}")
  public static List<Object[]> data() {
    return Arrays.asList(new Object[][] {
      {6, 4, true}, {10, 15, true}, {15, 1, false}
    });
  }

  @Test
  public void testMakes10() {
    Assert.assertEquals(Makes10.makes10(x, y), result);
  }
}
