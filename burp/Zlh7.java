package burp;

import net.portswigger.Zlb;
import net.portswigger.Zvi;

class Zlh7 extends Zlhh {
  private final String Zr;
  
  private Zlh7(Zmt2 paramZmt2, String paramString) {
    super(paramZmt2);
    this.Zr = paramString;
  }
  
  protected String Zt() {
    return this.Zr;
  }
  
  protected Zlb Zk(Zvi paramZvi) {
    return paramZvi.Zg(this.Zr);
  }
  
  protected void ZI() {}
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlh7.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */