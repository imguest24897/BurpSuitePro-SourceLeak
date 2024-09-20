package burp;

import burp.api.montoya.BurpExtension;
import burp.api.montoya.MontoyaApi;
import net.portswigger.Zah;
import net.portswigger.Zk_;

class Zsqs implements Zr9w {
  private final Zeu1 Zw;
  
  private final IBurpExtender ZI;
  
  private final BurpExtension ZM;
  
  private final Zskh ZL;
  
  Zsqs(Zeu1 paramZeu1, Object paramObject, Zskh paramZskh) {
    this.Zw = paramZeu1;
    String[] arrayOfString = Zeoo.Zj();
    this.ZI = (IBurpExtender)paramObject;
    this.ZM = (BurpExtension)paramObject;
    this.ZL = paramZskh;
    if (arrayOfString != null)
      Zbqc.Zr(new Zbqc[5]); 
  }
  
  public void ZW(IBurpExtenderCallbacks paramIBurpExtenderCallbacks, MontoyaApi paramMontoyaApi) {
    String[] arrayOfString = Zeoo.Zj();
    try {
      this.ZI.registerExtenderCallbacks(paramIBurpExtenderCallbacks);
      this.ZM.initialize(paramMontoyaApi);
    } catch (Throwable throwable) {
      Zah.Zl(throwable, Zk_.IGNORED);
      this.Zw.ZN(throwable, this.ZL);
    } 
    try {
      if (Zbqc.Zwu() == null)
        Zeoo.Za(new String[3]); 
    } catch (Throwable throwable) {
      throw a(null);
    } 
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsqs.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */