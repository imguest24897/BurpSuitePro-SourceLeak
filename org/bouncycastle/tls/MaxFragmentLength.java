package org.bouncycastle.tls;

public class MaxFragmentLength {
  public static final short pow2_9 = 1;
  
  public static final short pow2_10 = 2;
  
  public static final short pow2_11 = 3;
  
  public static final short pow2_12 = 4;
  
  public static boolean isValid(short paramShort) {
    return (paramShort >= 1 && paramShort <= 4);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tls\MaxFragmentLength.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */