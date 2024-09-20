package net.portswigger.devtools.client.impl;

import java.util.List;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Stream;
import net.portswigger.browser.Zcd;
import net.portswigger.browser.Zdz;
import net.portswigger.browser.Zek;
import net.portswigger.browser.Ztk;
import net.portswigger.devtools.client.Zn;
import net.portswigger.devtools.protocol.ChromeDevTools;

public class Zxq implements Zek {
  private final Zn Zv;
  
  private final Zdz Zt;
  
  public Zxq(Zn paramZn, Zdz paramZdz) {
    this.Zv = paramZn;
    this.Zt = paramZdz;
  }
  
  public void Za(List<Zcd> paramList) throws Ztk {
    // Byte code:
    //   0: aload_1
    //   1: invokeinterface isEmpty : ()Z
    //   6: ifne -> 34
    //   9: aload_0
    //   10: getfield Zv : Lnet/portswigger/devtools/client/Zn;
    //   13: aload_0
    //   14: aload_1
    //   15: <illegal opcode> Zy : (Lnet/portswigger/devtools/client/impl/Zxq;Ljava/util/List;)Lnet/portswigger/devtools/client/Zs;
    //   20: invokestatic ZA : (Lnet/portswigger/devtools/client/Zs;)Lnet/portswigger/devtools/client/Zk;
    //   23: invokevirtual Zz : (Lnet/portswigger/devtools/client/Zk;)Ljava/lang/Object;
    //   26: pop
    //   27: goto -> 34
    //   30: invokestatic a : (Lnet/portswigger/browser/Ztk;)Lnet/portswigger/browser/Ztk;
    //   33: athrow
    //   34: goto -> 105
    //   37: astore_2
    //   38: aload_2
    //   39: getstatic net/portswigger/Zk_.IGNORED : Lnet/portswigger/Zk_;
    //   42: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   45: invokestatic currentThread : ()Ljava/lang/Thread;
    //   48: invokevirtual interrupt : ()V
    //   51: goto -> 105
    //   54: astore_2
    //   55: aload_2
    //   56: getstatic net/portswigger/Zk_.RETHROWN : Lnet/portswigger/Zk_;
    //   59: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   62: new net/portswigger/browser/Ztj
    //   65: dup
    //   66: aload_2
    //   67: invokespecial <init> : (Ljava/lang/Throwable;)V
    //   70: athrow
    //   71: astore_2
    //   72: aload_2
    //   73: getstatic net/portswigger/Zk_.RETHROWN : Lnet/portswigger/Zk_;
    //   76: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   79: new net/portswigger/browser/Zti
    //   82: dup
    //   83: aload_2
    //   84: invokespecial <init> : (Ljava/lang/Throwable;)V
    //   87: athrow
    //   88: astore_2
    //   89: aload_2
    //   90: getstatic net/portswigger/Zk_.RETHROWN : Lnet/portswigger/Zk_;
    //   93: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   96: new net/portswigger/browser/Ztq
    //   99: dup
    //   100: aload_2
    //   101: invokespecial <init> : (Ljava/io/IOException;)V
    //   104: athrow
    //   105: return
    // Exception table:
    //   from	to	target	type
    //   0	27	30	net/portswigger/browser/Ztk
    //   0	34	37	java/lang/InterruptedException
    //   0	34	54	net/portswigger/devtools/client/Z_
    //   0	34	71	net/portswigger/devtools/client/Zp
    //   0	34	88	net/portswigger/devtools/client/Zi
  }
  
  private CompletableFuture lambda$clear$3(ChromeDevTools paramChromeDevTools) {
    return paramChromeDevTools.getStorage().clearCookies(this.Zt.ZVJ());
  }
  
  private CompletableFuture lambda$setCookies$2(List paramList, ChromeDevTools paramChromeDevTools) {
    Objects.requireNonNull(Zoy.ZC());
    return paramChromeDevTools.getStorage().setCookies(paramList.stream().map(Zoy.ZC()::Zu).toList(), this.Zt.ZVJ());
  }
  
  private static Stream lambda$getAllCookies$1(List paramList) {
    Objects.requireNonNull(Zoy.ZC());
    return paramList.stream().map(Zoy.ZC()::ZN);
  }
  
  private CompletableFuture lambda$getAllCookies$0(ChromeDevTools paramChromeDevTools) {
    return paramChromeDevTools.getStorage().getCookies(this.Zt.ZVJ());
  }
  
  private static Ztk a(Ztk paramZtk) {
    return paramZtk;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\client\impl\Zxq.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */