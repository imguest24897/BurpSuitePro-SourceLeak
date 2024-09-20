package burp;

import java.util.function.Supplier;

public class Zt09 implements Zl5n {
  private final Ze3n Zg;
  
  private final Supplier<Integer> ZW;
  
  public Zt09(Ze3n paramZe3n, Supplier<Integer> paramSupplier) {
    this.Zg = paramZe3n;
    this.ZW = paramSupplier;
  }
  
  public Ztk8 Z_() {
    Zgq<Zgpi> zgq = new Zgq<>();
    (new Zlsn(this.Zg)).Zd(((Integer)this.ZW.get()).intValue(), (Zgq)zgq);
    return Ztk8.Zy((Zgq)zgq);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zt09.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */