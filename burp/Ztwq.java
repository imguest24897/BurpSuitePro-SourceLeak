package burp;

import java.util.ArrayList;
import java.util.List;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Ztwq {
  private final List<Zlug> Zu = new ArrayList<>();
  
  private final Zstu ZF;
  
  private final Zstu Zy;
  
  private final Zbnt Zt;
  
  private boolean ZY;
  
  public Ztwq(Zstu paramZstu1, Zstu paramZstu2, Zbnt paramZbnt) {
    this.ZF = paramZstu1;
    this.Zy = paramZstu2;
    this.Zt = paramZbnt;
  }
  
  void Zh(Zlug paramZlug, boolean paramBoolean) {
    this.Zu.add(paramZlug);
    this.ZY |= paramBoolean;
  }
  
  public Zkvd ZL() {
    Zuh.Zb(!this.Zu.isEmpty(), Zqf.Zr);
    Zglh zglh = new Zglh(this.Zt, this.ZF, this.Zy, this.Zu);
    return new Zkvd(zglh.ZC(), zglh.Zo(), this.ZY);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztwq.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */