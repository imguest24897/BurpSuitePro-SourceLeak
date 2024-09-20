package burp;

import java.util.List;
import net.portswigger.Zm2;

public class Zxnz {
  private final Zbiv Zb;
  
  private final boolean ZT;
  
  public Zxnz(Zbiv paramZbiv, boolean paramBoolean) {
    this.Zb = paramZbiv;
    this.ZT = paramBoolean;
  }
  
  public boolean ZU(Ze3h paramZe3h) {
    if (paramZe3h.ZF())
      return true; 
    if (this.ZT)
      paramZe3h = paramZe3h.Zd().ZL().Zz(); 
    Zm2.Zo(Zze0.TARGET_SITE_MAP_DO_ACTIVE_SCAN);
    this.Zb.Zv().ZO((List)paramZe3h.Zp());
    return true;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxnz.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */