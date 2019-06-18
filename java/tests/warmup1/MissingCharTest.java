package warmup1;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.List;

@RunWith(Parameterized.class)
public class MissingCharTest {

  private String str;
  private int n;
  private String result;

  public MissingCharTest(String str, int n, String result) {
    this.str = str;
    this.n = n;
    this.result = result;
  }

  @Parameterized.Parameters(name = "{index} : MissingChar({0}, {1} => {3})")
  public static List<Object[]> dateTest() {
    return Arrays.asList(new Object[][] {
      {"Hello", 3, "Helo"}, {"Hi", 0, "i"}, {"H", 0, ""}
    });
  }

  @Test
  public void testMissingCharacter() {
    Assert.assertEquals(MissingChar.missingChar(str, n), result);
  }
}
