package burp;

import java.util.function.Supplier;
import net.portswigger.Zm2;

class Zgtu implements Zsol {
  private final Zsol ZT;
  
  private final Supplier<Zbws> ZJ;
  
  Zgtu(Zsol paramZsol, Supplier<Zbws> paramSupplier) {
    this.ZT = paramZsol;
    this.ZJ = paramSupplier;
  }
  
  public void Zc(String paramString1, String paramString2) {
    this.ZT.Zc(paramString1, paramString2);
    Zm2.ZB(Zec3.CUSTOM_COLUMN_CREATED, ((Zbws)this.ZJ.get()).getName());
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgtu.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */