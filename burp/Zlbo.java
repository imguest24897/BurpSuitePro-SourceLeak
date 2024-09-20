package burp;

import net.portswigger.Zqf;
import net.portswigger.Zrme;
import net.portswigger.Ztj;
import net.portswigger.Zuh;

public class Zlbo {
  private final Ztj Zr;
  
  private final Zzb4 ZA;
  
  private final Zg0s Zm;
  
  private final Zra1 Z_;
  
  private final Zx46 Zi;
  
  private final Zbnt ZP;
  
  private final Zmx0 Zu;
  
  private static final String a;
  
  public Zlbo(Ztj paramZtj, Zzb4 paramZzb4, Zg0s paramZg0s, Zra1 paramZra1, Zx46 paramZx46, Zbnt paramZbnt, Zmx0 paramZmx0) {
    this.Zr = paramZtj;
    this.ZA = paramZzb4;
    this.Zm = paramZg0s;
    String str = Zbxg.Zx();
    try {
      this.Z_ = paramZra1;
      this.Zi = paramZx46;
      this.ZP = paramZbnt;
      this.Zu = paramZmx0;
      if (Zbqc.Zwu() == null)
        Zbxg.ZA("Ahy9Hb"); 
    } catch (Zrme zrme) {
      throw a(null);
    } 
  }
  
  public Zmt2 Za(Zgna paramZgna, Zlli<Zt13> paramZlli, Zrbm paramZrbm) {
    try {
      switch (Zbm.Zk[paramZgna.ZNs().ordinal()]) {
        case 1:
          return ZN((Zlog)paramZgna, paramZlli, (Zezo)paramZrbm);
        case 2:
        case 3:
          return Zl((Zzep)paramZgna, paramZlli, (Zxn8)paramZrbm);
        case 4:
          return Z_((Zbob)paramZgna, paramZlli, (Zriy)paramZrbm);
      } 
    } catch (Zrme zrme) {
      throw a(null);
    } 
    Zuh.ZT(false, Zqf.Zs, paramZgna.ZNs().name());
    throw new Zrme(a + a);
  }
  
  private Zmck ZN(Zlog paramZlog, Zlli<Zt13> paramZlli, Zezo paramZezo) {
    Zmck zmck = new Zmck(this.Z_, paramZlog, this.Zu);
    zmck.ZC(paramZlli, paramZezo.ZV(), paramZezo.ZG());
    return zmck;
  }
  
  private Zx61 Zl(Zzep paramZzep, Zlli<Zt13> paramZlli, Zxn8 paramZxn8) {
    Zx61 zx61 = new Zx61(this.Z_, paramZzep, this.Zm, this.Zr, this.ZA, this.Zi, this.ZP, this.Zu);
    zx61.ZT(paramZlli, paramZxn8.Z_().ZV(), paramZxn8.ZH().ZO());
    return zx61;
  }
  
  private Zx61 Z_(Zbob paramZbob, Zlli<Zt13> paramZlli, Zriy paramZriy) {
    Zx61 zx61 = new Zx61(this.Z_, paramZbob, this.Zm, this.Zr, this.ZA, this.Zi, this.ZP, this.Zu);
    zx61.Ze(paramZlli, paramZriy.ZO());
    return zx61;
  }
  
  private static Zrme a(Zrme paramZrme) {
    return paramZrme;
  }
  
  static {
    // Byte code:
    //   0: bipush #95
    //   2: ldc 'Mi[Fw\\bcg[]lZ.xGNqM}{Fq\\bziF\\tlN.|LL#'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zlbo.a : Ljava/lang/String;
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
    //   80: bipush #81
    //   82: goto -> 112
    //   85: bipush #87
    //   87: goto -> 112
    //   90: bipush #106
    //   92: goto -> 112
    //   95: bipush #40
    //   97: goto -> 112
    //   100: bipush #118
    //   102: goto -> 112
    //   105: bipush #92
    //   107: goto -> 112
    //   110: bipush #119
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlbo.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */