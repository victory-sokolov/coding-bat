package warmup1;

public class Front3 {

  public static String front3(String str) {

    String front;
    if(str.length() < 3) {
      return str + str + str;
    }

    front = str.substring(0, 3);
    return front + front + front;
  }
}
