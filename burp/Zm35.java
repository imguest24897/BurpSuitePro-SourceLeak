package burp;

import java.util.Collections;
import java.util.List;
import java.util.Objects;
import net.portswigger.browser.Ze7;
import net.portswigger.browser.Zje;
import net.portswigger.browser.Zjw;
import net.portswigger.browser.Zt;
import net.portswigger.browser.Ztk;

public class Zm35 extends Zm3y implements Zlvj {
  private final Zski ZE;
  
  private final String ZT;
  
  private final String ZO;
  
  private Zm35(Zt49 paramZt49) {
    super(paramZt49);
    this.ZE = paramZt49.ZB;
    this.ZT = paramZt49.ZK;
    this.ZO = paramZt49.ZV;
  }
  
  public final Zm6i Zw() {
    Zbqc[] arrayOfZbqc = Zres.Zu();
    if (Zbqc.Zwu() == null)
      Zres.Zr(new Zbqc[3]); 
    return (new Zlx3()).ZZ(ZM()).ZX(ZB()).ZZ(ZE()).Zi(ZC()).ZW(Zx()).ZC(ZY()).ZI(Zsba.ZQ(Zf())).Zb(Zh().stream().map(Ze7n::Zn).toList()).ZN();
  }
  
  public Zski Zx() {
    return this.ZE;
  }
  
  public String ZY() {
    return this.ZT;
  }
  
  public String Zf() {
    return this.ZO;
  }
  
  public List<String> Z_() {
    return Collections.emptyList();
  }
  
  public boolean Zp(Zg8y paramZg8y) {
    if (paramZg8y instanceof Zlvj) {
      Zlvj zlvj = (Zlvj)paramZg8y;
      boolean bool = (Objects.equals(zlvj.Zx(), Zx()) && Objects.equals(zlvj.Zh(), Zh()) && Objects.equals(zlvj.ZY(), ZY()) && Objects.equals(zlvj.Zf(), Zf())) ? true : false;
      if (bool)
        return true; 
    } 
    return super.Zp(paramZg8y);
  }
  
  public Ze7 ZA(Zkg3 paramZkg3, Zzmb paramZzmb) {
    return Ze7.Zc(this::lambda$navigate$0).ZY((Zt)Zje.ZR(paramZzmb.Zi()));
  }
  
  public String toString() {
    return ZO();
  }
  
  public String ZO() {
    return Zlvj.ZU(this);
  }
  
  private void lambda$navigate$0(Zjw paramZjw) throws Ztk, InterruptedException {
    paramZjw.ZS().Zh(this.ZE.ZyJ());
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zm35.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */