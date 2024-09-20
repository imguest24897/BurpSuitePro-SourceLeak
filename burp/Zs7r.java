package burp;

import java.awt.Component;
import java.awt.Point;
import java.awt.event.MouseEvent;
import net.portswigger.Zm2;

public class Zs7r implements Zky2 {
  private final Zbws ZT;
  
  private final Zgkx Ze;
  
  private final Zlns Zd;
  
  private final int Zu;
  
  public Zs7r(Zbws paramZbws, Zgkx paramZgkx, Zlns paramZlns, int paramInt) {
    this.ZT = paramZbws;
    this.Ze = paramZgkx;
    this.Zd = paramZlns;
    this.Zu = paramInt;
  }
  
  public void ZV(MouseEvent paramMouseEvent, Component paramComponent, Point paramPoint) {
    (new Zkj7(this.ZT, this.Ze, paramPoint)).show(this.ZT, paramPoint.x, paramPoint.y);
  }
  
  public void Zv(MouseEvent paramMouseEvent, int paramInt1, int paramInt2) {
    if (paramInt2 == this.Zu) {
      Zm2.ZC(Zrrh.MESSAGE_INSPECTOR_DETAILS);
      this.Ze.ZD(paramInt1);
    } 
  }
  
  public void ZR(MouseEvent paramMouseEvent, int paramInt1, int paramInt2) {
    if (!this.Ze.Zm(this.Zd.Zb(paramInt2))) {
      Zm2.ZC(Zrrh.MESSAGE_INSPECTOR_DETAILS);
      this.Ze.ZD(paramInt1);
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zs7r.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */