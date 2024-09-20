package net.portswigger.devtools.client.impl;

import burp.Zbqc;
import java.time.Instant;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import net.portswigger.Zah;
import net.portswigger.Zhi;
import net.portswigger.Zk_;
import net.portswigger.browser.Zcl;
import net.portswigger.browser.Zct;
import net.portswigger.browser.Zcv;
import net.portswigger.browser.Zeh;
import net.portswigger.browser.Zj4;
import net.portswigger.browser.Zta;
import net.portswigger.devtools.client.Z_;
import net.portswigger.devtools.client.Zi;
import net.portswigger.devtools.client.Zk;
import net.portswigger.devtools.client.Zn;
import net.portswigger.devtools.client.Zp;
import net.portswigger.devtools.protocol.ChromeDevTools;
import net.portswigger.devtools.protocol.Zs;
import net.portswigger.devtools.protocol.events.page.ScreencastFrame;
import net.portswigger.devtools.protocol.types.page.CaptureScreenshotFormat;
import net.portswigger.devtools.protocol.types.page.StartScreencastFormat;

public class Zmh extends Zta {
  private final Zn ZV;
  
  private Zs ZW;
  
  private static String[] ZE;
  
  public Zmh(Zn paramZn, int paramInt, Zcl paramZcl) {
    super(paramInt, paramZcl);
    String[] arrayOfString = ZG();
    this.ZV = paramZn;
    if (arrayOfString == null)
      Zbqc.Zr(new Zbqc[2]); 
  }
  
  public boolean Zv() {
    boolean bool = super.Zv();
    if (bool) {
      Zh().ifPresent(this::lambda$start$0);
      Zs();
    } 
    return bool;
  }
  
  private Optional<Zeh> Zh() {
    // Byte code:
    //   0: invokestatic now : ()Ljava/time/Instant;
    //   3: astore_1
    //   4: aload_0
    //   5: getfield ZV : Lnet/portswigger/devtools/client/Zn;
    //   8: aload_0
    //   9: <illegal opcode> Zy : (Lnet/portswigger/devtools/client/impl/Zmh;)Lnet/portswigger/devtools/client/Zs;
    //   14: invokestatic ZA : (Lnet/portswigger/devtools/client/Zs;)Lnet/portswigger/devtools/client/Zk;
    //   17: invokevirtual Zz : (Lnet/portswigger/devtools/client/Zk;)Ljava/lang/Object;
    //   20: checkcast java/lang/String
    //   23: astore_2
    //   24: aload_2
    //   25: invokestatic Zu : (Ljava/lang/String;)Z
    //   28: ifeq -> 43
    //   31: aload_0
    //   32: aload_1
    //   33: aload_2
    //   34: <illegal opcode> Zm : (Lnet/portswigger/devtools/client/impl/Zmh;Ljava/time/Instant;Ljava/lang/String;)Lnet/portswigger/browser/Zeh;
    //   39: invokestatic of : (Ljava/lang/Object;)Ljava/util/Optional;
    //   42: areturn
    //   43: goto -> 82
    //   46: astore_1
    //   47: aload_1
    //   48: getstatic net/portswigger/Zk_.COMMON_RUNTIME_FAILURE : Lnet/portswigger/Zk_;
    //   51: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   54: goto -> 82
    //   57: astore_1
    //   58: aload_1
    //   59: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   62: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   65: goto -> 82
    //   68: astore_1
    //   69: aload_1
    //   70: getstatic net/portswigger/Zk_.IGNORED : Lnet/portswigger/Zk_;
    //   73: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   76: invokestatic currentThread : ()Ljava/lang/Thread;
    //   79: invokevirtual interrupt : ()V
    //   82: invokestatic empty : ()Ljava/util/Optional;
    //   85: areturn
    // Exception table:
    //   from	to	target	type
    //   0	42	46	net/portswigger/devtools/client/Z_
    //   0	42	46	net/portswigger/devtools/client/Zp
    //   0	42	57	net/portswigger/devtools/client/Zi
    //   0	42	68	java/lang/InterruptedException
  }
  
  private void Zs() {
    try {
      this.ZW = this.ZV.Zn(this::lambda$startScreencast$3);
      this.ZV.Zz(Zk.ZA(this::lambda$startScreencast$4));
    } catch (Z_|Zp z_) {
      Zah.Zl((Throwable)z_, Zk_.IGNORED);
    } catch (InterruptedException interruptedException) {
      Zah.Zl(interruptedException, Zk_.IGNORED);
      Thread.currentThread().interrupt();
    } catch (Zi zi) {
      Zah.Zl((Throwable)zi, Zk_.UNEXPECTED);
    } 
  }
  
  private void Zt(ScreencastFrame paramScreencastFrame) {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZV : Lnet/portswigger/devtools/client/Zn;
    //   4: aload_1
    //   5: <illegal opcode> Zy : (Lnet/portswigger/devtools/protocol/events/page/ScreencastFrame;)Lnet/portswigger/devtools/client/Zs;
    //   10: invokestatic ZA : (Lnet/portswigger/devtools/client/Zs;)Lnet/portswigger/devtools/client/Zk;
    //   13: invokevirtual ZL : (Lnet/portswigger/devtools/client/Zk;)Ljava/util/concurrent/CompletableFuture;
    //   16: pop
    //   17: aload_0
    //   18: aload_0
    //   19: aload_1
    //   20: <illegal opcode> Zm : (Lnet/portswigger/devtools/client/impl/Zmh;Lnet/portswigger/devtools/protocol/events/page/ScreencastFrame;)Lnet/portswigger/browser/Zeh;
    //   25: invokevirtual ZQ : (Lnet/portswigger/browser/Zeh;)V
    //   28: return
  }
  
  private Zct Zp(Instant paramInstant, String paramString) {
    return Zct.ZJ(Zk(), this.Zm, paramInstant, new Zcv(paramString));
  }
  
  protected void Zi() {
    String[] arrayOfString = ZG();
    try {
      if (Zq() == Zj4.ENDED_BY_REMOTE)
        return; 
      this.ZV.Zz(Zk.ZA(Zmh::lambda$shutdown$7));
      if (this.ZW != null)
        this.ZW.Zf(); 
    } catch (Zp|Z_ zp) {
      Zah.Zl((Throwable)zp, Zk_.COMMON_RUNTIME_FAILURE);
    } catch (InterruptedException interruptedException) {
      Zah.Zl(interruptedException, Zk_.IGNORED);
      Thread.currentThread().interrupt();
    } catch (Zi zi) {
      Zah.Zl((Throwable)zi, Zk_.UNEXPECTED);
    } finally {
      super.Zi();
    } 
    try {
      if (Zbqc.Zwu() == null)
        Zf(new String[5]); 
    } catch (Zp zp) {
      throw a(null);
    } 
  }
  
  private static CompletableFuture lambda$shutdown$7(ChromeDevTools paramChromeDevTools) {
    return paramChromeDevTools.getPage().stopScreencast();
  }
  
  private Zct lambda$onScreencastFrame$6(ScreencastFrame paramScreencastFrame) {
    return Zp(Zhi.ZW(paramScreencastFrame.metadata.timestamp.doubleValue()), paramScreencastFrame.data);
  }
  
  private static CompletableFuture lambda$onScreencastFrame$5(ScreencastFrame paramScreencastFrame, ChromeDevTools paramChromeDevTools) {
    return paramChromeDevTools.getPage().screencastFrameAck(paramScreencastFrame.sessionId);
  }
  
  private CompletableFuture lambda$startScreencast$4(ChromeDevTools paramChromeDevTools) {
    return paramChromeDevTools.getPage().startScreencast(StartScreencastFormat.valueOf(this.Zm.name()), Integer.valueOf(this.ZG), null, null, null);
  }
  
  private Zs lambda$startScreencast$3(ChromeDevTools paramChromeDevTools) throws Z_, Zp {
    return paramChromeDevTools.getPage().onScreencastFrame(this::Zt);
  }
  
  private Zct lambda$takeScreenshot$2(Instant paramInstant, String paramString) {
    return Zp(paramInstant, paramString);
  }
  
  private CompletableFuture lambda$takeScreenshot$1(ChromeDevTools paramChromeDevTools) {
    return paramChromeDevTools.getPage().captureScreenshot(CaptureScreenshotFormat.valueOf(this.Zm.name()), Integer.valueOf(this.ZG), null, null, null, Boolean.valueOf(false));
  }
  
  private static void lambda$start$0(Zmh paramZmh, Zeh paramZeh) {
    paramZmh.ZQ(paramZeh);
  }
  
  public static void Zf(String[] paramArrayOfString) {
    ZE = paramArrayOfString;
  }
  
  public static String[] ZG() {
    return ZE;
  }
  
  private static Zp a(Zp paramZp) {
    return paramZp;
  }
  
  static {
    if (ZG() == null)
      Zf(new String[3]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\client\impl\Zmh.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */