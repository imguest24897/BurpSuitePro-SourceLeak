package burp;

import java.util.function.Supplier;
import net.portswigger.Zsy;

class Zkuy extends Zkud {
  private final Supplier<Zr81> Zk;
  
  Zkuy(Supplier<Zr81> paramSupplier, Zsy paramZsy) {
    super(paramZsy);
    this.Zk = paramSupplier;
  }
  
  public boolean ZZ(Ze7n paramZe7n) {
    return (paramZe7n.Zy() && super.ZZ(paramZe7n));
  }
  
  protected boolean ZL(Zxaq paramZxaq, String paramString) {
    return true;
  }
  
  protected String ZX(Zmlc paramZmlc) {
    return ((Zr81)this.Zk.get()).ZiZ();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkuy.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */