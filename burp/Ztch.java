package burp;

class Ztch {
  private final Zlpd ZM;
  
  private final Zlpd Zl;
  
  private final Zlyd ZI;
  
  private final Zbkr ZY;
  
  private final Zr1m Zw;
  
  private static final String a;
  
  private Ztch(Zxg9 paramZxg9, Zlyd paramZlyd, Zr_4 paramZr_41, Zr_4 paramZr_42, Zbkr paramZbkr, Zr1m paramZr1m) {
    this.ZI = paramZlyd;
    this.ZY = paramZbkr;
    this.Zw = paramZr1m;
    this.ZM = new Zlg7(paramZxg9, paramZr_41);
    this.Zl = new Zlzd(paramZlyd, paramZr_42);
    Zn();
  }
  
  private void Zn() {
    this.ZY.ZP(a, Zk97.DESKTOP_SETTINGS_NETWORK_CONNECTIONS_PLATFORM_AUTHENTICATION, this.Zw, new String[] { ZW().ZI() });
  }
  
  private Zlpd ZW() {
    return ZF() ? this.Zl : this.ZM;
  }
  
  private boolean ZF() {
    return !this.ZI.ZBC();
  }
  
  private void ZV(boolean paramBoolean) {
    this.ZI.ZG(!paramBoolean);
    Zn();
  }
  
  static {
    // Byte code:
    //   0: bipush #94
    //   2: ldc 'Wx!m+px ,gOp6j0kU'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Ztch.a : Ljava/lang/String;
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
    //   80: bipush #50
    //   82: goto -> 112
    //   85: bipush #101
    //   87: goto -> 112
    //   90: bipush #71
    //   92: goto -> 112
    //   95: bipush #11
    //   97: goto -> 112
    //   100: bipush #85
    //   102: goto -> 112
    //   105: bipush #26
    //   107: goto -> 112
    //   110: bipush #92
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztch.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */