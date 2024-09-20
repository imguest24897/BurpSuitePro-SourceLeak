package burp;

import java.util.Objects;
import java.util.function.Consumer;

public class Ztit {
  private final Zmdu ZI;
  
  private final Ztai Zw;
  
  public Ztit(Zmdu paramZmdu, Ztai paramZtai) {
    this.ZI = paramZmdu;
    this.Zw = paramZtai;
  }
  
  public Zldf Zi(Ze3n paramZe3n, Zgq<Zrdb> paramZgq) {
    Zegr zegr = new Zegr(paramZe3n);
    return new Zldf(this.ZI, new Ztyt(this.Zw, zegr, paramZgq::lambda$passiveAnalysisReporter$0));
  }
  
  public Zldf Zp(Ze3n paramZe3n, Zgq<Zrdb> paramZgq) {
    Zegr zegr = new Zegr(paramZe3n);
    return new Zldf(new Zkkw(), new Ztyt(this.Zw, zegr, paramZgq::lambda$passiveAnalysisReporter$0));
  }
  
  public Zldf ZA(Consumer<Zx4o> paramConsumer, Zxs7 paramZxs7, Zlvf paramZlvf, byte[] paramArrayOfbyte, Ztbx paramZtbx, Zkv7 paramZkv7) {
    Zers zers = new Zers(paramZxs7, paramZlvf, paramArrayOfbyte, paramZtbx, paramZkv7);
    return new Zldf(this.ZI, new Ztyt(this.Zw, zers, paramConsumer));
  }
  
  private static void lambda$passiveAnalysisReporter$0(Zgq paramZgq, Zx4o paramZx4o) {
    Objects.requireNonNull(paramZgq);
    paramZx4o.Zn(paramZgq::Zu);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztit.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */