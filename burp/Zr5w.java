package burp;

import java.awt.Window;
import java.util.Objects;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zr5w {
  private final Zz0n ZY;
  
  private final Zt4u Zg;
  
  private final Zbl2 ZZ;
  
  private final Ztwv ZP;
  
  private final Zgb6 ZU;
  
  private final Zskh Zo;
  
  private final Zr_4 Zu;
  
  private final Zkfm Zq;
  
  private final Zbiw Zs;
  
  private final Zbg7 Zi;
  
  private Zbga Zr;
  
  private Zbgv Zz;
  
  private Zbgm ZQ;
  
  private Zbgb ZS;
  
  private Zbge ZH;
  
  private Zbgk ZM;
  
  private static final String a;
  
  public Zr5w(Zz0n paramZz0n, Zt4u paramZt4u, Zgb6 paramZgb6, Zskh paramZskh, Zkfm paramZkfm, Zbl2 paramZbl2, Ztwv paramZtwv, Zr_4 paramZr_4, Window paramWindow) {
    Zuh.Zb((null != paramZgb6), Zqf.Zv);
    Zuh.Zb((null != paramZskh), Zqf.Zv);
    Zuh.Zb((null != paramZr_4), Zqf.Zv);
    this.ZY = paramZz0n;
    this.Zg = paramZt4u;
    this.ZU = paramZgb6;
    this.Zo = paramZskh;
    this.Zq = paramZkfm;
    this.ZZ = paramZbl2;
    this.ZP = paramZtwv;
    this.Zu = paramZr_4;
    this.Zi = new Zbg7(this);
    this.Zs = new Zl0a(paramWindow, a, 100, 25, this.Zi);
  }
  
  Zl04 Zt() {
    return this.Zs.Zu();
  }
  
  Zsic ZP(Zsic paramZsic) {
    if (paramZsic == this.Zr)
      return this.Zi; 
    if (paramZsic == this.Zz)
      return this.Zi; 
    if (paramZsic == this.ZQ)
      return this.Zz; 
    if (paramZsic == this.ZS)
      switch (this.Zz.ZY()) {
        case 0:
          return this.Zz;
        case 1:
          return this.ZQ;
      }  
    if (paramZsic == this.ZH)
      return this.ZS; 
    if (paramZsic == this.ZM)
      switch (this.Zi.Zq()) {
        case 0:
          return this.Zr;
        case 1:
          return this.ZH;
      }  
    Zuh.Zb(false, Zqf.Zr);
    return null;
  }
  
  Zsic Zu(Zsic paramZsic) {
    if (paramZsic == this.Zi) {
      switch (this.Zi.Zq()) {
        case 0:
          this.Zr = new Zbga(this.Zg, this);
          return this.Zr;
        case 1:
          this.Zz = new Zbgv(this.Zg, this);
          return this.Zz;
      } 
      return this.Zi;
    } 
    if (paramZsic == this.Zr) {
      this.ZM = new Zbgk(this, this.Zs, this.Zi, this.Zr, Zr5w::lambda$goNext$0, this.ZZ, this.Zq, this.Zu);
      return this.ZM;
    } 
    if (paramZsic == this.Zz)
      switch (this.Zz.ZY()) {
        case 0:
          this.ZS = new Zbgb(this, this.Zz.ZG(), this.ZZ, this.ZU, this.ZY.ZD(), this.ZP);
          return this.ZS;
        case 1:
          this.ZQ = new Zbgm(this, this.Zo, this.ZY.ZM(), this.ZP);
          return this.ZQ;
      }  
    if (paramZsic == this.ZQ) {
      this.ZS = new Zbgb(this, this.ZQ.Z_(), this.ZZ, this.ZU, this.ZY.ZD(), this.ZP);
      return this.ZS;
    } 
    if (paramZsic == this.ZS) {
      this.ZH = new Zbge(this, this.ZY.ZM(), this.Zg);
      return this.ZH;
    } 
    if (paramZsic == this.ZH) {
      Objects.requireNonNull(this.ZH);
      this.ZM = new Zbgk(this, this.Zs, this.Zi, this.ZS, this.ZH::Zv, this.ZZ, this.Zq, this.Zu);
      return this.ZM;
    } 
    Zuh.Zb(false, Zqf.Zr);
    return null;
  }
  
  private static Zgzc lambda$goNext$0() {
    return Zgzc.ZH;
  }
  
  static {
    // Byte code:
    //   0: bipush #85
    //   2: ldc 'I/[8y[\\b^a}TJZ~*T4tN\o'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zr5w.a : Ljava/lang/String;
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
    //   80: bipush #95
    //   82: goto -> 112
    //   85: bipush #22
    //   87: goto -> 112
    //   90: bipush #103
    //   92: goto -> 112
    //   95: bipush #8
    //   97: goto -> 112
    //   100: bipush #66
    //   102: goto -> 112
    //   105: bipush #122
    //   107: goto -> 112
    //   110: bipush #125
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zr5w.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */