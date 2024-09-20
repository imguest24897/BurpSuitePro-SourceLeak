package burp;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

public class Zznr implements Zstw {
  private final Zz1m<Zt1l> Zc;
  
  private final Zzyg Zi;
  
  private final Runnable Zy;
  
  private final AtomicReference<Zb6l> Zm;
  
  public Zznr(Zz1m<Zt1l> paramZz1m, Zzyg paramZzyg, Ztos<Zt13> paramZtos, Runnable paramRunnable) {
    this.Zc = paramZz1m;
    this.Zi = paramZzyg;
    this.Zy = paramRunnable;
    this.Zm = new AtomicReference<>();
    paramZtos.ZE(Zt13.Zd, this::Zh);
    paramZtos.ZE(Zt13.ZC, this::lambda$new$0);
    paramZtos.ZE(Zt13.ZV, this::lambda$new$1);
  }
  
  public void Zm() {
    this.Zi.ZM(Zev0.FINISHED);
    this.Zc.ZD(new Zxr8(Zt1l.ZP, Zev0.FINISHED));
  }
  
  public boolean Zn() {
    return (this.Zi.Zyq() == Zev0.RUNNING);
  }
  
  public boolean ZH() {
    return (this.Zi.Zyq() == Zev0.FINISHED && Objects.isNull(this.Zm.get()));
  }
  
  public boolean Zc() {
    return (this.Zi.Zyq() == Zev0.DELETED);
  }
  
  private void Zh(Zxr8<Void> paramZxr8) {
    this.Zi.ZM(Zev0.DELETED);
    this.Zc.ZD(new Zxr8(Zt1l.ZP, Zev0.DELETED));
    this.Zy.run();
  }
  
  private void ZO(Zst9 paramZst9) {
    if (paramZst9.ZB()) {
      this.Zi.ZM(Zev0.PAUSED);
      this.Zc.ZD(new Zxr8(Zt1l.ZP, Zev0.PAUSED));
    } 
  }
  
  private void Zx(Ztak paramZtak) {
    if (paramZtak.ZX()) {
      this.Zi.ZM(Zev0.RUNNING);
      this.Zc.ZD(new Zxr8(Zt1l.ZP, Zev0.RUNNING));
    } 
  }
  
  private void lambda$new$1(Zxr8 paramZxr8) {
    paramZxr8.ZP(this::Zx);
  }
  
  private void lambda$new$0(Zxr8 paramZxr8) {
    paramZxr8.ZP(this::ZO);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zznr.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */