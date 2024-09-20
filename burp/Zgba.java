package burp;

import java.util.ArrayList;
import java.util.List;

public class Zgba {
  private final String Za;
  
  private final List<Zgba> ZN;
  
  private Zlwx Zs;
  
  public Zgba() {
    this("");
  }
  
  public Zgba(String paramString) {
    this.Za = paramString;
    this.ZN = new ArrayList<>();
  }
  
  public boolean ZT() {
    return (this.Zs != null);
  }
  
  public String Zf() {
    return this.Za;
  }
  
  public List<Zgba> Zi() {
    return this.ZN;
  }
  
  public Zlwx Zj() {
    return this.Zs;
  }
  
  public boolean Zp(String paramString) {
    return (ZX(paramString) != null);
  }
  
  public Zgba ZX(String paramString) {
    String[] arrayOfString = Zzkm.Zq();
    for (Zgba zgba : this.ZN) {
      if (zgba.Za.equals(paramString))
        return zgba; 
      if (arrayOfString != null)
        break; 
    } 
    return null;
  }
  
  public void ZV(Zgba paramZgba) {
    this.ZN.add(paramZgba);
  }
  
  public void ZR(Zlwx paramZlwx) {
    this.Zs = paramZlwx;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgba.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */