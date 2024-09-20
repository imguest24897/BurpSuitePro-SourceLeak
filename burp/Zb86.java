package burp;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Zb86 {
  private final Zt28 ZI;
  
  private final Zkcx Za;
  
  private final List<Zzbd> Zl;
  
  public Zb86(Zgb6 paramZgb6) {
    this.ZI = new Zt28(paramZgb6);
    int[] arrayOfInt = Zrri.ZR();
    this.Za = new Zkcx(paramZgb6);
    this.Zl = new CopyOnWriteArrayList<>();
    if (arrayOfInt == null)
      Zbqc.Zr(new Zbqc[5]); 
  }
  
  public Zt28 Zc() {
    return this.ZI;
  }
  
  public Zkcx Zq() {
    return this.Za;
  }
  
  public void Zx(Zzbd paramZzbd) {
    this.Zl.add(paramZzbd);
  }
  
  public void Zd(Zzbd paramZzbd) {
    this.Zl.remove(paramZzbd);
  }
  
  public void Zl() {
    this.Zl.forEach(Zzbd::Zx);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zb86.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */