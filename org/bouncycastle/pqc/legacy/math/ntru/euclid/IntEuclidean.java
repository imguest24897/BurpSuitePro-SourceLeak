package org.bouncycastle.pqc.legacy.math.ntru.euclid;

public class IntEuclidean {
  public int x;
  
  public int y;
  
  public int gcd;
  
  public static IntEuclidean calculate(int paramInt1, int paramInt2) {
    int i = 0;
    int j = 1;
    int k = 1;
    int m;
    for (m = 0; paramInt2 != 0; m = i1) {
      int n = paramInt1 / paramInt2;
      int i1 = paramInt1;
      paramInt1 = paramInt2;
      paramInt2 = i1 % paramInt2;
      i1 = i;
      i = j - n * i;
      j = i1;
      i1 = k;
      k = m - n * k;
    } 
    IntEuclidean intEuclidean = new IntEuclidean();
    intEuclidean.x = j;
    intEuclidean.y = m;
    intEuclidean.gcd = paramInt1;
    return intEuclidean;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\legacy\math\ntru\euclid\IntEuclidean.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */