public int intMax(int a, int b, int c) {
  int max = (a > b && a > c) ? a : b;
  return (max > c) ? max : c;
}
