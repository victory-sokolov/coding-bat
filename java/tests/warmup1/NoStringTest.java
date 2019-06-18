package warmup1;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.List;

@RunWith(Parameterized.class)
public class NoStringTest {

  private String str;
  private String expected;

  public NoStringTest(String str, String expected) {
    this.str = str;
    this.expected = expected;
  }


  @Parameterized.Parameters(name = "{index} : NoString({0} => 1")
  public static List<Object[]> dataTest() {
    return Arrays.asList(new Object[][] {
      {"candy", "not candy"}, {"not bad", "not bad"},
      {"Not available", "Not available"}, {"1not here", "not 1not here"}
    });
  }

  @Test
  public void testNoString() {
    Assert.assertEquals(NoString.notString(str) , expected);
  }
}
