package burp;

import net.portswigger.Zo;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

class Zbzp implements Zgli {
  private final Zbp5 ZS;
  
  private final Zei6 ZJ;
  
  private Zbzp(Zbp5 paramZbp5, Zei6 paramZei6) {
    this.ZS = paramZbp5;
    this.ZJ = paramZei6;
  }
  
  private Zsnu Zn() {
    if (!(this.ZJ.Zy() instanceof Zsnu)) {
      Zuh.Zb(false, Zqf.Zr);
      return null;
    } 
    return (Zsnu)this.ZJ.Zy();
  }
  
  public int Zs() {
    Zsnu zsnu = Zn();
    return (zsnu == null) ? 0 : zsnu.ZH().ZGx();
  }
  
  public byte Zv() {
    Zsnu zsnu = Zn();
    return (zsnu == null) ? 1 : zsnu.ZH().ZGz();
  }
  
  public Zo Zu() {
    Zsnu zsnu = Zn();
    return (zsnu == null) ? new Zo() : zsnu.ZH().ZGP();
  }
  
  public Ze3o Zt() {
    Zsnu zsnu = Zn();
    return (zsnu == null) ? Ze3o.CLIENT_TO_SERVER : (zsnu.ZH().ZGf() ? Ze3o.CLIENT_TO_SERVER : Ze3o.SERVER_TO_CLIENT);
  }
  
  public Zefx ZM() {
    return this.ZS.ZO(Zs());
  }
  
  public String ZIx() {
    Zsnu zsnu = Zn();
    return (zsnu == null) ? "" : zsnu.ZH().ZAs();
  }
  
  public void Zxg(String paramString) {
    Zsnu zsnu = Zn();
    if (zsnu != null)
      zsnu.ZH().ZWK(paramString); 
  }
  
  public byte ZaP() {
    Zsnu zsnu = Zn();
    return (zsnu == null) ? 0 : zsnu.ZH().ZaP();
  }
  
  public void ZB(byte paramByte) {
    Zsnu zsnu = Zn();
    if (zsnu != null)
      zsnu.ZH().ZB(paramByte); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbzp.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */