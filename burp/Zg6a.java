package burp;

import net.portswigger.Zm2;

public class Zg6a {
  private final Zgxf Zt;
  
  private final Ztdi ZS;
  
  private final Zbnt ZJ;
  
  private final Zb0h Zu;
  
  private final Zgb6 ZL;
  
  public Zg6a(Zgxf paramZgxf, Ztdi paramZtdi, Zb0h paramZb0h, Zbnt paramZbnt, Zgb6 paramZgb6) {
    this.Zt = paramZgxf;
    this.ZS = paramZtdi;
    this.ZJ = paramZbnt;
    this.Zu = paramZb0h;
    this.ZL = paramZgb6;
  }
  
  public boolean Zl(Ze3h paramZe3h) {
    Zm2.ZC(Zrrh.TARGET_SITE_MAP_COPY_LINKS);
    paramZe3h.Zd().ZL().Zh(Zz_1::Zi);
    this.Zt.Zh(Zg6a.class.getSimpleName(), paramZe3h, new Zt7h(this));
    return true;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zg6a.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */