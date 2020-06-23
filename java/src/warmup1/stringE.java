/*
Return true if the given string contains between 1 and 3 'e' chars.

stringE("Hello") → true
stringE("Heelle") → true
stringE("Heelele") → false
*/

public boolean stringE(String str) {
  long count = str.chars().filter(ch -> ch == 'e').count();
  return count >= 1 && count <= 3 ? true : false;
}
