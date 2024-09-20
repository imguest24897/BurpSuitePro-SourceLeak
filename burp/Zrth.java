package burp;

import java.io.File;
import java.util.Collections;
import java.util.Optional;
import java.util.Set;
import java.util.jar.Manifest;
import net.portswigger.Zl0;
import net.portswigger.Zq1;
import net.portswigger.Zrzg;
import net.portswigger.Zs4;
import net.portswigger.Zsy;
import net.portswigger.browser.Zjb;
import net.portswigger.browser.service.Zi;

public class Zrth implements Zz0n {
  private final Zq1 ZL = new Zq1();
  
  private final Zrgd ZP = new Zrgd();
  
  private final Zsy Zw;
  
  private final Zs4 ZK;
  
  private final Ztwv Zg;
  
  private final Zb0h Zn;
  
  private final Zzxi ZY;
  
  private final Zrzg ZC;
  
  private final Zi ZD;
  
  private final Set<Zjb> Zm;
  
  private static final String a;
  
  public Zrth(boolean paramBoolean, Zzxi paramZzxi) {
    String str = Zrgd.Zy();
    this.Zw = new Zsy();
    this.ZK = new Zs4();
    this.Zg = new Zt55(a);
    this.Zn = paramBoolean ? null : new Zb0h();
    this.ZY = paramZzxi;
    File file = (paramZzxi != null) ? paramZzxi.Ze() : null;
    this.ZC = (file == null) ? new Zrzg((Zl0)this.ZL) : new Zrzg((Zl0)this.ZL, file);
    Optional<Manifest> optional = (new Zea4()).ZH();
    this.ZD = optional.isPresent() ? Zxlh.Zh(optional.get()) : Zi.DEVELOPMENT;
    this.Zm = optional.isPresent() ? Ztml.Zt(optional.get()) : Collections.<Zjb>emptySet();
    if (str != null)
      Zbqc.Zr(new Zbqc[3]); 
  }
  
  public Zl0 ZM() {
    return (Zl0)this.ZL;
  }
  
  public Zrgd ZP() {
    return this.ZP;
  }
  
  public Zsy ZU() {
    return this.Zw;
  }
  
  public Zs4 Zc() {
    return this.ZK;
  }
  
  public Zzxi Zr() {
    return this.ZY;
  }
  
  public Ztwv Zj() {
    return this.Zg;
  }
  
  public Zb0h ZD() {
    return this.Zn;
  }
  
  public Zrzg ZR() {
    return this.ZC;
  }
  
  public Zi Zo() {
    return this.ZD;
  }
  
  public Set<Zjb> ZN() {
    return this.Zm;
  }
  
  public void ZX(long paramLong) throws InterruptedException {
    Thread.sleep(paramLong);
  }
  
  static {
    // Byte code:
    //   0: bipush #23
    //   2: ldc '-\\nh'Wd0'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zrth.a : Ljava/lang/String;
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
    //   80: bipush #74
    //   82: goto -> 112
    //   85: bipush #113
    //   87: goto -> 112
    //   90: bipush #30
    //   92: goto -> 112
    //   95: bipush #68
    //   97: goto -> 112
    //   100: bipush #38
    //   102: goto -> 112
    //   105: bipush #28
    //   107: goto -> 112
    //   110: bipush #126
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrth.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */