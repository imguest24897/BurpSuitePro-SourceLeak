package net.portswigger.devtools.client.impl;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Objects;
import java.util.concurrent.Future;
import net.portswigger.browser.Zdx;
import net.portswigger.browser.Zo;

public class Zmj implements Zo, Zm7 {
  private final Future<?> Zc;
  
  private Zdx Zb;
  
  public Zmj(InputStream paramInputStream) {
    // Byte code:
    //   0: invokestatic ZG : ()Z
    //   3: aload_0
    //   4: invokespecial <init> : ()V
    //   7: istore_2
    //   8: aload_0
    //   9: invokestatic Zo : ()Lnet/portswigger/browser/Zdx;
    //   12: putfield Zb : Lnet/portswigger/browser/Zdx;
    //   15: aload_0
    //   16: invokestatic newSingleThreadExecutor : ()Ljava/util/concurrent/ExecutorService;
    //   19: aload_0
    //   20: aload_1
    //   21: <illegal opcode> run : (Lnet/portswigger/devtools/client/impl/Zmj;Ljava/io/InputStream;)Ljava/lang/Runnable;
    //   26: invokeinterface submit : (Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    //   31: putfield Zc : Ljava/util/concurrent/Future;
    //   34: iload_2
    //   35: ifne -> 45
    //   38: iconst_1
    //   39: anewarray burp/Zbqc
    //   42: invokestatic Zr : ([Lburp/Zbqc;)V
    //   45: return
  }
  
  public void Zp() {
    this.Zc.cancel(true);
  }
  
  public void Zg(Zdx paramZdx) {
    this.Zb = paramZdx;
  }
  
  private void lambda$new$0(InputStream paramInputStream) {
    Objects.requireNonNull(this.Zb);
    (new BufferedReader(new InputStreamReader(paramInputStream))).lines().forEach(this.Zb::ZH);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\client\impl\Zmj.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */