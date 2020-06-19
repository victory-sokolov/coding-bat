public int max1020(int a, int b) {
  int a1 = 0, b1 = 0;
  if(a >= 10 && a <= 20) {
    a1 = a;
  }

  if(b >= 10 && b <= 20) {
    b1 = b;
  }

  return (a1 > b1) ? a1 : b1;
}
