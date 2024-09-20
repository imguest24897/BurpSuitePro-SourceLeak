package net.portswigger.devtools.client.impl;

import burp.Zbqc;
import com.fasterxml.Zj.Zf;
import java.util.concurrent.CompletableFuture;
import net.portswigger.Zs6;
import net.portswigger.Zsy;
import net.portswigger.devtools.client.Zk;
import net.portswigger.devtools.client.Zn;
import net.portswigger.devtools.client.Zy;
import net.portswigger.devtools.protocol.ChromeDevTools;

public class Zm4 implements AutoCloseable {
  private static final Zs6<?> ZY = (Zs6<?>)new Zsy();
  
  private final Zn Zu;
  
  private final String ZR;
  
  private Zm4(Zn paramZn, String paramString) {
    this.Zu = paramZn;
    this.ZR = paramString;
  }
  
  public static Zm4 ZE(Zn paramZn) {
    int i = Zf.ZH();
    if (Zbqc.Zwu() == null)
      Zf.ZG(++i); 
    return new Zm4(paramZn, ZY.Z_(10));
  }
  
  public String ZR() {
    return this.ZR;
  }
  
  public void close() {
    this.Zu.Zg(Zk.ZA(this::lambda$close$0), Zy.ZX());
    int i = Zf.Zu();
    if (i == 0)
      Zbqc.Zr(new Zbqc[3]); 
  }
  
  private CompletableFuture lambda$close$0(ChromeDevTools paramChromeDevTools) {
    return paramChromeDevTools.getRuntime().releaseObjectGroup(this.ZR);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\client\impl\Zm4.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */