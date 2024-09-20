package burp;

import java.awt.Component;
import java.util.List;

public class Zgqg {
  private final Component Zm;
  
  private final Zbiv Zn;
  
  private final boolean ZU;
  
  public Zgqg(Component paramComponent, Zbiv paramZbiv, boolean paramBoolean) {
    this.Zm = paramComponent;
    this.Zn = paramZbiv;
    this.ZU = paramBoolean;
  }
  
  public boolean Zm(Ze3h paramZe3h) {
    int[] arrayOfInt = Zgxf.ZV();
    if (paramZe3h.ZF())
      return false; 
    if (this.ZU) {
      this.Zn.Za(this.Zm, paramZe3h);
      if (arrayOfInt != null) {
        this.Zn.ZH(this.Zm, (List)paramZe3h.Zp());
        return true;
      } 
      return true;
    } 
    this.Zn.ZH(this.Zm, (List)paramZe3h.Zp());
    return true;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgqg.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */