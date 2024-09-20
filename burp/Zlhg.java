package burp;

import java.net.Authenticator;

public class Zlhg implements Zgn3 {
  private final Zgb6 Zm;
  
  public Zlhg(Zgb6 paramZgb6) {
    this.Zm = paramZgb6;
  }
  
  public void ZLc() {
    Zrxd zrxd;
    Zz7o zz7o = new Zz7o();
    if (this.Zm.ZfU()) {
      String str = this.Zm.Zf5();
      if (!str.isEmpty()) {
        char[] arrayOfChar = this.Zm.ZfL().toCharArray();
        zrxd = new Zrxd(this, str, arrayOfChar);
      } 
    } 
    Authenticator.setDefault(zrxd);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlhg.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */