package burp;

import java.awt.Font;

public class Zdy {
  private final Zgb6 ZZ;
  
  Zdy(Zgb6 paramZgb6) {
    this.ZZ = paramZgb6;
  }
  
  public Font ZU() {
    String str = this.ZZ.Zf8();
    int i = this.ZZ.ZfF();
    return new Font(str, 0, i);
  }
  
  public Font Zb() {
    String str = Zt00.DEFAULT_FONT.ZV().getName();
    int i = this.ZZ.ZfC();
    return new Font(str, 0, i);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zdy.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */