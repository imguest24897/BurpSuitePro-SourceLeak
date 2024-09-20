package burp;

import java.awt.Component;
import java.awt.Point;
import java.util.function.BooleanSupplier;

public class Zzuk {
  private final Zzyl ZO;
  
  private final BooleanSupplier ZU;
  
  public Zzuk(Zzyl paramZzyl, BooleanSupplier paramBooleanSupplier) {
    this.ZO = paramZzyl;
    this.ZU = paramBooleanSupplier;
  }
  
  void ZP(Component paramComponent, Point paramPoint) {
    Zkj9 zkj9 = new Zkj9();
    zkj9.add(Ztsr.ZY(this.ZO, 393472, this.ZU.getAsBoolean()));
    zkj9.add(Ztsr.ZY(this.ZO, 393728, this.ZU.getAsBoolean()));
    zkj9.add(Ztsr.ZW(this.ZO, 393984));
    zkj9.show(paramComponent, paramPoint.x, paramPoint.y);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzuk.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */