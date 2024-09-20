package burp;

public class Zeeq {
  private final int ZI;
  
  private final int ZD;
  
  private final int ZG;
  
  private final Zse4 Zu;
  
  private final byte[] Zl;
  
  private final Zt0e Zf;
  
  private final int ZR;
  
  private final int Zg;
  
  Zeeq(Zse4 paramZse4, byte[] paramArrayOfbyte, Zt0e paramZt0e) {
    this.Zu = paramZse4;
    this.Zl = paramArrayOfbyte;
    this.Zf = paramZt0e;
    int i = paramZse4.Zt();
    this.Zg = Zj(paramArrayOfbyte, i);
    this.ZR = this.Zg / i;
    this.ZI = 0;
    this.ZD = -1 >>> 8 * (4 - this.ZR);
    this.ZG = ZW(this.ZR);
  }
  
  void ZK(int paramInt, Ztx4 paramZtx4, Zzgp paramZzgp) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Zf : Lburp/Zt0e;
    //   4: iload_1
    //   5: invokevirtual ZV : (I)V
    //   8: invokestatic Zj : ()Z
    //   11: aload_0
    //   12: getfield Zf : Lburp/Zt0e;
    //   15: aload_2
    //   16: invokevirtual Zl : (Lburp/Ztx4;)V
    //   19: istore #4
    //   21: aload_0
    //   22: getfield Zu : Lburp/Zse4;
    //   25: aload_2
    //   26: invokevirtual Zo : (Lburp/Ztx4;)I
    //   29: istore #5
    //   31: iload #5
    //   33: iconst_m1
    //   34: if_icmpne -> 48
    //   37: aload_3
    //   38: invokeinterface Ze : ()V
    //   43: return
    //   44: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   47: athrow
    //   48: aload_0
    //   49: iload_1
    //   50: iload #5
    //   52: invokevirtual ZZ : (II)I
    //   55: istore #6
    //   57: iload #6
    //   59: aload_0
    //   60: getfield ZI : I
    //   63: if_icmpne -> 84
    //   66: aload_3
    //   67: invokeinterface Ze : ()V
    //   72: iload #4
    //   74: ifeq -> 220
    //   77: goto -> 84
    //   80: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   83: athrow
    //   84: iload #6
    //   86: aload_0
    //   87: getfield ZD : I
    //   90: if_icmpne -> 118
    //   93: goto -> 100
    //   96: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   99: athrow
    //   100: aload_3
    //   101: invokeinterface Zf : ()V
    //   106: iload #4
    //   108: ifeq -> 220
    //   111: goto -> 118
    //   114: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   117: athrow
    //   118: iload #5
    //   120: aload_0
    //   121: getfield Zu : Lburp/Zse4;
    //   124: invokevirtual ZE : ()I
    //   127: if_icmpge -> 203
    //   130: goto -> 137
    //   133: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   136: athrow
    //   137: iload #6
    //   139: aload_0
    //   140: getfield ZG : I
    //   143: iand
    //   144: ifne -> 176
    //   147: goto -> 154
    //   150: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   153: athrow
    //   154: aload_3
    //   155: iload #6
    //   157: iconst_1
    //   158: isub
    //   159: invokeinterface ZT : (I)V
    //   164: iload #4
    //   166: ifeq -> 220
    //   169: goto -> 176
    //   172: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   175: athrow
    //   176: aload_3
    //   177: iload #6
    //   179: aload_0
    //   180: getfield ZG : I
    //   183: ixor
    //   184: iconst_1
    //   185: isub
    //   186: invokeinterface ZR : (I)V
    //   191: iload #4
    //   193: ifeq -> 220
    //   196: goto -> 203
    //   199: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   202: athrow
    //   203: aload_3
    //   204: iload #6
    //   206: iconst_1
    //   207: isub
    //   208: invokeinterface Zh : (I)V
    //   213: goto -> 220
    //   216: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   219: athrow
    //   220: return
    // Exception table:
    //   from	to	target	type
    //   31	44	44	java/lang/IllegalArgumentException
    //   57	77	80	java/lang/IllegalArgumentException
    //   66	93	96	java/lang/IllegalArgumentException
    //   84	111	114	java/lang/IllegalArgumentException
    //   100	130	133	java/lang/IllegalArgumentException
    //   118	147	150	java/lang/IllegalArgumentException
    //   137	169	172	java/lang/IllegalArgumentException
    //   154	196	199	java/lang/IllegalArgumentException
    //   176	213	216	java/lang/IllegalArgumentException
  }
  
  static int ZB(int paramInt) {
    try {
      if (paramInt < 126)
        return 1; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (paramInt < 32766)
        return 2; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (paramInt < 8388606)
        return 3; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return 4;
  }
  
  static int ZW(int paramInt) {
    return 1 << paramInt * 8 - 1;
  }
  
  private int Zj(byte[] paramArrayOfbyte, int paramInt) {
    boolean bool = Zse4.Zj();
    byte b = 1;
    while (b <= 4) {
      int i = paramArrayOfbyte.length / paramInt * b;
      try {
        if (b == ZB(i))
          return b * paramInt; 
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
      b++;
      if (bool)
        break; 
    } 
    throw new IllegalArgumentException();
  }
  
  private int ZZ(int paramInt1, int paramInt2) {
    int i = paramInt1 * this.Zg + paramInt2 * this.ZR;
    int j = 0;
    byte b = 0;
    boolean bool = Zse4.ZM();
    while (b < this.ZR) {
      j += (0xFF & this.Zl[i + b]) << b * 8;
      b++;
      if (!bool)
        break; 
    } 
    return j;
  }
  
  private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
    return paramIllegalArgumentException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zeeq.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */