package burp;

import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Ztih implements Ztro {
  private final String Zf;
  
  private final String ZY;
  
  private final byte[] Zz;
  
  Ztih(String paramString1, String paramString2) {
    this.Zf = paramString1;
    this.ZY = paramString2;
    int[] arrayOfInt = Zmh4.Zd();
    this.Zz = Zgyo.ZJ("/" + paramString2);
    if (Zbqc.Zwu() == null)
      Zmh4.ZB(new int[2]); 
  }
  
  public String ZO() {
    return this.Zf;
  }
  
  public byte[] ZY() {
    Zuh.ZT((this.Zz != null), Zqf.Zx, this.ZY);
    return this.Zz;
  }
  
  public String ZJ() {
    return this.ZY;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztih.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */