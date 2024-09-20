package burp;

import java.time.Duration;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import net.portswigger.Zsy;

public class Zmxr implements Zlr9 {
  private final Zgb6 ZJ;
  
  private final Zts5 Zm;
  
  private final Zsil Zf;
  
  private final Zzen ZL;
  
  private final Zlg9 ZO;
  
  private final Zxg_ ZB;
  
  private final Ze6v Zx;
  
  private final Zgg0 Zw;
  
  private final Zxy1 Zv;
  
  private final Ztbb ZW;
  
  private Zmxr(Zgb6 paramZgb6, Zts5 paramZts5, Zsil paramZsil, Zzen paramZzen, Zlg9 paramZlg9, Zxg_ paramZxg_, Ze6v paramZe6v, Zgg0 paramZgg0, Zxy1 paramZxy1, Ztbb paramZtbb) {
    this.ZJ = paramZgb6;
    this.Zm = paramZts5;
    this.Zf = paramZsil;
    this.ZL = paramZzen;
    this.ZO = paramZlg9;
    this.ZB = paramZxg_;
    this.Zx = paramZe6v;
    this.Zw = paramZgg0;
    this.Zv = paramZxy1;
    this.ZW = paramZtbb;
  }
  
  public Zz9e Zm(Zsw paramZsw) {
    AtomicReference<Zln9> atomicReference = new AtomicReference();
    Zxtb zxtb = Zxtb.ZV(Zxtv.ZP().ZR(Ze45.ATTEMPT_HTTP2).ZF());
    int i = Zloq.Zo();
    Zsil zsil = this.ZJ.ZcC() ? new Zkuw(this.Zf, zxtb, this.ZJ, this.ZW) : this.Zf;
    Zz9e zz9e = this.Zx.Zc(new Zsms(this.Zm), Zgzx.ZT, zxtb, zsil, this.ZL, paramZsw, this.Zw, this.Zv);
    Objects.requireNonNull(atomicReference);
    Ze_d ze_d = new Ze_d(this.ZJ.ZfD(), this.ZO, zz9e, atomicReference::get);
    Objects.requireNonNull(this.ZL);
    Zln9 zln9 = new Zln9(this.ZB, this.ZL::Zt, ze_d);
    atomicReference.set(zln9);
    Objects.requireNonNull(this.ZL);
    if (Zbqc.Zwu() == null)
      Zloq.Zl(++i); 
    return new Zln9(this.ZB, this.ZL::Zt, ze_d);
  }
  
  public static Zmxr ZW(Zrgd paramZrgd, Zsy paramZsy, Consumer<Duration> paramConsumer, Zgb6 paramZgb6, Zgzy paramZgzy, Zz28 paramZz28, Zkl6 paramZkl6, Zskh paramZskh, Ztwv paramZtwv, Zkc6 paramZkc6, Zlg9 paramZlg9, Zgg0 paramZgg0, Zxy1 paramZxy1, Zsxe paramZsxe) {
    Ze6v ze6v = new Ze6v(paramZkl6, paramZgzy, paramZz28, paramZrgd, paramZsy, paramConsumer, paramZgb6, Zeew.TARGET, paramZtwv, paramZkc6, paramZsxe, Zlfd.Zo);
    return new Zmxr(paramZgb6, Zs38.ZG(paramZgb6).Zy(), Zxfj.ZI, new Zlbx(paramZskh), paramZlg9, paramZgzy.Zq(), ze6v, paramZgg0, paramZxy1, paramZkl6.ZM());
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmxr.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */