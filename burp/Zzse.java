package burp;

import java.util.Optional;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zzse extends Zzsb {
  private final Zlas ZO;
  
  private final Ze73 ZY;
  
  private final String ZZ;
  
  private final Zmv7 Zp;
  
  Zzse(Zlas paramZlas, Ze73 paramZe73, String paramString, Zmv7 paramZmv7) {
    this.ZO = paramZlas;
    this.ZY = paramZe73;
    String str = Zslg.ZL();
    this.ZZ = paramString;
    this.Zp = paramZmv7;
    if (Zbqc.Zwu() == null)
      Zslg.ZG("Nk2tb"); 
  }
  
  public Zvb Zv(Ztpx paramZtpx, Zvb paramZvb) {
    Zuh.Zb(paramZvb instanceof Zoz, Zqf.Zr);
    if (paramZvb instanceof Zoz) {
      Zoz zoz = (Zoz)paramZvb;
      ZS(zoz);
      Zb0_ zb0_ = zoz.ZK();
      Zeu9 zeu9 = zb0_.Zl();
      Zm0f zm0f = zb0_.ZQ(this.ZO, paramZtpx);
      boolean bool = this.ZY.<Zm9j>Zc(zm0f.ZI(), Zras.ZM(Zm9l.Zp(zeu9))).Zv();
      if (!bool) {
        this.Zp.Zy(Zrp6.DEBUG, Zlq7.COULD_NOT_REACH_ROOM, new Object[] { this.ZZ, zeu9 });
        return new Zo6();
      } 
      Optional<Zb0_> optional = zb0_.Zc();
      return (Zvb)(optional.isPresent() ? new Zow(optional.get()) : new Zon());
    } 
    return null;
  }
  
  private void ZS(Zoz paramZoz) {
    String str = Zslg.ZL();
    if (paramZoz instanceof Zox) {
      if (paramZoz.ZK().ZC().ZQ()) {
        this.ZO.Zk();
        if (str != null) {
          Zuh.Zb(false, Zqf.Zr);
          return;
        } 
        return;
      } 
    } else {
      return;
    } 
    Zuh.Zb(false, Zqf.Zr);
  }
  
  public String toString() {
    return getClass().getSimpleName();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzse.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */