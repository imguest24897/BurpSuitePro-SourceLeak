package burp;

import java.util.Iterator;
import net.portswigger.Zm2;

public class Zxs3 {
  private final Zgxf Zi;
  
  private final Zmiw Zu;
  
  private final Zbws ZS;
  
  private final int Zf;
  
  public Zxs3(Zgxf paramZgxf, Zmiw paramZmiw, Zbws paramZbws, int paramInt) {
    this.Zi = paramZgxf;
    this.Zu = paramZmiw;
    this.ZS = paramZbws;
    this.Zf = paramInt;
  }
  
  public boolean Zi(Ze3h paramZe3h) {
    Zm2.Zi(Zv8r.TARGET_SITE_MAP_HIGHLIGHT, this.Zf);
    Zlxk.ZS = this.Zf;
    Iterator<Zz_1> iterator = paramZe3h.iterator();
    int[] arrayOfInt = Zgxf.ZV();
    while (iterator.hasNext()) {
      Zz_1 zz_1 = iterator.next();
      if (zz_1 == null)
        continue; 
      ((Zxya)zz_1.Z_()).ZB((byte)Zlxk.ZS);
      int i = this.Zu.Zj(zz_1);
      if (i >= 0)
        this.ZS.getSelectionModel().removeSelectionInterval(i, i); 
      this.Zi.Zc(zz_1);
      if (arrayOfInt != null)
        break; 
    } 
    return true;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxs3.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */