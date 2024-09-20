package burp;

import burp.api.montoya.logger.LoggerCaptureHttpRequestResponse;
import java.util.List;
import java.util.function.Supplier;

public class Zl8 implements Zg4h {
  private final Zg9c ZA;
  
  private final Supplier<Zs4l<LoggerCaptureHttpRequestResponse, Boolean>> Zc;
  
  private final Zskl ZO;
  
  private final Zbnt Zl;
  
  public Zl8(Zg9c paramZg9c, Supplier<Zs4l<LoggerCaptureHttpRequestResponse, Boolean>> paramSupplier, Zskl paramZskl, Zbnt paramZbnt) {
    this.ZA = paramZg9c;
    this.Zc = paramSupplier;
    this.ZO = paramZskl;
    this.Zl = paramZbnt;
  }
  
  public List<Zs0s> ZD() {
    return (this.ZA.Z_D() == Zzca.BAMBDA) ? List.of(new Zgai(this.ZA), new Zx6r(this.Zc.get(), this.ZO, this.Zl)) : List.of(new Zgai(this.ZA), new Zmnq(this.ZA), new Zsez(this.ZA), new Zegm(this.ZA), new Zrkh(this.ZA));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zl8.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */