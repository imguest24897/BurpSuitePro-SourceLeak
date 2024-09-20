package burp;

import burp.api.montoya.persistence.PersistedObject;
import burp.api.montoya.persistence.Persistence;
import burp.api.montoya.persistence.Preferences;

public class Zgfn implements Persistence {
  private final Zeu1 Zd;
  
  private final Zb_9 ZC;
  
  private final Preferences Zy;
  
  private final Zbnt Zf;
  
  private final Zr_4 Zn;
  
  private final Zr_4 Zl;
  
  private final Zey9 Zw;
  
  private final Zslu ZY;
  
  public Zgfn(Zeu1 paramZeu1, Zb_9 paramZb_9, Preferences paramPreferences, Zbnt paramZbnt, Zr_4 paramZr_41, Zr_4 paramZr_42, Zey9 paramZey9, Zslu paramZslu) {
    this.Zd = paramZeu1;
    this.ZC = paramZb_9;
    this.Zy = paramPreferences;
    this.Zf = paramZbnt;
    this.Zn = paramZr_41;
    this.Zl = paramZr_42;
    this.Zw = paramZey9;
    this.ZY = paramZslu;
  }
  
  public PersistedObject extensionData() {
    String str = Zxos.Zb(this.Zd);
    Zsy_ zsy_ = this.ZC.ZI(new Zw_(str));
    if (zsy_ == null) {
      zsy_ = this.Zn.<Zsy_>ZH(new Zkih());
      this.ZC.Zx(this.Zn.Zz(str), zsy_);
    } 
    return new Zkev(zsy_, this.Zf, this.Zn, this.Zl, this.Zw, this.ZY);
  }
  
  public Preferences preferences() {
    return this.Zy;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgfn.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */