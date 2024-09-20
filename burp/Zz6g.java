package burp;

import burp.api.montoya.BurpExtension;
import burp.api.montoya.MontoyaApi;
import net.portswigger.Zah;
import net.portswigger.Zk_;

class Zz6g implements Zr9w {
  private final Zeu1 ZI;
  
  private final BurpExtension ZT;
  
  private final Zskh Za;
  
  Zz6g(Zeu1 paramZeu1, BurpExtension paramBurpExtension, Zskh paramZskh) {
    this.ZI = paramZeu1;
    this.ZT = paramBurpExtension;
    this.Za = paramZskh;
  }
  
  public void ZW(IBurpExtenderCallbacks paramIBurpExtenderCallbacks, MontoyaApi paramMontoyaApi) {
    try {
      this.ZT.initialize(paramMontoyaApi);
    } catch (Throwable throwable) {
      Zah.Zl(throwable, Zk_.IGNORED);
      this.ZI.ZN(throwable, this.Za);
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zz6g.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */