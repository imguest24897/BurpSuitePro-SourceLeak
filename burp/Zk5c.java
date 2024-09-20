package burp;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class Zk5c {
  private final Supplier<Zgvn> Zf;
  
  private final Zz_r Zz;
  
  private final List<Zgl9> Zm = new ArrayList<>();
  
  private final Zz1h ZY;
  
  public Zk5c(Supplier<Zgvn> paramSupplier, Zz_r paramZz_r) {
    this(paramSupplier, paramZz_r, Zz1h.ZS);
  }
  
  public Zk5c(Supplier<Zgvn> paramSupplier, Zz_r paramZz_r, Zz1h paramZz1h) {
    this.Zf = paramSupplier;
    this.Zz = paramZz_r;
    this.ZY = paramZz1h;
  }
  
  public void ZJ(Zgl9 paramZgl9) {
    this.Zm.add(paramZgl9);
  }
  
  public Zzg3 Zq(Zzu5 paramZzu5) {
    return new Zzg3(paramZzu5, this.Zf.get(), this.Zm, this.Zz, this.ZY);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zk5c.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */