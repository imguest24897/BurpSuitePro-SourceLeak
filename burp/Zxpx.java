package burp;

class Zxpx {
  private final Zryr Zl;
  
  private final Zryr ZP;
  
  private final Zsxk ZW;
  
  private final Zbkr Za;
  
  private final Zr1m Ze;
  
  private static final String a;
  
  private Zxpx(Zxl_ paramZxl_, Zsxk paramZsxk, Zr_4 paramZr_41, Zr_4 paramZr_42, Zbkr paramZbkr, Zr1m paramZr1m) {
    this.ZW = paramZsxk;
    this.Za = paramZbkr;
    this.Ze = paramZr1m;
    this.Zl = new Zs52(paramZxl_, paramZr_41);
    this.ZP = new Zx8o(paramZsxk, paramZr_42);
    Zq();
  }
  
  private void Zq() {
    this.Za.ZP(a, Zk97.DESKTOP_SETTINGS_NETWORK_TLS_CLIENT_TLS_CERTIFICATES, this.Ze, new String[] { ZA().ZX() });
  }
  
  private Zryr ZA() {
    return ZJ() ? this.ZP : this.Zl;
  }
  
  private boolean ZJ() {
    return !this.ZW.ZN();
  }
  
  private void Zn(boolean paramBoolean) {
    this.ZW.Zm(!paramBoolean);
    Zq();
  }
  
  static {
    // Byte code:
    //   0: bipush #54
    //   2: ldc '4I2(\\ri$w%_#L>%Y2V'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zxpx.a : Ljava/lang/String;
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
    //   80: bipush #97
    //   82: goto -> 112
    //   85: bipush #19
    //   87: goto -> 112
    //   90: bipush #65
    //   92: goto -> 112
    //   95: bipush #97
    //   97: goto -> 112
    //   100: bipush #112
    //   102: goto -> 112
    //   105: bipush #68
    //   107: goto -> 112
    //   110: bipush #27
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxpx.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */