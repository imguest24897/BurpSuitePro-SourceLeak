package burp;

import java.awt.Point;

public class Zejy {
  private final Zbws ZE;
  
  private final Ztn7 Zv;
  
  public Zejy(Zbws paramZbws, Ztn7 paramZtn7) {
    this.ZE = paramZbws;
    this.Zv = paramZtn7;
    paramZbws.ZL(paramZtn7);
  }
  
  public void ZY(Zl1c paramZl1c) {
    this.Zv.Zu(paramZl1c);
  }
  
  public Zl1c Zs() {
    int i = this.ZE.getSelectedRow();
    if (i == -1)
      return null; 
    int j = this.ZE.convertRowIndexToModel(i);
    return this.Zv.ZV(j);
  }
  
  public void ZV(String paramString) {
    this.Zv.Zi(paramString);
  }
  
  public Zl1c ZD(Point paramPoint) {
    int i = this.ZE.rowAtPoint(paramPoint);
    if (i == -1)
      return null; 
    int j = this.ZE.convertRowIndexToModel(i);
    return this.Zv.ZV(j);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zejy.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */