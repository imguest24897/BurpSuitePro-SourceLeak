package burp;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import net.portswigger.Zqf;
import net.portswigger.Zuh;
import net.portswigger.browser.Zec;
import net.portswigger.browser.Zev;
import net.portswigger.browser.Ztv;

public class Zsib<F> {
  private final Zev Zv;
  
  private final Ztmq<F> Zn = new Ztmq<>();
  
  private final AtomicReference<Ztgw> Zq;
  
  private final AtomicReference<Ztgw> Zf;
  
  public Zsib(Zev paramZev) {
    String str = Ztgw.Zs();
    this.Zq = new AtomicReference<>();
    this.Zf = new AtomicReference<>();
    this.Zv = paramZev;
    if (Zbqc.Zwu() == null)
      Ztgw.ZE("jHgVzc"); 
  }
  
  public int ZB(Ztgw paramZtgw) {
    if (paramZtgw.ZE()) {
      Ztgw ztgw = this.Zq.get();
      if (ztgw != null)
        return this.Zn.ZV(ztgw.Zu()); 
    } 
    return this.Zn.ZV(paramZtgw.Zu());
  }
  
  public boolean Zf() {
    return (this.Zq.get() == null);
  }
  
  public List<Zgb7<F>> ZF() {
    return (this.Zq.get() != null) ? this.Zn.Zn(this.Zq.get()) : Collections.<Zgb7<F>>emptyList();
  }
  
  public Collection<List<Zgb7<F>>> Zm() {
    return (this.Zq.get() != null) ? this.Zn.ZY(this.Zq.get()) : this.Zn.Zs();
  }
  
  public List<Zgb7<F>> Za() {
    return (this.Zf.get() != null) ? this.Zn.Zn(this.Zf.get()) : Collections.<Zgb7<F>>emptyList();
  }
  
  public void Zy(Zgb7<F> paramZgb7) {
    Ztgw ztgw;
    String str = Ztgw.Zs();
    if (paramZgb7 != null) {
      ztgw = paramZgb7.Zb();
      if (ztgw.Zv(this.Zv)) {
        if (ztgw.ZE()) {
          this.Zq.compareAndSet(null, ztgw);
          this.Zn.Zq(paramZgb7, this.Zq.get());
          if (str != null) {
            if (ZU(ztgw))
              this.Zn.ZO(paramZgb7); 
            return;
          } 
          return;
        } 
      } else {
        return;
      } 
    } else {
      return;
    } 
    if (ZU(ztgw))
      this.Zn.ZO(paramZgb7); 
  }
  
  public boolean ZA(Ztgw paramZtgw) {
    Ztgw ztgw1 = this.Zf.get();
    if (ztgw1 == null)
      return false; 
    Ztgw ztgw2 = paramZtgw.ZE() ? this.Zq.get() : paramZtgw;
    return (ztgw2 != null && this.Zn.Zn(ztgw2).stream().anyMatch(ztgw1::lambda$followsTargetRequestInCorridor$0));
  }
  
  private boolean ZU(Ztgw paramZtgw) {
    return (paramZtgw.Zk() == Zec.DOCUMENT || this.Zn.ZV(paramZtgw) || ZY(paramZtgw.Zh()));
  }
  
  public void ZS(Ztgw paramZtgw) {
    this.Zf.compareAndSet(null, paramZtgw);
  }
  
  public boolean ZA() {
    return (this.Zf.get() != null);
  }
  
  private static boolean ZY(Ztv paramZtv) {
    if (paramZtv == null) {
      Zuh.Zb(false, Zqf.Zv);
      return true;
    } 
    return (paramZtv.Zs() && !paramZtv.ZZ(new String[] { Zmlb.ZT }));
  }
  
  private static boolean lambda$followsTargetRequestInCorridor$0(Ztgw paramZtgw, Zgb7 paramZgb7) {
    return paramZgb7.Zb().equals(paramZtgw);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsib.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */