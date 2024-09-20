package burp;

public class Zxs4 implements Zrb2 {
  private final Zxs7 ZO;
  
  private final Zlk4 ZH;
  
  private static final String a;
  
  public Zxs4(Zxs7 paramZxs7, Zlk4 paramZlk4) {
    this.ZO = paramZxs7;
    this.ZH = paramZlk4;
  }
  
  public String Zd() {
    return a;
  }
  
  public byte Zz() {
    return 1;
  }
  
  public byte Zq() {
    return 1;
  }
  
  public boolean Zw() {
    boolean bool = Ztu2.ZH();
    if (this.ZH == Zlk4.FAST && !this.ZO.Zg())
      return true; 
    if (Zbqc.Zwu() == null)
      Ztu2.Zv(!bool); 
    return this.ZH.ZH(Zlk4.NORMAL);
  }
  
  static {
    // Byte code:
    //   0: bipush #39
    //   2: ldc 'nP$%?A=c-b[Y $73G&,gnOtYy-.D i'h[Y?~c+OL,\\f,+GaR7'%\\tT(\\t,!wG>[H">\\n`@q4"N,Snn+NlR7gnOrqkc[\\tn'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zxs4.a : Ljava/lang/String;
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
    //   42: tableswitch default -> 110, 0 -> 80, 1 -> 85, 2 -> 90, 3 -> 95, 4 -> 100, 5 -> 105
    //   80: bipush #110
    //   82: goto -> 111
    //   85: bipush #92
    //   87: goto -> 111
    //   90: bipush #43
    //   92: goto -> 111
    //   95: bipush #100
    //   97: goto -> 111
    //   100: bipush #109
    //   102: goto -> 111
    //   105: bipush #85
    //   107: goto -> 111
    //   110: iconst_5
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxs4.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */