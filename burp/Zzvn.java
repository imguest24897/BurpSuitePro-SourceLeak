package burp;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public final class Zzvn extends Zzvx {
  private final Zmsh ZA;
  
  private Ztk8 ZP;
  
  public Zzvn(Zsvm paramZsvm, Zmsh paramZmsh) {
    super(paramZsvm, paramZmsh);
    this.ZA = paramZmsh;
    this.ZP = Ztk8.Zy(new Zgq<>());
  }
  
  public void Zf(Zx_5 paramZx_5) {
    this.ZP.ZN().Zu(paramZx_5);
  }
  
  public Ze3n ZX() {
    return this.ZA.Zx();
  }
  
  public Zx_5 Zf(Ztz1 paramZtz1, Map<Long, String> paramMap, List<Zlfv<? extends Zgkc>> paramList) {
    return new Zx_5(paramZtz1.Zt(), paramZtz1.Zf(), paramZtz1.Zz(), paramMap, paramList, paramZtz1.Zg(), paramZtz1.ZO(), ZX().Za(), ZX().ZN().getBytes(), null);
  }
  
  public Zzvx Zr() {
    Zzvn zzvn = new Zzvn(Zx(), this.ZA);
    Objects.requireNonNull(zzvn);
    Zf().forEach(zzvn::ZI);
    zzvn.Zn().putAll(Zn());
    zzvn.ZT().putAll(ZT());
    zzvn.Zo(ZH());
    zzvn.ZP = this.ZP;
    zzvn.Zt(zzvn.Zw());
    return zzvn;
  }
  
  public Zbnr ZU() {
    return this.ZA;
  }
  
  public Ztk8 ZQ() {
    return this.ZP;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzvn.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */