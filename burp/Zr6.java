package burp;

import java.awt.Window;
import java.util.function.Supplier;

public class Zr6 {
  private final Zs97<?> Zp;
  
  private final Window Zd;
  
  private final Supplier<Zbws> ZF;
  
  public Zr6(Zs97<?> paramZs97, Window paramWindow, Supplier<Zbws> paramSupplier) {
    this.Zp = paramZs97;
    this.Zd = paramWindow;
    this.ZF = paramSupplier;
  }
  
  public Ztqd Zh() {
    return new Ztqd(this.Zp, this.Zd, this.ZF);
  }
  
  public Zsol ZJ() {
    return new Zgtu(ZX(), this.ZF);
  }
  
  public Zeoj Zr() {
    return new Zeoj(this.Zp, this.ZF);
  }
  
  private Zsol ZX() {
    return new Zz3l(this.Zp);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zr6.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */