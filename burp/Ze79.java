package burp;

import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Ze79 implements Zvb {
  private final Zszw Zz;
  
  private final Zeu9 ZA;
  
  private final Zrp0 Zq;
  
  private Ze79(Zszw paramZszw, Zeu9 paramZeu9, Zrp0 paramZrp0) {
    this.Zz = paramZszw;
    this.ZA = paramZeu9;
    this.Zq = paramZrp0;
  }
  
  public static Ze79 ZI() {
    return new Ze79(null, null, null);
  }
  
  public static Ze79 Zz(Zszw paramZszw, Zeu9 paramZeu9, Zrp0 paramZrp0) {
    boolean bool = Zx6f.ZH();
    Zuh.Zb((paramZszw != null && paramZeu9 != null && paramZrp0 != null), Zqf.Zv);
    if (Zbqc.Zwu() == null)
      Zx6f.Za(!bool); 
    return new Ze79(paramZszw, paramZeu9, paramZrp0);
  }
  
  public boolean ZX() {
    return (this.Zz == null || this.ZA == null);
  }
  
  public Zszw ZW() {
    return this.Zz;
  }
  
  public Zeu9 Z_() {
    return this.ZA;
  }
  
  public Zrp0 ZL() {
    return this.Zq;
  }
  
  public String toString() {
    return getClass().getSimpleName();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ze79.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */