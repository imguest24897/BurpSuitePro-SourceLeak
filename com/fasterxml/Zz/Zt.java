package com.fasterxml.Zz;

public class Zt {
  private static final Zv Ze = new Zv();
  
  private static final Zk Zn = new Zk();
  
  private static final Zr ZZ = new Zr();
  
  public static double Z_(CharSequence paramCharSequence) throws NumberFormatException {
    return ZK(paramCharSequence, 0, paramCharSequence.length());
  }
  
  public static double ZK(CharSequence paramCharSequence, int paramInt1, int paramInt2) throws NumberFormatException {
    long l = ZZ.ZX(paramCharSequence, paramInt1, paramInt2);
    return Double.longBitsToDouble(l);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zz\Zt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */