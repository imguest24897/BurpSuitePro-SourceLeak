package burp;

import java.util.ArrayList;
import java.util.List;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zrhz implements Zrkn {
  private final List<Zer0> Zc;
  
  private final List<Zlp9> ZL;
  
  private Zer0 ZU;
  
  private Zer0 ZM;
  
  private Zer0 ZP;
  
  public Zrhz(List<Zer0> paramList, List<Zlp9> paramList1) {
    this.Zc = paramList;
    this.ZL = paramList1;
  }
  
  public List<Zer0> ZJ() {
    boolean bool = Zkoa.ZP();
    for (Zer0 zer0 : this.Zc) {
      if (zer0.ZO() != 1)
        continue; 
      zer0.ZQ(this);
      if (!bool)
        break; 
    } 
    return ZN();
  }
  
  public void ZJ(Zxyr paramZxyr) {
    Ztt6 ztt6 = (new Zrh3(paramZxyr.Zi())).Zd();
    if (ztt6 == null) {
      Zuh.Zb(false, Zqf.Zk);
      return;
    } 
    if (!Zlp9.Za(this.ZL, ztt6.ZN()))
      return; 
    if (ztt6.ZN() != Zlp9.NON_SCHEMA_URL_PAYLOAD || this.ZM == null)
      this.ZM = paramZxyr; 
  }
  
  public void ZK(Zxyt paramZxyt) {
    Ztt6 ztt6 = (new Zrh3(paramZxyt.Zi())).Zd();
    if (ztt6 == null) {
      Zuh.Zb(false, Zqf.Zk);
      return;
    } 
    if (!Zlp9.Za(this.ZL, ztt6.ZN()))
      return; 
    if (this.ZU == null || Zu(paramZxyt))
      this.ZU = paramZxyt; 
  }
  
  public void ZR(Zxyy paramZxyy) {
    Ztt6 ztt6 = (new Zrh3(paramZxyy.Zi())).Zd();
    if (ztt6 == null) {
      Zuh.Zb(false, Zqf.Zk);
      return;
    } 
    if (!Zlp9.Za(this.ZL, ztt6.ZN()))
      return; 
    if (this.ZP == null)
      this.ZP = paramZxyy; 
  }
  
  private boolean Zu(Zxyt paramZxyt) {
    return (paramZxyt.ZA() != this.ZU.ZA() && paramZxyt.ZA() == Zb25.HTTP);
  }
  
  private List<Zer0> ZN() {
    ArrayList<Zer0> arrayList = new ArrayList();
    if (this.ZM != null)
      arrayList.add(this.ZM); 
    if (this.ZU != null)
      arrayList.add(this.ZU); 
    if (this.ZP != null)
      arrayList.add(this.ZP); 
    return arrayList;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrhz.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */