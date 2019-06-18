package warmup1;

public class MissingChar {

  public static String missingChar(String str, int n) {
    StringBuilder newStr = new StringBuilder(str);
    return newStr.deleteCharAt(n).toString();
  }

  public static String missingCharNormal(String str, int n) {
    String front = str.substring(0, n);
    String back = str.substring(n+1, str.length());

    return front + back;

  }

}
