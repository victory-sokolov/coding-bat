public boolean mixStart(String str) {
  if(str.equals("")) return false;
  if(str.length() >= 3) {
    return str.substring(1,3).equals("ix") ? true : false;
  }

  return false;
}
