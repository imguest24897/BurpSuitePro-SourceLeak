package burp;

import java.util.List;
import net.portswigger.Zm2;

public class Ztz6 {
  private final Zbiv ZB;
  
  private final boolean ZM;
  
  public Ztz6(Zbiv paramZbiv, boolean paramBoolean) {
    this.ZB = paramZbiv;
    this.ZM = paramBoolean;
  }
  
  public boolean Ze(Ze3h paramZe3h) {
    if (paramZe3h.ZF())
      return true; 
    if (this.ZM)
      paramZe3h = paramZe3h.Zd().ZL().Zz(); 
    Zm2.Zo(Zze0.TARGET_SITE_MAP_DO_PASSIVE_SCAN);
    this.ZB.Zv().Zg((List)paramZe3h.Zp());
    return true;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztz6.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */