package burp;

public class Zezb extends Zezv {
  private final String Zo;
  
  private static final String b;
  
  public Zezb(byte paramByte, Zr69 paramZr69, Zl7h paramZl7h, Ztos<Zt35> paramZtos, Zko4 paramZko4) {
    super(paramByte, paramZr69, paramZl7h, paramZtos, paramZko4.ZP());
    this.Zo = paramZko4.ZRc();
  }
  
  protected Zrp0 Z_() {
    if (!this.ZQ.ZVi()) {
      this.ZW.Zy(Zrp6.ERROR, Zlq7.RECORDED_SEQUENCE_BROWSER_ERROR, new Object[0]);
      return null;
    } 
    Zxjt zxjt = this.ZQ.ZVe();
    Zrp0 zrp0 = zxjt.Zu(this.Zo).orElse(null);
    if (zrp0 != null)
      this.ZW.Zy(Zrp6.INFO, Zlq7.RECORDED_SEQUENCE_STARTED, new Object[] { this.Zp }); 
    return zrp0;
  }
  
  public String toString() {
    return b + b + this.Zp;
  }
  
  public boolean Zg() {
    return false;
  }
  
  static {
    // Byte code:
    //   0: bipush #34
    //   2: ldc 'e*k>VN`#,Wq&f51]G`+6\@&V9&WX/d8&UB'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zezb.b : Ljava/lang/String;
    //   11: goto -> 153
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
    //   29: if_icmpgt -> 127
    //   32: dup2
    //   33: swap
    //   34: iload_0
    //   35: dup2_x1
    //   36: caload
    //   37: swap
    //   38: iload_0
    //   39: bipush #7
    //   41: irem
    //   42: tableswitch default -> 109, 0 -> 80, 1 -> 84, 2 -> 89, 3 -> 94, 4 -> 99, 5 -> 104
    //   80: iconst_1
    //   81: goto -> 111
    //   84: bipush #97
    //   86: goto -> 111
    //   89: bipush #39
    //   91: goto -> 111
    //   94: bipush #120
    //   96: goto -> 111
    //   99: bipush #97
    //   101: goto -> 111
    //   104: bipush #27
    //   106: goto -> 111
    //   109: bipush #93
    //   111: ixor
    //   112: ixor
    //   113: i2c
    //   114: castore
    //   115: iinc #0, 1
    //   118: dup
    //   119: ifne -> 127
    //   122: dup2
    //   123: dup_x1
    //   124: goto -> 35
    //   127: dup2_x1
    //   128: pop2
    //   129: dup_x2
    //   130: iload_0
    //   131: if_icmpgt -> 32
    //   134: pop
    //   135: new java/lang/String
    //   138: dup_x1
    //   139: swap
    //   140: invokespecial <init> : ([C)V
    //   143: invokevirtual intern : ()Ljava/lang/String;
    //   146: swap
    //   147: pop
    //   148: swap
    //   149: pop
    //   150: goto -> 8
    //   153: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zezb.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */