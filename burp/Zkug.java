package burp;

import java.util.function.Supplier;
import net.portswigger.Zsy;

class Zkug extends Zkud {
  private final Supplier<Zr81> Zk;
  
  Zkug(Supplier<Zr81> paramSupplier, Zsy paramZsy) {
    super(paramZsy);
    this.Zk = paramSupplier;
  }
  
  protected boolean ZL(Zxaq paramZxaq, String paramString) {
    return true;
  }
  
  protected String ZX(Zmlc paramZmlc) {
    return ((Zr81)this.Zk.get()).ZiF();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkug.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */