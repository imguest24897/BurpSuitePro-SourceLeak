package burp;

class Zr89 implements Zt9b {
  private final Zt9b ZA;
  
  private final Zt9b Zd;
  
  private final Zt9b ZZ;
  
  private final int Zx;
  
  private final char ZP;
  
  Zr89(String paramString, char paramChar, Zxar paramZxar1, Zxar paramZxar2, Zxar paramZxar3) {
    this.ZA = paramZxar1;
    this.Zd = paramZxar2;
    this.ZZ = paramZxar3;
    this.Zx = paramString.length();
    this.ZP = paramChar;
  }
  
  public Ze6l ZL(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    // Byte code:
    //   0: invokestatic Zu : ()Z
    //   3: istore #4
    //   5: aload_0
    //   6: getfield ZA : Lburp/Zt9b;
    //   9: aload_1
    //   10: iload_2
    //   11: iload_3
    //   12: invokeinterface ZL : ([BII)Lburp/Ze6l;
    //   17: astore #5
    //   19: aload #5
    //   21: ifnonnull -> 26
    //   24: aconst_null
    //   25: areturn
    //   26: iload_3
    //   27: aload #5
    //   29: getfield ZR : I
    //   32: bipush #25
    //   34: iadd
    //   35: aload_0
    //   36: getfield Zx : I
    //   39: iconst_5
    //   40: imul
    //   41: iadd
    //   42: invokestatic min : (II)I
    //   45: istore #6
    //   47: aload_0
    //   48: getfield Zd : Lburp/Zt9b;
    //   51: aload_1
    //   52: aload #5
    //   54: getfield ZR : I
    //   57: iload #6
    //   59: invokeinterface ZL : ([BII)Lburp/Ze6l;
    //   64: astore #7
    //   66: aload #7
    //   68: ifnull -> 134
    //   71: aload_1
    //   72: aload #5
    //   74: getfield ZR : I
    //   77: aload #7
    //   79: getfield Zk : I
    //   82: invokestatic Zz : ([BII)[B
    //   85: invokestatic ZM : ([B)[B
    //   88: astore #8
    //   90: aload #8
    //   92: arraylength
    //   93: iconst_1
    //   94: if_icmpne -> 129
    //   97: aload #8
    //   99: iconst_0
    //   100: baload
    //   101: invokestatic ZB : (B)B
    //   104: aload_0
    //   105: getfield ZP : C
    //   108: if_icmpeq -> 129
    //   111: new burp/Ze6l
    //   114: dup
    //   115: aload #5
    //   117: getfield Zk : I
    //   120: aload #7
    //   122: getfield ZR : I
    //   125: invokespecial <init> : (II)V
    //   128: areturn
    //   129: iload #4
    //   131: ifne -> 202
    //   134: aload_0
    //   135: getfield ZZ : Lburp/Zt9b;
    //   138: aload_1
    //   139: aload #5
    //   141: getfield ZR : I
    //   144: iload #6
    //   146: invokeinterface ZL : ([BII)Lburp/Ze6l;
    //   151: astore #8
    //   153: aload #8
    //   155: ifnull -> 202
    //   158: aload_1
    //   159: aload #5
    //   161: getfield ZR : I
    //   164: aload #8
    //   166: getfield Zk : I
    //   169: invokestatic Zz : ([BII)[B
    //   172: invokestatic ZM : ([B)[B
    //   175: astore #9
    //   177: aload #9
    //   179: arraylength
    //   180: iconst_3
    //   181: if_icmpgt -> 202
    //   184: new burp/Ze6l
    //   187: dup
    //   188: aload #5
    //   190: getfield Zk : I
    //   193: aload #8
    //   195: getfield ZR : I
    //   198: invokespecial <init> : (II)V
    //   201: areturn
    //   202: aconst_null
    //   203: areturn
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zr89.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */