package burp;

import java.util.Optional;
import net.portswigger.Zsy;

public class Zzu_ implements Zkrr {
  private final Ze3n ZU;
  
  private final Ztai Zd;
  
  private final Zbnt ZF;
  
  private final Zsy ZL;
  
  private final int Zt;
  
  private final Zsw4 Zl;
  
  private final Zbjl ZO;
  
  private static final String a;
  
  public Zzu_(Ze3n paramZe3n, Zkq4 paramZkq4, Zbnt paramZbnt, Zsy paramZsy, Zbjl paramZbjl) {
    this.ZU = paramZe3n;
    this.Zd = paramZkq4;
    this.ZF = paramZbnt;
    this.ZL = paramZsy;
    this.Zt = paramZkq4.ZqT().ZH(Zlk4.NORMAL) ? 2 : 1;
    this.Zl = new Zsw4(paramZsy);
    this.ZO = paramZbjl;
  }
  
  public Zbsl Zp() {
    return Zbsl.APR_WebCacheEntanglement;
  }
  
  public String toString() {
    return Zp().name();
  }
  
  public void ZU(Zrj paramZrj, Ztpx paramZtpx, Zz4_ paramZz4_) {
    Zkb zkb = new Zkb(this.ZU, this.ZL, this.ZF, paramZz4_, this.Zt);
    zkb.Zf();
    Ze_j ze_j = new Ze_j(this.ZU, this.ZL, this.ZF, paramZz4_, this.ZO, this.Zd, this.Zt, paramZrj.Zg());
    boolean bool = ze_j.ZM();
    if (!bool && Zq()) {
      Optional<Integer> optional = this.Zl.Za(this.ZU.ZL().Za());
      if (optional.isPresent()) {
        Zk9x zk9x = new Zk9x(this.ZU, this.ZL, this.ZF, paramZz4_, this.Zt, ((Integer)optional.get()).intValue());
        zk9x.ZA();
      } 
    } 
  }
  
  private boolean Zq() {
    return this.ZU.ZA().ZG().stream().anyMatch(Zzu_::lambda$baseRequestContainsHostHeader$0);
  }
  
  private static boolean lambda$baseRequestContainsHostHeader$0(String paramString) {
    return paramString.toLowerCase().startsWith(a);
  }
  
  static {
    // Byte code:
    //   0: bipush #109
    //   2: ldc 'JC'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zzu_.a : Ljava/lang/String;
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
    //   80: bipush #79
    //   82: goto -> 112
    //   85: bipush #65
    //   87: goto -> 112
    //   90: bipush #25
    //   92: goto -> 112
    //   95: bipush #11
    //   97: goto -> 112
    //   100: bipush #71
    //   102: goto -> 112
    //   105: bipush #65
    //   107: goto -> 112
    //   110: bipush #92
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzu_.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */