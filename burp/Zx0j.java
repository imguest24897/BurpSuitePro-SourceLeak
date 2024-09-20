package burp;

import java.util.ArrayList;
import java.util.Iterator;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Zx0j {
  private final Zls2 Zu;
  
  private Zes3 ZG;
  
  private Zgxx ZE;
  
  public Zx0j(Zls2 paramZls2) {
    this.Zu = paramZls2;
  }
  
  public void Zn(Zb3n paramZb3n) {
    ArrayList<Zes3> arrayList = new ArrayList();
    Iterator<Zgfi> iterator = paramZb3n.Zl().iterator();
    int i = Zlup.ZT();
    while (iterator.hasNext()) {
      Zgfi zgfi = iterator.next();
      try {
        Zmzp zmzp = new Zmzp(zgfi, this.Zu);
        Zes3 zes3 = this.Zu.ZQ().ZC(zmzp.ZC());
        arrayList.add(zes3);
      } catch (Zgxx zgxx) {
        Zah.Zl(zgxx, Zk_.IGNORED);
        this.ZE = zgxx;
      } 
      if (i == 0) {
        Zbqc.Zr(new Zbqc[3]);
        break;
      } 
    } 
    this.ZG = this.Zu.ZL().Zh(arrayList);
    this.Zu.ZA().ZY(this.ZG);
  }
  
  public Zes3 ZN() {
    return this.ZG;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zx0j.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */