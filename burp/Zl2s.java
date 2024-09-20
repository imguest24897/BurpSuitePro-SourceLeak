package burp;

import java.util.Optional;
import java.util.function.Supplier;

class Zl2s implements Zx_v {
  private final int ZE;
  
  private final Supplier<Integer> Zn;
  
  private final Zs_f ZS;
  
  private final Zsh8 Zm;
  
  Zl2s(int paramInt, Supplier<Integer> paramSupplier, Zs_f paramZs_f, Zsh8 paramZsh8) {
    this.ZE = paramInt;
    this.Zn = paramSupplier;
    this.ZS = paramZs_f;
    this.Zm = paramZsh8;
  }
  
  public Optional<String> Zs(boolean paramBoolean) {
    String str = Zb4.Zd(this.ZE, ((Integer)this.Zn.get()).intValue());
    return this.ZS.Zi(new Zlwu(paramBoolean, str));
  }
  
  public void Zl() {
    if (this.Zm.ZPS())
      this.ZS.Zq(); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zl2s.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */