package burp;

class Zlg7 implements Zlpd {
  private final Zxg9 Zq;
  
  private final Ztnt ZM;
  
  private final Zecc ZW;
  
  private static final String a;
  
  private Zlg7(Zxg9 paramZxg9, Zr_4 paramZr_4) {
    this.Zq = paramZxg9;
    this.ZM = paramZxg9.ZP5();
    this.ZW = new Zecc(paramZr_4);
  }
  
  public String ZI() {
    return a;
  }
  
  public Zrul ZU() {
    return this.Zq;
  }
  
  public Ztnt ZT() {
    return this.ZM;
  }
  
  public Zecc ZA() {
    return this.ZW;
  }
  
  public void ZS(boolean paramBoolean) {
    this.Zq.Zx(paramBoolean);
  }
  
  public void ZG(boolean paramBoolean) {
    this.Zq.Zy(paramBoolean);
  }
  
  public void Za(Zkjm paramZkjm) {
    // Byte code:
    //   0: invokestatic Zb : ()Ljava/lang/String;
    //   3: astore_2
    //   4: aload_1
    //   5: invokevirtual Zn : ()I
    //   8: tableswitch default -> 69, 0 -> 69, 1 -> 40, 2 -> 60, 3 -> 50
    //   40: getstatic burp/Zrrh.USER_OPTIONS_CONNECTIONS_PLATFORM_AUTHENTICATION_BASIC_USED : Lburp/Zrrh;
    //   43: invokestatic ZC : (Lnet/portswigger/Zip;)V
    //   46: aload_2
    //   47: ifnonnull -> 69
    //   50: getstatic burp/Zrrh.USER_OPTIONS_CONNECTIONS_PLATFORM_AUTHENTICATION_NTLM1_USED : Lburp/Zrrh;
    //   53: invokestatic ZC : (Lnet/portswigger/Zip;)V
    //   56: aload_2
    //   57: ifnonnull -> 69
    //   60: getstatic burp/Zrrh.USER_OPTIONS_CONNECTIONS_PLATFORM_AUTHENTICATION_NTLM2_USED : Lburp/Zrrh;
    //   63: invokestatic ZC : (Lnet/portswigger/Zip;)V
    //   66: goto -> 69
    //   69: return
  }
  
  static {
    // Byte code:
    //   0: bipush #13
    //   2: ldc 'Q`o-K|ClLwS6L<@.\\rD`]\\rVw^6C\\b{_,'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zlg7.a : Ljava/lang/String;
    //   11: goto -> 154
    //   14: dup_x2
    //   15: pop
    //   16: invokevirtual toCharArray : ()[C
    //   19: dup_x1
    //   20: arraylength
    //   21: dup_x2
    //   22: pop
    //   23: iconst_0
    //   24: istore_0
    //   25: dup2_x1
    //   26: pop2
    //   27: dup_x2
    //   28: iconst_1
    //   29: if_icmpgt -> 128
    //   32: dup2
    //   33: swap
    //   34: iload_0
    //   35: dup2_x1
    //   36: caload
    //   37: swap
    //   38: iload_0
    //   39: bipush #7
    //   41: irem
    //   42: tableswitch default -> 110, 0 -> 80, 1 -> 85, 2 -> 90, 3 -> 95, 4 -> 100, 5 -> 105
    //   80: bipush #96
    //   82: goto -> 112
    //   85: bipush #47
    //   87: goto -> 112
    //   90: bipush #113
    //   92: goto -> 112
    //   95: bipush #31
    //   97: goto -> 112
    //   100: bipush #61
    //   102: goto -> 112
    //   105: bipush #79
    //   107: goto -> 112
    //   110: bipush #97
    //   112: ixor
    //   113: ixor
    //   114: i2c
    //   115: castore
    //   116: iinc #0, 1
    //   119: dup
    //   120: ifne -> 128
    //   123: dup2
    //   124: dup_x1
    //   125: goto -> 35
    //   128: dup2_x1
    //   129: pop2
    //   130: dup_x2
    //   131: iload_0
    //   132: if_icmpgt -> 32
    //   135: pop
    //   136: new java/lang/String
    //   139: dup_x1
    //   140: swap
    //   141: invokespecial <init> : ([C)V
    //   144: invokevirtual intern : ()Ljava/lang/String;
    //   147: swap
    //   148: pop
    //   149: swap
    //   150: pop
    //   151: goto -> 8
    //   154: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlg7.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */