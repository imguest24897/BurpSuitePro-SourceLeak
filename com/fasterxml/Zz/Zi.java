package com.fasterxml.Zz;

public class Zi {
  private static final Zs ZF = new Zs();
  
  private static final Zj Zx = new Zj();
  
  private static final Zx ZR = new Zx();
  
  public static float Zk(CharSequence paramCharSequence) throws NumberFormatException {
    return ZK(paramCharSequence, 0, paramCharSequence.length());
  }
  
  public static float ZK(CharSequence paramCharSequence, int paramInt1, int paramInt2) throws NumberFormatException {
    long l = ZR.ZX(paramCharSequence, paramInt1, paramInt2);
    return Float.intBitsToFloat((int)l);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zz\Zi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */