package burp;

import java.util.List;
import java.util.Objects;
import net.portswigger.Zsy;

public class Zm7e implements Zkrr {
  private static final List<Zsba> Zs;
  
  private final Zkq4 ZE;
  
  private final Ze3n Zj;
  
  private final Zsy ZL;
  
  private final Zbom ZY;
  
  private final Zmzk Zh;
  
  private final Zbjl Zy;
  
  private static final String a;
  
  public Zm7e(Zz1i paramZz1i, Zkq4 paramZkq4, Ze3n paramZe3n, Zsy paramZsy, Zbjl paramZbjl) {
    this.ZE = paramZkq4;
    this.Zj = paramZe3n;
    this.ZL = paramZsy;
    this.Zy = paramZbjl;
    this.Zh = paramZe3n.Za();
    this.ZY = paramZz1i.Zc(this.Zh);
  }
  
  public Zbsl Zp() {
    return Zbsl.APR_WebCachePoisoning;
  }
  
  public void ZU(Zrj paramZrj, Ztpx paramZtpx, Zz4_ paramZz4_) {
    if (Zg())
      return; 
    Zmk zmk = new Zmk(this.ZL);
    Objects.requireNonNull(this.Zj);
    Zr1y zr1y = new Zr1y(this.Zj::ZI);
    Zkoc zkoc = new Zkoc(this.ZE, this.Zj, zmk);
    if (this.ZE.Zr(Zzu2.REQUEST_URL_OVERRIDE) || this.ZE.Zr(Zzu2.WEB_CACHE_POISONING)) {
      Zt78 zt78 = new Zt78(new Zrca(this.ZE, this.Zj, this.ZL, this.ZY, this.Zh, zmk), this.ZE, this.Zj, zkoc, zr1y);
      zt78.ZP(paramZz4_);
    } 
    if (this.ZE.Zr(Zzu2.REQUEST_URL_OVERRIDE) || this.ZE.Zr(Zzu2.WEB_CACHE_POISONING) || this.ZE.ZS(Zzu2.EXTERNAL_SERVICE_INTERACTION_DNS, Zr3z.COLLABORATOR_BASED) || this.ZE.ZS(Zzu2.EXTERNAL_SERVICE_INTERACTION_HTTP, Zr3z.COLLABORATOR_BASED)) {
      Zt78 zt78 = new Zt78(new Zrce(this.ZE, this.Zj, this.ZL, this.ZY, this.Zh, zmk, this.Zy, paramZrj.Zg()), this.ZE, this.Zj, zkoc, zr1y);
      zt78.ZP(paramZz4_);
    } 
  }
  
  private boolean Zg() {
    Zefx zefx = this.Zj.ZA();
    return (a.equalsIgnoreCase(zefx.Zr()) && !Zs.contains(zefx.Zv()));
  }
  
  public String toString() {
    return Zp().name();
  }
  
  static {
    // Byte code:
    //   0: bipush #24
    //   2: ldc 'm(<\'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zm7e.a : Ljava/lang/String;
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
    //   80: bipush #37
    //   82: goto -> 111
    //   85: bipush #127
    //   87: goto -> 111
    //   90: bipush #119
    //   92: goto -> 111
    //   95: bipush #16
    //   97: goto -> 111
    //   100: bipush #88
    //   102: goto -> 111
    //   105: bipush #20
    //   107: goto -> 111
    //   110: iconst_4
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
    //   153: iconst_3
    //   154: anewarray burp/Zsba
    //   157: dup
    //   158: iconst_0
    //   159: getstatic burp/Zsba.URL_ENCODED : Lburp/Zsba;
    //   162: aastore
    //   163: dup
    //   164: iconst_1
    //   165: getstatic burp/Zsba.MULTIPART : Lburp/Zsba;
    //   168: aastore
    //   169: dup
    //   170: iconst_2
    //   171: getstatic burp/Zsba.NONE : Lburp/Zsba;
    //   174: aastore
    //   175: invokestatic asList : ([Ljava/lang/Object;)Ljava/util/List;
    //   178: putstatic burp/Zm7e.Zs : Ljava/util/List;
    //   181: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zm7e.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */