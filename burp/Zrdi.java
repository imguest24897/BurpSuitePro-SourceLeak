package burp;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Supplier;

public class Zrdi implements Supplier<Zlku> {
  private final Ze97 Zb;
  
  private final Zzzv Zt;
  
  private final Zxgk ZU;
  
  private final AtomicBoolean Zu;
  
  public Zrdi(Ze97 paramZe97, Zzzv paramZzzv, Zlli<Zt13> paramZlli, Zxgk paramZxgk) {
    this.Zb = paramZe97;
    this.Zt = paramZzzv;
    this.ZU = paramZxgk;
    this.Zu = new AtomicBoolean();
    paramZlli.ZE(Zt13.ZC, this::lambda$new$1);
    String[] arrayOfString = Zlku.ZH();
    paramZlli.ZE(Zt13.ZV, this::lambda$new$3);
    if (Zbqc.Zwu() == null)
      Zlku.Zt(new String[1]); 
  }
  
  public Zlku ZL() {
    boolean bool = false;
    if (this.ZU.ZF()) {
      this.ZU.ZJ();
      bool = true;
    } 
    if (this.Zu.get() || bool)
      return null; 
    Zlku zlku = this.Zb.ZV();
    return (zlku != null) ? zlku : this.Zt.Zp();
  }
  
  private void lambda$new$3(Zxr8 paramZxr8) {
    paramZxr8.ZP(this::lambda$new$2);
  }
  
  private void lambda$new$2(Ztak paramZtak) {
    if (paramZtak.ZO())
      this.Zu.set(false); 
  }
  
  private void lambda$new$1(Zxr8 paramZxr8) {
    paramZxr8.ZP(this::lambda$new$0);
  }
  
  private void lambda$new$0(Zst9 paramZst9) {
    this.Zu.set(true);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrdi.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */