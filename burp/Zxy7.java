package burp;

import java.util.List;

class Zxy7 implements Zzva {
  private final Zr_4 Zr;
  
  private final Zbnt Zq;
  
  private final Zrgd Zu;
  
  private final Zs1h Zf;
  
  private final Zlr9 ZJ;
  
  private final Zxzh Zh;
  
  private final List<Zb4e> Zl;
  
  private final Zey9 ZW;
  
  private static final String a;
  
  Zxy7(Zr_4 paramZr_4, Zbnt paramZbnt, Zrgd paramZrgd, Zskh paramZskh, Zlr9 paramZlr9, Zz9e paramZz9e, Zxzh paramZxzh, Zelf paramZelf, Zey9 paramZey9, Zs1h paramZs1h) {
    this.Zr = paramZr_4;
    this.Zq = paramZbnt;
    this.Zu = paramZrgd;
    this.ZJ = paramZlr9;
    this.Zh = paramZxzh;
    this.ZW = paramZey9;
    this.Zf = paramZs1h;
    this.Zl = List.of(new Zmlp(paramZs1h, paramZr_4, paramZbnt), new Zzm9(paramZs1h), new Zl3s(paramZs1h, paramZskh, paramZlr9, paramZz9e, paramZxzh, paramZelf), new Zesf(paramZs1h, paramZskh, paramZxzh, paramZey9));
  }
  
  public Zsgw ZA(Ze44 paramZe44, int paramInt, Zsxd paramZsxd, Zlgm paramZlgm) {
    boolean bool = Zlf9.Zr();
    Zlil zlil = this.Zf.ZE();
    if (zlil == null)
      return new Zsgw(paramZsxd); 
    if (paramZe44 != null)
      paramZe44.ZP(Zgsg.RUNNING_MACRO, paramInt, a + a, null); 
    Zruk zruk = (paramZe44 == null) ? null : new Zruk(paramZe44, paramInt + 1);
    Zz9y zz9y = new Zz9y(zlil, this.Zh, this.ZJ, zruk, this.Zq, this.ZW, this.Zr, this.Zu);
    zz9y.run();
    Zsgw zsgw = new Zsgw(paramZsxd);
    for (Zb4e zb4e : this.Zl) {
      if (zb4e.Zc())
        zsgw = zb4e.ZX(zsgw, zz9y.ZQ(), paramZlgm, paramZe44, paramInt); 
      if (bool)
        break; 
    } 
    return zsgw;
  }
  
  static {
    // Byte code:
    //   0: bipush #62
    //   2: ldc ',b,=n^z#\\n<3^'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zxy7.a : Ljava/lang/String;
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
    //   80: bipush #64
    //   82: goto -> 112
    //   85: bipush #41
    //   87: goto -> 112
    //   90: bipush #124
    //   92: goto -> 112
    //   95: bipush #87
    //   97: goto -> 112
    //   100: bipush #82
    //   102: goto -> 112
    //   105: bipush #109
    //   107: goto -> 112
    //   110: bipush #55
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxy7.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */