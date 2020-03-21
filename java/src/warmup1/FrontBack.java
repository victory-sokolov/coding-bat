package warmup1;

public class FrontBack {

  public static String frontBack(String str) {

    if(str.length() <= 1) return str;

    String trimmed = str.substring(1, str.length()-1);
    return str.charAt(str.length()-1) + trimmed + str.charAt(0);

  }

}
