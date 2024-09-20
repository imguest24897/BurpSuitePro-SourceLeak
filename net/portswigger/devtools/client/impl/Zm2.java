package net.portswigger.devtools.client.impl;

import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.browser.Zcl;
import net.portswigger.browser.Zcv;
import net.portswigger.browser.Zd0;
import net.portswigger.browser.Zdb;
import net.portswigger.browser.Ze1;
import net.portswigger.browser.Ze6;
import net.portswigger.browser.Zeg;
import net.portswigger.browser.Zti;
import net.portswigger.browser.Ztj;
import net.portswigger.browser.Ztk;
import net.portswigger.browser.Ztq;
import net.portswigger.devtools.client.Z_;
import net.portswigger.devtools.client.Zi;
import net.portswigger.devtools.client.Zk;
import net.portswigger.devtools.client.Zn;
import net.portswigger.devtools.client.Zp;
import net.portswigger.devtools.client.Zy;
import net.portswigger.devtools.protocol.ChromeDevTools;
import net.portswigger.devtools.protocol.Zs;
import net.portswigger.devtools.protocol.events.page.JavascriptDialogOpening;
import net.portswigger.devtools.protocol.types.page.NavigationEntry;
import net.portswigger.devtools.protocol.types.page.NavigationHistory;

public class Zm2 implements Zd0 {
  private final Zn Zr;
  
  private Zeg ZT;
  
  private static final String a;
  
  public Zm2(Zn paramZn) {
    this.Zr = Objects.<Zn>requireNonNull(paramZn);
  }
  
  public CompletableFuture<?> Zc() {
    return CompletableFuture.allOf((CompletableFuture<?>[])new CompletableFuture[] { this.Zr.ZL(Zk.ZA(Zm2::lambda$initialise$0)), this.Zr.ZL(Zk.ZA(Zm2::lambda$initialise$1)) });
  }
  
  public String ZU() throws Ztk {
    try {
      NavigationHistory navigationHistory = (NavigationHistory)this.Zr.Zz(Zk.ZA(Zm2::lambda$title$2));
      NavigationEntry navigationEntry = navigationHistory.entries.get(navigationHistory.currentIndex.intValue());
      return navigationEntry.title;
    } catch (InterruptedException interruptedException) {
      Zah.Zl(interruptedException, Zk_.IGNORED);
      Thread.currentThread().interrupt();
      return "";
    } catch (Z_ z_) {
      Zah.Zl((Throwable)z_, Zk_.RETHROWN);
      throw new Ztj(z_);
    } catch (Zp zp) {
      Zah.Zl((Throwable)zp, Zk_.RETHROWN);
      throw new Zti(zp);
    } catch (Zi zi) {
      Zah.Zl((Throwable)zi, Zk_.RETHROWN);
      throw new Ze1(zi);
    } 
  }
  
  public void ZU(String paramString) throws Ztk {
    try {
      this.Zr.Zz(Zk.ZA(paramString::lambda$addScriptToEvaluateOnNewDocument$3));
    } catch (InterruptedException interruptedException) {
      Zah.Zl(interruptedException, Zk_.IGNORED);
      Thread.currentThread().interrupt();
    } catch (Z_ z_) {
      Zah.Zl((Throwable)z_, Zk_.RETHROWN);
      throw new Ztj(z_);
    } catch (Zp zp) {
      Zah.Zl((Throwable)zp, Zk_.RETHROWN);
      throw new Zti(zp);
    } catch (Zi zi) {
      Zah.Zl((Throwable)zi, Zk_.RETHROWN);
      throw new Ztq(zi);
    } 
  }
  
  public void Zz() {
    try {
      if (this.ZT != null)
        this.ZT.ZY(); 
    } catch (Ze1 ze1) {
      throw a(null);
    } 
  }
  
  public Zdb Zi(Ze6 paramZe6) throws Ztk {
    try {
      return Zx7.Zd(this.Zr, paramZe6);
    } catch (InterruptedException interruptedException) {
      Zah.Zl(interruptedException, Zk_.IGNORED);
      Thread.currentThread().interrupt();
      return Zx0.INSTANCE;
    } catch (Z_ z_) {
      Zah.Zl((Throwable)z_, Zk_.RETHROWN);
      throw new Ztj(z_);
    } catch (Zp zp) {
      Zah.Zl((Throwable)zp, Zk_.RETHROWN);
      throw new Zti(zp);
    } catch (Zi zi) {
      Zah.Zl((Throwable)zi, Zk_.RETHROWN);
      throw new Ztq(zi);
    } 
  }
  
  public Zeg ZI(int paramInt, Zcl paramZcl) {
    try {
      if (this.ZT != null)
        try {
          if (!this.ZT.Zq().Zk())
            return this.ZT; 
        } catch (Ze1 ze1) {
          throw a(null);
        }  
    } catch (Ze1 ze1) {
      throw a(null);
    } 
    this.ZT = (Zeg)new Zmh(this.Zr, paramInt, paramZcl);
    return this.ZT;
  }
  
  public void ZG() throws Ztk {
    try {
      this.Zr.Zz(Zk.ZA(Zm2::lambda$removeBaseTargetFromPage$4));
    } catch (Zp zp) {
      Zah.Zl((Throwable)zp, Zk_.RETHROWN);
      throw new Zti(zp);
    } catch (Z_ z_) {
      Zah.Zl((Throwable)z_, Zk_.RETHROWN);
      throw new Ztj(z_);
    } catch (Zi zi) {
      Zah.Zl((Throwable)zi, Zk_.RETHROWN);
      throw new Ztq(zi);
    } catch (InterruptedException interruptedException) {
      Zah.Zl(interruptedException, Zk_.IGNORED);
      Thread.currentThread().interrupt();
    } 
  }
  
  public void Zy() throws Ztk {
    try {
      this.Zr.Zn(this::lambda$autoDismissDialogs$7);
    } catch (Zp zp) {
      Zah.Zl((Throwable)zp, Zk_.RETHROWN);
      throw new Zti(zp);
    } catch (Z_ z_) {
      Zah.Zl((Throwable)z_, Zk_.RETHROWN);
      throw new Ztj(z_);
    } 
  }
  
  public Optional<Zcv> Zh() throws Ztk {
    try {
      String str = (String)this.Zr.Zh(Zk.ZA(Zm2::lambda$takeScreenshot$8), Zy.Zx());
      return Optional.of(new Zcv(str));
    } catch (Zi zi) {
      Zah.Zl((Throwable)zi, Zk_.RETHROWN);
      throw new Ztq(zi);
    } catch (InterruptedException interruptedException) {
      Zah.Zl(interruptedException, Zk_.IGNORED);
      Thread.currentThread().interrupt();
      return Optional.empty();
    } 
  }
  
  private static CompletableFuture lambda$takeScreenshot$8(ChromeDevTools paramChromeDevTools) {
    return paramChromeDevTools.getPage().captureScreenshot();
  }
  
  private Zs lambda$autoDismissDialogs$7(ChromeDevTools paramChromeDevTools) throws Z_, Zp {
    return paramChromeDevTools.getPage().onJavascriptDialogOpening(this::lambda$autoDismissDialogs$6);
  }
  
  private void lambda$autoDismissDialogs$6(JavascriptDialogOpening paramJavascriptDialogOpening) {
    this.Zr.Zg(Zk.ZA(Zm2::lambda$autoDismissDialogs$5), Zy.ZX());
  }
  
  private static CompletableFuture lambda$autoDismissDialogs$5(ChromeDevTools paramChromeDevTools) {
    return paramChromeDevTools.getPage().handleJavaScriptDialog(Boolean.valueOf(false));
  }
  
  private static CompletableFuture lambda$removeBaseTargetFromPage$4(ChromeDevTools paramChromeDevTools) {
    return paramChromeDevTools.getRuntime().evaluate(a);
  }
  
  private static CompletableFuture lambda$addScriptToEvaluateOnNewDocument$3(String paramString, ChromeDevTools paramChromeDevTools) {
    return paramChromeDevTools.getPage().addScriptToEvaluateOnNewDocument(paramString);
  }
  
  private static CompletableFuture lambda$title$2(ChromeDevTools paramChromeDevTools) {
    return paramChromeDevTools.getPage().getNavigationHistory();
  }
  
  private static CompletableFuture lambda$initialise$1(ChromeDevTools paramChromeDevTools) {
    return paramChromeDevTools.getRuntime().enable();
  }
  
  private static CompletableFuture lambda$initialise$0(ChromeDevTools paramChromeDevTools) {
    return paramChromeDevTools.getPage().enable();
  }
  
  private static Ze1 a(Ze1 paramZe1) {
    return paramZe1;
  }
  
  static {
    // Byte code:
    //   0: bipush #27
    //   2: ldc '*\\tJ1n#L1\\f~3[\\fMl3\\tLh+q#J~\\n"q*DsxaEn#BX~\\n&|%sX^#fxKh_b9i4\d\\f5a_ciaE1Ch[|xJch2\\t6\\fo!\\tJ6QC`f*'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic net/portswigger/devtools/client/impl/Zm2.a : Ljava/lang/String;
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
    //   80: bipush #93
    //   82: goto -> 112
    //   85: bipush #119
    //   87: goto -> 112
    //   90: bipush #37
    //   92: goto -> 112
    //   95: bipush #10
    //   97: goto -> 112
    //   100: bipush #99
    //   102: goto -> 112
    //   105: bipush #120
    //   107: goto -> 112
    //   110: bipush #6
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\client\impl\Zm2.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */