package burp;

class Zboy {
  private final Zg5i Zm;
  
  private final Zg5i ZX;
  
  private final Zr99 ZD;
  
  private final Zbkr ZR;
  
  private final Zr1m ZY;
  
  private static final String a;
  
  private Zboy(Zlf2 paramZlf2, Zr99 paramZr99, Zr1m paramZr1m, Zbkr paramZbkr) {
    this.ZD = paramZr99;
    this.ZR = paramZbkr;
    this.ZY = paramZr1m;
    this.Zm = new Zdl(paramZlf2, paramZr1m);
    this.ZX = new Zzb_(paramZr99, paramZr1m);
    Zn();
  }
  
  private void Zn() {
    this.ZR.ZP(a, Zk97.DESKTOP_SETTINGS_NETWORK_CONNECTIONS_SOCKS_PROXY, this.ZY, new String[] { Zx().Zo() });
  }
  
  private Zg5i Zx() {
    return Zu() ? this.ZX : this.Zm;
  }
  
  private boolean Zu() {
    return !this.ZD.Zuh();
  }
  
  private void Zz(boolean paramBoolean) {
    this.ZD.ZS(!paramBoolean);
    Zn();
  }
  
  static {
    // Byte code:
    //   0: bipush #122
    //   2: ldc '\\n}-Vw9+]('
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zboy.a : Ljava/lang/String;
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
    //   85: bipush #72
    //   87: goto -> 112
    //   90: bipush #42
    //   92: goto -> 112
    //   95: bipush #28
    //   97: goto -> 112
    //   100: bipush #127
    //   102: goto -> 112
    //   105: bipush #45
    //   107: goto -> 112
    //   110: bipush #51
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zboy.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */