package burp;

import java.awt.Rectangle;
import java.util.function.Supplier;

public class Zr3u {
  private final Supplier<Zl04> Zl;
  
  private final Zg1w Ze;
  
  public Zr3u(Supplier<Zl04> paramSupplier, Zg1w paramZg1w) {
    this.Zl = paramSupplier;
    this.Ze = paramZg1w;
  }
  
  public Rectangle ZD() {
    Zl04 zl04 = this.Zl.get();
    if (zl04 != null) {
      Rectangle rectangle = zl04.getBounds();
      if (rectangle.x != 0 || rectangle.y != 0 || rectangle.width != 0 || rectangle.height != 0)
        return rectangle; 
    } 
    return this.Ze.Zh();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zr3u.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */