package warmup1;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.List;

@RunWith(Parameterized.class)
public class Front3Test {


  private String str;
  private String expected;

  public Front3Test(String str, String expected) {
    this.str = str;
    this.expected = expected;
  }

  @Parameterized.Parameters(name = "{index} : Front3({0}) => {1}")
  public static List<Object[]> dataTest() {
    return Arrays.asList(new Object[][] {
      {"Java", "JavJavJav"}, {"aaa", "aaaaaaaaa"}, {"", ""}, {"ab", "ababab"}
    });
  }

  @Test
  public void front3Test() {
    Assert.assertEquals(Front3.front3(str) ,expected);
  }
}
