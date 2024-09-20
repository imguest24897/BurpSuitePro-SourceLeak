package burp;

import java.util.ArrayList;
import java.util.List;

public class Zlhp implements Zktb {
  private final List<Zktb> ZK = new ArrayList<>();
  
  public void Zs(Zktb paramZktb) {
    this.ZK.add(paramZktb);
  }
  
  public void Zi(Zktb paramZktb) {
    this.ZK.remove(paramZktb);
  }
  
  public void ZI() {
    this.ZK.clear();
  }
  
  public void ZH() {
    this.ZK.forEach(Zktb::ZH);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlhp.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */