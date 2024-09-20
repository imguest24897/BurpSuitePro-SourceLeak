package burp;

public class Ztt6 {
  private final int ZY;
  
  private final int Zl;
  
  private final Zlp9 Zh;
  
  private final Zro0 Ze;
  
  private static final String a;
  
  public Ztt6(int paramInt1, int paramInt2, Zlp9 paramZlp9, Zro0 paramZro0) {
    this.ZY = paramInt1;
    this.Zl = paramInt2;
    this.Zh = paramZlp9;
    this.Ze = paramZro0;
  }
  
  public int Zc() {
    return this.ZY;
  }
  
  public int ZK() {
    return this.Zl;
  }
  
  public Zlp9 ZN() {
    return this.Zh;
  }
  
  public Zro0 Zk() {
    return this.Ze;
  }
  
  public String toString() {
    return String.format(a, new Object[] { Integer.valueOf(this.ZY), Character.valueOf('y'), Integer.valueOf(this.Zl), Character.valueOf('y'), Integer.valueOf(this.Zh.Zz()), Character.valueOf('y'), this.Ze.toString(), Character.valueOf('y') });
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject == null || getClass() != paramObject.getClass())
      return false; 
    Ztt6 ztt6 = (Ztt6)paramObject;
    return (this.ZY != ztt6.ZY) ? false : ((this.Zl != ztt6.Zl) ? false : ((this.Zh.Zz() != ztt6.Zh.Zz()) ? false : ((this.Ze == null) ? ((ztt6.Ze == null)) : this.Ze.equals(ztt6.Ze))));
  }
  
  public int hashCode() {
    int i = this.ZY;
    i = 31 * i + this.Zl;
    i = 31 * i + this.Zh.Zz();
    if (this.Ze != null)
      i = 31 * i + this.Ze.hashCode(); 
    return i;
  }
  
  static {
    // Byte code:
    //   0: bipush #119
    //   2: ldc 'D8X\\t'g_eOa:\\tD#'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Ztt6.a : Ljava/lang/String;
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
    //   80: bipush #22
    //   82: goto -> 112
    //   85: bipush #55
    //   87: goto -> 112
    //   90: bipush #10
    //   92: goto -> 112
    //   95: bipush #29
    //   97: goto -> 112
    //   100: bipush #117
    //   102: goto -> 112
    //   105: bipush #104
    //   107: goto -> 112
    //   110: bipush #13
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztt6.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */