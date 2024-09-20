package burp;

import java.util.HashMap;
import java.util.Map;

public class Ze7m implements Ztno {
  private final Map<Zmga, Zeut> Zm = new HashMap<>();
  
  public void Zc(Zmzk paramZmzk, Zbii paramZbii, Zeut paramZeut) {
    boolean bool = Zeut.ZZ();
    synchronized (this.Zm) {
      this.Zm.put(new Zmga(paramZmzk, paramZbii), paramZeut);
    } 
    if (Zbqc.Zwu() == null)
      Zeut.ZC(!bool); 
  }
  
  public Zeut ZR(Zmzk paramZmzk, Zbii paramZbii) {
    synchronized (this.Zm) {
      return this.Zm.get(new Zmga(paramZmzk, paramZbii));
    } 
  }
  
  public void ZK(Zmzk paramZmzk, Zbii paramZbii) {
    synchronized (this.Zm) {
      this.Zm.remove(new Zmga(paramZmzk, paramZbii));
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ze7m.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */