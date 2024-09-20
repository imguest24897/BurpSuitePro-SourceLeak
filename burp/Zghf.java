package burp;

import java.util.Optional;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.browser.Zc1;
import net.portswigger.browser.Zck;
import net.portswigger.browser.Zd0;
import net.portswigger.browser.Zeu;
import net.portswigger.browser.Zez;
import net.portswigger.browser.Zjo;
import net.portswigger.browser.Zjw;
import net.portswigger.browser.Ztg;
import net.portswigger.browser.Ztj;
import net.portswigger.browser.Ztk;
import net.portswigger.browser.Ztn;
import net.portswigger.browser.Ztp;

public class Zghf {
  private final Zeu Zl;
  
  private final Zjo Zc;
  
  private final String ZY;
  
  private volatile Zc1 ZH;
  
  private static final String a;
  
  public Zghf(Zeu paramZeu, Zjo paramZjo, String paramString) {
    this.Zl = paramZeu;
    this.Zc = paramZjo;
    this.ZY = paramString;
  }
  
  public synchronized Zc1 Zx() throws Ztn {
    try {
      if (this.ZH == null)
        throw new Ztn(a); 
    } catch (Ztn ztn) {
      throw a(null);
    } 
    return this.ZH;
  }
  
  public synchronized void Zc(boolean paramBoolean) throws Ztp {
    try {
      if (this.ZH == null) {
        ZJ();
        return;
      } 
    } catch (Ztp ztp) {
      throw a(null);
    } 
    try {
      if (paramBoolean) {
        Ze();
        ZJ();
      } 
    } catch (Ztp ztp) {
      throw a(null);
    } 
  }
  
  private void ZJ() throws Ztp {
    try {
      this.ZH = this.Zl.ZM().ZC(this.Zc);
      this.ZH.ZE(Zck.ZD, this::lambda$initializeContext$0);
    } catch (Ztk ztk) {
      Zah.Zl((Throwable)ztk, Zk_.RETHROWN);
      throw new Ztp(ztk);
    } 
  }
  
  public Zjw Zw() throws Ztg {
    Optional<Zjw> optional = this.ZH.Zj().Zc();
    try {
      if (optional.isPresent())
        return optional.get(); 
    } catch (Ztk ztk) {
      throw a(null);
    } 
    try {
      Zjw zjw = this.ZH.Zj().ZV();
      zjw.ZK().ZW(1920, 1080);
      zjw.ZK().Zp();
      return zjw;
    } catch (Ztk ztk) {
      Zah.Zl((Throwable)ztk, Zk_.RETHROWN);
      throw new Ztg(ztk);
    } 
  }
  
  public synchronized void Ze() {
    if (this.ZH == null)
      return; 
    if (this.Zl != null)
      this.Zl.ZM().Zl(this.ZH); 
    this.ZH = null;
  }
  
  public synchronized void ZF(Zjw paramZjw) {
    if (this.ZH == null || paramZjw == null)
      return; 
    this.ZH.Zj().ZE(paramZjw);
  }
  
  private void ZO(Zjw paramZjw) {
    try {
      paramZjw.ZN().ZL();
      paramZjw.ZU().Zm(this.ZY);
      Zd0 zd0 = paramZjw.Zx();
      zd0.Zy();
      zd0.ZU(Zmlb.Zl);
    } catch (Ztj ztj) {
      Zah.Zl((Throwable)ztj, Zk_.IGNORED);
    } catch (Ztk ztk) {
      Zah.Zl((Throwable)ztk, Zk_.COMMON_RUNTIME_FAILURE);
    } 
  }
  
  private void lambda$initializeContext$0(Zxr8<Zez> paramZxr8) {
    ((Zez)paramZxr8.ZF().orElseThrow()).Zx(this::ZO);
  }
  
  private static Ztk a(Ztk paramZtk) {
    return paramZtk;
  }
  
  static {
    // Byte code:
    //   0: bipush #23
    //   2: ldc '@ptn<,\\t#quny=jks{5=f{'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zghf.a : Ljava/lang/String;
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
    //   80: bipush #20
    //   82: goto -> 112
    //   85: bipush #8
    //   87: goto -> 112
    //   90: bipush #13
    //   92: goto -> 112
    //   95: bipush #13
    //   97: goto -> 112
    //   100: bipush #78
    //   102: goto -> 112
    //   105: bipush #67
    //   107: goto -> 112
    //   110: bipush #106
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zghf.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */