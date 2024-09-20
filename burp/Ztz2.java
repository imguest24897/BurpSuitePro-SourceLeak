package burp;

import burp.api.montoya.logger.LoggerCaptureHttpRequestResponse;
import java.util.List;
import java.util.function.Supplier;

public class Ztz2 implements Zg4h {
  private final Zg9c Za;
  
  private final Supplier<Zs4l<LoggerCaptureHttpRequestResponse, Boolean>> Zp;
  
  private final Zskl ZA;
  
  private final Zbnt ZW;
  
  private static String Zr;
  
  public Ztz2(Zg9c paramZg9c, Supplier<Zs4l<LoggerCaptureHttpRequestResponse, Boolean>> paramSupplier, Zskl paramZskl, Zbnt paramZbnt) {
    this.Za = paramZg9c;
    this.Zp = paramSupplier;
    this.ZA = paramZskl;
    this.ZW = paramZbnt;
  }
  
  public List<Zs0s> ZD() {
    String str = Ze();
    if (this.Za.Z_D() == Zzca.BAMBDA)
      return List.of(new Zgai(this.Za), new Zszb(this.Za), new Zx6r(this.Zp.get(), this.ZA, this.ZW)); 
    if (str != null)
      Zbqc.Zr(new Zbqc[4]); 
    return List.of(new Zgai(this.Za), new Zszb(this.Za), new Zsez(this.Za), new Zegm(this.Za), new Zrkh(this.Za));
  }
  
  public static void ZS(String paramString) {
    Zr = paramString;
  }
  
  public static String Ze() {
    return Zr;
  }
  
  static {
    if (Ze() != null)
      ZS("cuXY1"); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztz2.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */