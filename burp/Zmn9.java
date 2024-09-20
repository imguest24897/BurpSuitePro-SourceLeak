package burp;

import java.util.concurrent.atomic.AtomicBoolean;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zmn9 implements Zz09 {
  private final Zbza ZP;
  
  private final Zl5x ZJ;
  
  private final Zz1i Zu;
  
  private final Zr_4 Zx;
  
  private final Zbnt Ze;
  
  private final Zrgd Zi;
  
  private final Ze4e ZB;
  
  private final Zsoh Zr;
  
  private final Ztos<Zt1o> Zc;
  
  private final AtomicBoolean ZX;
  
  private static final String a;
  
  Zmn9(Zbza paramZbza, Zz1i paramZz1i, Zl5x paramZl5x, Zr_4 paramZr_4, Zbnt paramZbnt, Zrgd paramZrgd, Ze4e paramZe4e, Zsoh paramZsoh, Ztos<Zt1o> paramZtos) {
    this.ZP = paramZbza;
    this.Zu = paramZz1i;
    this.Zx = paramZr_4;
    this.Ze = paramZbnt;
    this.Zi = paramZrgd;
    this.ZB = paramZe4e;
    this.ZJ = paramZl5x;
    this.Zr = paramZsoh;
    this.Zc = paramZtos;
    this.ZX = new AtomicBoolean();
  }
  
  public void ZC(Zrj paramZrj, Zlsy paramZlsy, Ztpx paramZtpx) {
    try {
      boolean bool;
      byte[] arrayOfByte = null;
      synchronized (this.ZP.Zz6()) {
        bool = Zb();
        if (bool)
          arrayOfByte = this.ZP.ZgC(); 
      } 
      try {
        if (bool) {
          try {
          
          } catch (Zktz zktz) {
            throw a(null);
          } 
          Zuh.Zb((arrayOfByte != null), Zqf.Zr);
          Zsex zsex = new Zsex(this.Zr.ZD(Ztao.Zc(paramZtpx, this.ZP, arrayOfByte).ZA()));
          Zstu zstu = zsex.Zl();
          synchronized (this.ZP.Zz6()) {
            if (Zb()) {
              try {
                if (zsex.ZU())
                  throw new Zsc5(); 
              } catch (Zktz zktz) {
                throw a(null);
              } 
              try {
                if (zsex.Zr())
                  throw new Zscr(); 
              } catch (Zktz zktz) {
                throw a(null);
              } 
              try {
                if (zstu != null) {
                  try {
                    if (zstu.Zpu() == 0)
                      throw new Zsct(); 
                  } catch (Zktz zktz) {
                    throw a(null);
                  } 
                } else {
                  throw new Zsct();
                } 
              } catch (Zktz zktz) {
                throw a(null);
              } 
              this.ZP.ZR(this.Zx.ZZ(zstu.ZiD()), this.Zi.ZX());
              this.ZP.ZF(zsex.Ze());
              this.Zc.ZD(Zblw.ZO(this.ZP.ZU(this.Ze), this.ZP.Zgz(), this.Ze));
            } 
          } 
        } 
      } catch (Zktz zktz) {
        throw a(null);
      } 
    } catch (Zktz zktz) {
      Zah.Zl(zktz, Zk_.IGNORED);
    } catch (Throwable throwable) {
      Zah.Zl(throwable, Zk_.PROCESSED_LATER);
      this.ZB.Zl(Zb09.Zh(this.ZJ, this.Zu.Zd(this.ZJ), Zblb.ZB(throwable)).Zn(), throwable);
    } 
  }
  
  public String toString() {
    return String.format(a, new Object[] { getClass().getSimpleName(), this.ZJ });
  }
  
  private boolean Zb() {
    synchronized (this.ZP.Zz6()) {
      if (this.ZP.Zge())
        return false; 
      if (!this.ZP.ZgL())
        return true; 
      try {
        if (ZT(this.ZP))
          try {
            if (this.ZX.compareAndSet(false, true));
          } catch (Zsc5 zsc5) {
            throw a(null);
          }  
      } catch (Zsc5 zsc5) {
        throw a(null);
      } 
      return false;
    } 
  }
  
  private boolean ZT(Zbza paramZbza) {
    Zs68 zs68 = Zbwc.ZS(paramZbza.ZU(this.Ze), paramZbza.Zgz(), Zt0k.NO_HTML_ANALYSIS, this.Ze);
    try {
    
    } catch (Zsc5 zsc5) {
      throw a(null);
    } 
    return (zs68.Zb == 304);
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
  
  static {
    // Byte code:
    //   0: bipush #114
    //   2: ldc 'yl%5/--H}=)cOLf{'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zmn9.a : Ljava/lang/String;
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
    //   80: bipush #46
    //   82: goto -> 112
    //   85: bipush #26
    //   87: goto -> 112
    //   90: bipush #62
    //   92: goto -> 112
    //   95: bipush #49
    //   97: goto -> 112
    //   100: bipush #26
    //   102: goto -> 112
    //   105: bipush #27
    //   107: goto -> 112
    //   110: bipush #103
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmn9.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */