package net.portswigger;

public class Zm2 {
  private static Zf2 Zd;
  
  private static int ZG;
  
  private static final String a;
  
  public static synchronized void Zn(Zf2 paramZf2) {
    try {
      if (paramZf2 == null)
        throw new IllegalArgumentException(a); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    Zd = paramZf2;
  }
  
  public static synchronized void Zi(Zzr paramZzr, long paramLong) {
    Zd.Zx(paramZzr, paramLong);
  }
  
  public static synchronized void Ze(Zgl paramZgl, Zzr paramZzr, long paramLong) {
    Zd.ZN(paramZgl, paramZzr, paramLong);
  }
  
  public static synchronized void ZC(Zip paramZip) {
    Zd.Z_(paramZip);
  }
  
  public static synchronized void Zo(Zfp paramZfp) {
    Zd.Zj(paramZfp);
  }
  
  public static synchronized void Zw(String paramString) {
    Zd.ZN(paramString);
  }
  
  public static synchronized void ZD(String paramString) {
    Zd.ZK(paramString);
  }
  
  public static synchronized void ZB(Zrmw paramZrmw, String paramString) {
    Zd.ZU(paramZrmw, paramString);
  }
  
  public static synchronized void Zz(Zgl paramZgl, Zrmw paramZrmw, String paramString) {
    Zd.Zr(paramZgl, paramZrmw, paramString);
  }
  
  static {
    // Byte code:
    //   0: invokestatic Zx : ()I
    //   3: ifne -> 11
    //   6: bipush #35
    //   8: invokestatic ZZ : (I)V
    //   11: bipush #82
    //   13: ldc '!\F[ojM@\\nLgVMOL"bLM\\nPm{\\\nPwcU'
    //   15: iconst_m1
    //   16: goto -> 25
    //   19: putstatic net/portswigger/Zm2.a : Ljava/lang/String;
    //   22: goto -> 166
    //   25: dup_x2
    //   26: pop
    //   27: invokevirtual toCharArray : ()[C
    //   30: dup_x1
    //   31: arraylength
    //   32: dup_x2
    //   33: pop
    //   34: iconst_0
    //   35: istore_0
    //   36: dup2_x1
    //   37: pop2
    //   38: dup_x2
    //   39: iconst_1
    //   40: if_icmpgt -> 140
    //   43: dup2
    //   44: swap
    //   45: iload_0
    //   46: dup2_x1
    //   47: caload
    //   48: swap
    //   49: iload_0
    //   50: bipush #7
    //   52: irem
    //   53: tableswitch default -> 122, 0 -> 92, 1 -> 97, 2 -> 102, 3 -> 107, 4 -> 112, 5 -> 117
    //   92: bipush #39
    //   94: goto -> 124
    //   97: bipush #107
    //   99: goto -> 124
    //   102: bipush #120
    //   104: goto -> 124
    //   107: bipush #108
    //   109: goto -> 124
    //   112: bipush #80
    //   114: goto -> 124
    //   117: bipush #93
    //   119: goto -> 124
    //   122: bipush #107
    //   124: ixor
    //   125: ixor
    //   126: i2c
    //   127: castore
    //   128: iinc #0, 1
    //   131: dup
    //   132: ifne -> 140
    //   135: dup2
    //   136: dup_x1
    //   137: goto -> 46
    //   140: dup2_x1
    //   141: pop2
    //   142: dup_x2
    //   143: iload_0
    //   144: if_icmpgt -> 43
    //   147: pop
    //   148: new java/lang/String
    //   151: dup_x1
    //   152: swap
    //   153: invokespecial <init> : ([C)V
    //   156: invokevirtual intern : ()Ljava/lang/String;
    //   159: swap
    //   160: pop
    //   161: swap
    //   162: pop
    //   163: goto -> 19
    //   166: new net/portswigger/Zcn
    //   169: dup
    //   170: invokespecial <init> : ()V
    //   173: putstatic net/portswigger/Zm2.Zd : Lnet/portswigger/Zf2;
    //   176: return
  }
  
  public static void ZZ(int paramInt) {
    ZG = paramInt;
  }
  
  public static int Zx() {
    return ZG;
  }
  
  public static int ZS() {
    int i = Zx();
    try {
      if (i == 0)
        return 28; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return 0;
  }
  
  private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
    return paramIllegalArgumentException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zm2.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */