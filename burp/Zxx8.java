package burp;

import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Zxx8 {
  private final Zzh2 ZW;
  
  private final Zbw_ ZT;
  
  private final Zlit Ze;
  
  private final Ze3o ZP;
  
  private final Zl3z Zm;
  
  private final Zzxx ZQ;
  
  private byte[] Zq;
  
  private boolean ZB;
  
  private static final String a;
  
  Zxx8(Zzh2 paramZzh2, Zbw_ paramZbw_, Zlit paramZlit, Ze3o paramZe3o, Zl3z paramZl3z, Zzxx paramZzxx) {
    this.ZW = paramZzh2;
    this.ZT = paramZbw_;
    this.Ze = paramZlit;
    this.ZP = paramZe3o;
    this.Zm = paramZl3z;
    this.ZQ = paramZzxx;
    this.Zq = this.Zm.ZH();
  }
  
  void ZO() throws Zz87 {
    Zy();
    Zp();
  }
  
  private void Zy() {
    this.ZB = (this.Zm.Zw() || this.ZT.ZN(this.Ze, this.ZP));
  }
  
  private void Zp() throws Zz87 {
    try {
      if (this.ZB)
        try {
          if (!Zb12.ZG()) {
            Zz6e zz6e = Zs();
            try {
              this.Zq = zz6e.ZY();
              if (this.Zq == null)
                throw new Zz87(a); 
            } catch (Zz87 zz87) {
              throw a(null);
            } 
            return;
          } 
          return;
        } catch (Zz87 zz87) {
          throw a(null);
        }  
    } catch (Zz87 zz87) {
      throw a(null);
    } 
  }
  
  private Zz6e Zs() {
    Zsyf zsyf = this.ZQ.Zq(this.Ze, this.Zm.ZC(), this.ZP, this.ZW);
    this.ZT.ZL(zsyf);
    Zg(zsyf);
    return zsyf;
  }
  
  protected void Zg(Zz6e paramZz6e) {
    synchronized (paramZz6e) {
      try {
        paramZz6e.wait();
      } catch (InterruptedException interruptedException) {
        Zah.Zl(interruptedException, Zk_.IGNORED);
      } 
    } 
  }
  
  byte[] Zz() {
    return this.Zq;
  }
  
  private static Zz87 a(Zz87 paramZz87) {
    return paramZz87;
  }
  
  static {
    // Byte code:
    //   0: bipush #111
    //   2: ldc 'QdR\\n=E<v\\rRK>RsqDzBe!R('
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zxx8.a : Ljava/lang/String;
    //   11: goto -> 152
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
    //   29: if_icmpgt -> 126
    //   32: dup2
    //   33: swap
    //   34: iload_0
    //   35: dup2_x1
    //   36: caload
    //   37: swap
    //   38: iload_0
    //   39: bipush #7
    //   41: irem
    //   42: tableswitch default -> 108, 0 -> 80, 1 -> 85, 2 -> 90, 3 -> 94, 4 -> 99, 5 -> 103
    //   80: bipush #115
    //   82: goto -> 110
    //   85: bipush #110
    //   87: goto -> 110
    //   90: iconst_3
    //   91: goto -> 110
    //   94: bipush #78
    //   96: goto -> 110
    //   99: iconst_4
    //   100: goto -> 110
    //   103: bipush #53
    //   105: goto -> 110
    //   108: bipush #79
    //   110: ixor
    //   111: ixor
    //   112: i2c
    //   113: castore
    //   114: iinc #0, 1
    //   117: dup
    //   118: ifne -> 126
    //   121: dup2
    //   122: dup_x1
    //   123: goto -> 35
    //   126: dup2_x1
    //   127: pop2
    //   128: dup_x2
    //   129: iload_0
    //   130: if_icmpgt -> 32
    //   133: pop
    //   134: new java/lang/String
    //   137: dup_x1
    //   138: swap
    //   139: invokespecial <init> : ([C)V
    //   142: invokevirtual intern : ()Ljava/lang/String;
    //   145: swap
    //   146: pop
    //   147: swap
    //   148: pop
    //   149: goto -> 8
    //   152: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxx8.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */