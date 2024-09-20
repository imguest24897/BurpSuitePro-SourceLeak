package burp;

import burp.api.montoya.MontoyaApi;
import burp.api.montoya.internal.MontoyaObjectFactory;
import java.io.File;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Zlzu extends Zlz3 {
  private Zt05 Zr;
  
  private final File Za;
  
  private volatile Zr9w ZP;
  
  public Zlzu(Zz0n paramZz0n, Zee5 paramZee5, Zskh paramZskh, Zbnt paramZbnt, Ztg4 paramZtg4, Ztwv paramZtwv, Zrn7 paramZrn7, Zxr1 paramZxr1, Zr9w paramZr9w, Zt05 paramZt05, Zeu1 paramZeu1, Ztx8 paramZtx8, File paramFile) {
    super(paramZz0n, paramZeu1, paramZee5, paramZskh, paramZbnt, paramZtg4, paramZtwv, paramZrn7, paramZxr1, paramZtx8);
    this.ZP = paramZr9w;
    int[] arrayOfInt = Zt05.ZC();
    this.Zr = paramZt05;
    this.Za = paramFile;
    if (arrayOfInt == null)
      Zbqc.Zr(new Zbqc[1]); 
  }
  
  protected void Zk(MontoyaObjectFactory paramMontoyaObjectFactory) {
    ZZ(this.Zr, paramMontoyaObjectFactory);
  }
  
  public void ZH(IBurpExtenderCallbacks paramIBurpExtenderCallbacks, MontoyaApi paramMontoyaApi) {
    this.ZP.ZW(paramIBurpExtenderCallbacks, paramMontoyaApi);
  }
  
  protected void ZM() {
    this.ZP = null;
  }
  
  public void ZZ() {
    if (this.Zr != null) {
      try {
        this.Zr.close();
      } catch (Throwable throwable) {
        Zah.Zl(throwable, Zk_.UNEXPECTED);
      } 
      this.Zr = null;
    } 
    try {
      if (this.Za != null)
        this.Za.delete(); 
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlzu.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */