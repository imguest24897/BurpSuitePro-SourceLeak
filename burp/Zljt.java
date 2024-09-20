package burp;

class Zljt {
  private final Zri3 ZU;
  
  private final Zri3 Zb;
  
  private final Ztrg ZQ;
  
  private final Zbkr Zn;
  
  private final Zr1m ZV;
  
  private static final String a;
  
  private Zljt(Zrgk paramZrgk, Ztrg paramZtrg, Zbkr paramZbkr, Zr1m paramZr1m) {
    this.ZQ = paramZtrg;
    this.ZU = new Zgnq(paramZrgk);
    this.Zb = new Zb3g(paramZtrg);
    this.Zn = paramZbkr;
    this.ZV = paramZr1m;
    ZZ();
  }
  
  private void ZZ() {
    this.Zn.ZP(a, Zk97.DESKTOP_SETTINGS_NETWORK_CONNECTIONS_UPSTREAM_PROXY_SERVERS, this.ZV, new String[] { ZD().Zy() });
  }
  
  private Zri3 ZD() {
    return ZA() ? this.Zb : this.ZU;
  }
  
  private boolean ZA() {
    return !this.ZQ.Zf();
  }
  
  private void Zu(boolean paramBoolean) {
    this.ZQ.Zl(!paramBoolean);
    ZZ();
  }
  
  static {
    // Byte code:
    //   0: bipush #43
    //   2: ldc '}+\\b1A(e{7\0((7E;{'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zljt.a : Ljava/lang/String;
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
    //   80: bipush #35
    //   82: goto -> 112
    //   85: bipush #112
    //   87: goto -> 112
    //   90: bipush #80
    //   92: goto -> 112
    //   95: bipush #110
    //   97: goto -> 112
    //   100: bipush #24
    //   102: goto -> 112
    //   105: bipush #80
    //   107: goto -> 112
    //   110: bipush #98
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zljt.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */