package burp;

import burp.api.montoya.MontoyaApi;
import net.portswigger.Zah;
import net.portswigger.Zk_;

class Zt9h implements Zr9w {
  private final Zeu1 Ze;
  
  private final IBurpExtender ZX;
  
  private final Zskh ZB;
  
  Zt9h(Zeu1 paramZeu1, IBurpExtender paramIBurpExtender, Zskh paramZskh) {
    this.Ze = paramZeu1;
    this.ZX = paramIBurpExtender;
    this.ZB = paramZskh;
  }
  
  public void ZW(IBurpExtenderCallbacks paramIBurpExtenderCallbacks, MontoyaApi paramMontoyaApi) {
    try {
      this.ZX.registerExtenderCallbacks(paramIBurpExtenderCallbacks);
    } catch (Throwable throwable) {
      Zah.Zl(throwable, Zk_.IGNORED);
      this.Ze.ZN(throwable, this.ZB);
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zt9h.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */