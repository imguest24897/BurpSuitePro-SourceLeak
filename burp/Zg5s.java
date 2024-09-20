package burp;

import java.util.zip.CRC32;
import net.portswigger.Zkb;

public class Zg5s implements Zthm {
  private final String ZT;
  
  private final Zlug ZC;
  
  private String ZN;
  
  public Zg5s(String paramString, Zlug paramZlug) {
    this.ZT = paramString;
    this.ZC = paramZlug;
  }
  
  public String Z_() {
    return this.ZT;
  }
  
  public void ZB(String paramString) {
    if (this.ZN == null)
      this.ZN = paramString; 
  }
  
  public boolean ZB() {
    return (this.ZN != null);
  }
  
  public void Zv(Zt82 paramZt82) {
    if (ZB())
      paramZt82.Ze(this.ZC, Zs()); 
  }
  
  public Zlug ZQ() {
    return this.ZC;
  }
  
  void Zw(String paramString) {
    this.ZN = paramString;
  }
  
  int Zs() {
    if (this.ZN == null)
      return 0; 
    CRC32 cRC32 = new CRC32();
    cRC32.update(Zkb.Zy(this.ZN.trim()));
    return (int)cRC32.getValue();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zg5s.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */