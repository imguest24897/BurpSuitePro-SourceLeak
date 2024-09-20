package burp;

import burp.api.montoya.MontoyaApi;
import burp.api.montoya.internal.MontoyaObjectFactory;

public class Zlz1 extends Zlz3 {
  private static final ClassLoader Zo = Zlz1.class.getClassLoader();
  
  private volatile Zr9w ZS;
  
  public Zlz1(Zz0n paramZz0n, Zee5 paramZee5, Zskh paramZskh, Zbnt paramZbnt, Ztg4 paramZtg4, Ztwv paramZtwv, Zrn7 paramZrn7, Zxr1 paramZxr1, Zr9w paramZr9w, Zeu1 paramZeu1, Ztx8 paramZtx8) {
    super(paramZz0n, paramZeu1, paramZee5, paramZskh, paramZbnt, paramZtg4, paramZtwv, paramZrn7, paramZxr1, paramZtx8);
    this.ZS = paramZr9w;
  }
  
  protected void Zk(MontoyaObjectFactory paramMontoyaObjectFactory) {
    ZZ(Zo, paramMontoyaObjectFactory);
  }
  
  public void ZH(IBurpExtenderCallbacks paramIBurpExtenderCallbacks, MontoyaApi paramMontoyaApi) {
    this.ZS.ZW(paramIBurpExtenderCallbacks, paramMontoyaApi);
  }
  
  protected void ZM() {
    this.ZS = null;
  }
  
  public void ZZ() {}
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlz1.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */