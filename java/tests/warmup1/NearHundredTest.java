package warmup1;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.List;

@RunWith(Parameterized.class)
public class NearHundredTest {

  private int x;
  private boolean result;

  public NearHundredTest(int x, boolean result) {
    this.x = x;
    this.result = result;
  }

  @Parameterized.Parameters(name = "{index} : NearHunred({0}) => {1}")
  public static List<Object[]> data() {
    return Arrays.asList(new Object[][] {
      {93, true}, {90, true}, {89, false}
    });
  }


  @Test
  public void testNearHundred() {
    Assert.assertEquals(NearHundred.nearHundred(x), result);
  }
}
