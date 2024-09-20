package burp;

import burp.api.montoya.logger.LoggerCaptureHttpRequestResponse;
import java.util.function.Consumer;

public class Zg9t {
  private final Zegl Zq;
  
  private final Zskh ZY;
  
  private final Zl1k ZA;
  
  private final Zsju Zo;
  
  private final Zbz6 Zm;
  
  private final Zm6v ZQ;
  
  private final Consumer<Zs4l<LoggerCaptureHttpRequestResponse, Boolean>> ZX;
  
  private static Zbqc[] ZL;
  
  public Zg9t(Zegl paramZegl, Zskh paramZskh, Zl1k paramZl1k, Zsju paramZsju, Zbz6 paramZbz6, Zm6v paramZm6v, Consumer<Zs4l<LoggerCaptureHttpRequestResponse, Boolean>> paramConsumer) {
    this.Zq = paramZegl;
    this.ZY = paramZskh;
    this.ZA = paramZl1k;
    Zbqc[] arrayOfZbqc = ZD();
    this.Zo = paramZsju;
    this.Zm = paramZbz6;
    this.ZQ = paramZm6v;
    this.ZX = paramConsumer;
    if (arrayOfZbqc != null)
      Zbqc.Zr(new Zbqc[2]); 
  }
  
  public Zb7x ZL() {
    return new Zb7x(this.Zq, this.ZY, this.ZA, this.Zo, this.Zm, this.ZQ, this.ZX);
  }
  
  public static void Zg(Zbqc[] paramArrayOfZbqc) {
    ZL = paramArrayOfZbqc;
  }
  
  public static Zbqc[] ZD() {
    return ZL;
  }
  
  static {
    if (ZD() != null)
      Zg(new Zbqc[4]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zg9t.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */