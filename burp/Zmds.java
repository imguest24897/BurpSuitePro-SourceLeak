package burp;

import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zmds implements Ztro {
  private final String Zd;
  
  private final String Zw;
  
  Zmds(String paramString1, String paramString2) {
    this.Zd = paramString1;
    this.Zw = paramString2;
  }
  
  public String ZO() {
    return this.Zd;
  }
  
  public byte[] ZY() {
    int[] arrayOfInt = Zmh4.Zd();
    byte[] arrayOfByte = Zgyo.ZJ("/" + this.Zw);
    Zuh.ZT((arrayOfByte != null), Zqf.Zx, this.Zw);
    if (arrayOfInt == null)
      Zbqc.Zr(new Zbqc[1]); 
    return arrayOfByte;
  }
  
  public String ZJ() {
    return this.Zw;
  }
  
  public String toString() {
    return this.Zd;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmds.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */