package org.bouncycastle.pqc.crypto.crystals.kyber;

class Reduce {
  public static short montgomeryReduce(int paramInt) {
    short s = (short)(paramInt * 62209);
    int i = s * 3329;
    i = paramInt - i;
    i >>= 16;
    return (short)i;
  }
  
  public static short barretReduce(short paramShort) {
    long l = 67108864L;
    short s2 = (short)(int)((l + 1664L) / 3329L);
    short s1 = (short)(s2 * paramShort >> 26);
    s1 = (short)(s1 * 3329);
    return (short)(paramShort - s1);
  }
  
  public static short conditionalSubQ(short paramShort) {
    paramShort = (short)(paramShort - 3329);
    return (short)(paramShort + (paramShort >> 15 & 0xD01));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\crypto\crystals\kyber\Reduce.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */