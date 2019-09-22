public String front22(String str) {

  int charAmount = 2;
  if(str.length() < charAmount) {
    charAmount = str.length();
  }

  String front = str.substring(0, charAmount);
  return front + str + front;
}
