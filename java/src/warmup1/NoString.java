package warmup1;

public class NoString {

  public static String notString(String str) {
    if(!str.toLowerCase().startsWith("not")) {
      return "not " + str;
    }
    return str;
  }


}
