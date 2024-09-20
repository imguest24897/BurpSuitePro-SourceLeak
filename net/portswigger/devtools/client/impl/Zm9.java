package net.portswigger.devtools.client.impl;

import burp.Ztos;
import burp.Zxr8;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.browser.Zcq;
import net.portswigger.browser.Zdn;
import net.portswigger.browser.Zed;
import net.portswigger.browser.Zti;
import net.portswigger.browser.Ztj;
import net.portswigger.browser.Ztk;
import net.portswigger.browser.Ztq;
import net.portswigger.browser.Ztw;
import net.portswigger.browser.Zzf;
import net.portswigger.browser.Zzk;
import net.portswigger.devtools.client.Z_;
import net.portswigger.devtools.client.Zi;
import net.portswigger.devtools.client.Zk;
import net.portswigger.devtools.client.Zn;
import net.portswigger.devtools.client.Zp;
import net.portswigger.devtools.protocol.ChromeDevTools;
import net.portswigger.devtools.protocol.Zs;
import net.portswigger.devtools.protocol.events.page.FrameStartedLoading;
import net.portswigger.devtools.protocol.events.page.FrameStoppedLoading;
import net.portswigger.devtools.protocol.types.target.TargetInfo;

public class Zm9 implements Zed {
  private final Ztos<Zcq> Zk;
  
  private final Zzk ZN;
  
  private final Zn Zb;
  
  private static final String a;
  
  public Zm9(Ztos<Zcq> paramZtos, Zzk paramZzk, Zn paramZn) {
    this.Zk = Objects.<Ztos<Zcq>>requireNonNull(paramZtos);
    this.ZN = Objects.<Zzk>requireNonNull(paramZzk);
    this.Zb = Objects.<Zn>requireNonNull(paramZn);
  }
  
  public void ZP() throws Zi {
    this.Zb.Zn(this::lambda$initialise$1);
    this.Zb.Zn(this::lambda$initialise$3);
  }
  
  public void Zh(String paramString) throws Ztk {
    Zf(paramString, null);
  }
  
  public void ZJ(Zdn paramZdn) throws Ztk {
    try {
      if (!(this.ZN instanceof Zxn))
        throw new UnsupportedOperationException(); 
    } catch (Ztk ztk) {
      throw a(null);
    } 
    String str = String.format(a, new Object[] { UUID.randomUUID() });
    ((Zxn)this.ZN).Zi(str, paramZdn);
    Zf(paramZdn.ZW(), str);
  }
  
  private void Zf(String paramString1, String paramString2) throws Ztk {
    // Byte code:
    //   0: aload_0
    //   1: getfield Zb : Lnet/portswigger/devtools/client/Zn;
    //   4: aload_1
    //   5: aload_2
    //   6: <illegal opcode> Zy : (Ljava/lang/String;Ljava/lang/String;)Lnet/portswigger/devtools/client/Zs;
    //   11: invokestatic ZA : (Lnet/portswigger/devtools/client/Zs;)Lnet/portswigger/devtools/client/Zk;
    //   14: invokevirtual ZL : (Lnet/portswigger/devtools/client/Zk;)Ljava/util/concurrent/CompletableFuture;
    //   17: pop
    //   18: return
  }
  
  public String Zr() throws Ztk {
    try {
      return ((TargetInfo)this.Zb.Zz(Zk.ZA(Zm9::lambda$get$5))).url;
    } catch (Z_ z_) {
      Zah.Zl((Throwable)z_, Zk_.RETHROWN);
      throw new Ztj(z_);
    } catch (Zp zp) {
      Zah.Zl((Throwable)zp, Zk_.RETHROWN);
      throw new Zti(zp);
    } catch (Zi zi) {
      Zah.Zl((Throwable)zi, Zk_.RETHROWN);
      throw new Ztq(zi);
    } catch (InterruptedException interruptedException) {
      Zah.Zl(interruptedException, Zk_.IGNORED);
      Thread.currentThread().interrupt();
      return Zzf.Zg();
    } 
  }
  
  public void ZZ() {
    try {
      this.Zb.Zz(Zk.ZA(Zm9::lambda$stopLoading$6));
    } catch (InterruptedException interruptedException) {
      Zah.Zl(interruptedException, Zk_.IGNORED);
      Thread.currentThread().interrupt();
    } catch (Zi zi) {
      Zah.Zl((Throwable)zi, Zk_.IGNORED);
    } 
  }
  
  private static CompletableFuture lambda$stopLoading$6(ChromeDevTools paramChromeDevTools) {
    return paramChromeDevTools.getPage().stopLoading();
  }
  
  private static CompletableFuture lambda$get$5(ChromeDevTools paramChromeDevTools) {
    return paramChromeDevTools.getTarget().getTargetInfo();
  }
  
  private static CompletableFuture lambda$set$4(String paramString1, String paramString2, ChromeDevTools paramChromeDevTools) {
    return paramChromeDevTools.getPage().navigate(paramString1, paramString2, null, null, null);
  }
  
  private Zs lambda$initialise$3(ChromeDevTools paramChromeDevTools) throws Z_, Zp {
    return paramChromeDevTools.getPage().onFrameStoppedLoading(this::lambda$initialise$2);
  }
  
  private void lambda$initialise$2(FrameStoppedLoading paramFrameStoppedLoading) {
    this.Zk.ZD(new Zxr8(Zcq.ZR, new Ztw(paramFrameStoppedLoading.frameId)));
  }
  
  private Zs lambda$initialise$1(ChromeDevTools paramChromeDevTools) throws Z_, Zp {
    return paramChromeDevTools.getPage().onFrameStartedLoading(this::lambda$initialise$0);
  }
  
  private void lambda$initialise$0(FrameStartedLoading paramFrameStartedLoading) {
    this.Zk.ZD(new Zxr8(Zcq.Zg, new Ztw(paramFrameStartedLoading.frameId)));
  }
  
  private static Ztk a(Ztk paramZtk) {
    return paramZtk;
  }
  
  static {
    // Byte code:
    //   0: bipush #35
    //   2: ldc '3?p0?W~ece}W'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic net/portswigger/devtools/client/impl/Zm9.a : Ljava/lang/String;
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
    //   80: bipush #120
    //   82: goto -> 112
    //   85: bipush #73
    //   87: goto -> 112
    //   90: bipush #104
    //   92: goto -> 112
    //   95: bipush #35
    //   97: goto -> 112
    //   100: bipush #41
    //   102: goto -> 112
    //   105: bipush #51
    //   107: goto -> 112
    //   110: bipush #91
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\client\impl\Zm9.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */