package burp;

import java.awt.Component;
import java.util.Objects;
import net.portswigger.Zoq;

public class Zmog implements Zkuk {
  private final Zbv6 Zg;
  
  private final Zoq<? extends Zbhh> ZQ;
  
  private final Zbhg ZC;
  
  public Zmog(Zbv6 paramZbv6, Zlfb paramZlfb, Zoq<? extends Zbhh> paramZoq) {
    this.Zg = paramZbv6;
    this.ZQ = paramZoq;
    Objects.requireNonNull(paramZlfb);
    Objects.requireNonNull(paramZlfb);
    this.ZC = new Zbhg(paramZbv6, paramZoq, paramZlfb::ZE, paramZlfb::ZF);
  }
  
  public Component Zg() {
    return this.Zg.ZB();
  }
  
  public void ZL(boolean paramBoolean) {
    this.Zg.ZF(paramBoolean);
    this.ZC.Zt(paramBoolean);
  }
  
  public final void Zb() {
    this.Zg.Zb();
    this.ZQ.ZV(Zbhh::ZD);
  }
  
  public final void Zs() {
    this.Zg.Zs();
    this.ZQ.ZV(Zbhh::ZI);
  }
  
  public final void Zm() {
    this.Zg.Zm();
    this.ZQ.ZV(Zbhh::Ze);
  }
  
  public final void Zj() {
    this.Zg.Zj();
  }
  
  public void Zf() {
    this.ZC.Ze();
  }
  
  public void ZA() {
    this.ZC.Zd();
  }
  
  public final void ZB(String paramString1, String paramString2) {
    this.Zg.Zj(paramString1, paramString2);
    this.ZQ.ZV(paramString1::lambda$setTaskName$0);
  }
  
  public final Zbhg Zd() {
    return this.ZC;
  }
  
  private static void lambda$setTaskName$0(String paramString, Zbhh paramZbhh) {
    paramZbhh.ZO(paramString);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmog.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */