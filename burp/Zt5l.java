package burp;

import java.util.Optional;
import net.portswigger.browser.Za;
import net.portswigger.browser.Zcr;
import net.portswigger.browser.Zd_;
import net.portswigger.browser.Zex;
import net.portswigger.browser.Zjz;

public final class Zt5l implements Zsd0<Zjz> {
  private boolean Zi;
  
  private boolean ZG;
  
  private boolean ZW;
  
  private Za ZR;
  
  private Zex ZK = Zex.ZC(new net.portswigger.browser.Zcm[0]);
  
  private static final String a;
  
  public Zt5l() {}
  
  public Zt5l(Zjz paramZjz) {
    this.Zi = paramZjz.ZT();
    this.ZG = paramZjz.ZE();
    this.ZW = paramZjz.ZL();
    this.ZR = paramZjz.ZP();
    this.ZK = paramZjz.Zg();
  }
  
  public boolean Zf() {
    return this.ZG;
  }
  
  public Zt5l ZU(boolean paramBoolean) {
    this.ZG = paramBoolean;
    return this;
  }
  
  public boolean Z_() {
    return this.ZW;
  }
  
  public Zt5l Zb(boolean paramBoolean) {
    this.ZW = paramBoolean;
    return this;
  }
  
  public Za Zg() {
    return this.ZR;
  }
  
  public Zt5l Zs(Za paramZa) {
    this.ZR = paramZa;
    return this;
  }
  
  public Zex Zw() {
    return this.ZK;
  }
  
  public Zt5l Zv(Zex paramZex) {
    this.ZK = paramZex;
    return this;
  }
  
  public boolean Zm() {
    return this.Zi;
  }
  
  public Zt5l Zg(boolean paramBoolean) {
    this.Zi = paramBoolean;
    return this;
  }
  
  public Zjz Zp() {
    return (new Zcr()).Zh(this.Zi).Zb(this.ZG).ZG(this.ZW).Zc(this.ZR).Zn(this.ZK).Zh();
  }
  
  public Optional<String> Zx() {
    return (this.ZR == null) ? Optional.of(a) : Optional.empty();
  }
  
  static {
    // Byte code:
    //   0: bipush #113
    //   2: ldc 'cX5G"\xS0F9\\nsRP$'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zt5l.a : Ljava/lang/String;
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
    //   80: bipush #39
    //   82: goto -> 112
    //   85: bipush #13
    //   87: goto -> 112
    //   90: bipush #107
    //   92: goto -> 112
    //   95: bipush #71
    //   97: goto -> 112
    //   100: bipush #68
    //   102: goto -> 112
    //   105: bipush #49
    //   107: goto -> 112
    //   110: bipush #69
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zt5l.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */