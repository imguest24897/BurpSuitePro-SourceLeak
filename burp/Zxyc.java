package burp;

import java.io.IOException;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Zxyc implements Zmp5 {
  private final Zvon Zp;
  
  private final Zsh9 ZB;
  
  private final Zbnt ZU;
  
  private final Zey9 Zf;
  
  public Zxyc(Zvon paramZvon, Zsh9 paramZsh9, Zbnt paramZbnt, Zey9 paramZey9) {
    this.Zp = paramZvon;
    this.ZB = paramZsh9;
    this.ZU = paramZbnt;
    this.Zf = paramZey9;
  }
  
  public void Zd(Zglw paramZglw) {
    try {
      Zt34.ZW(this.Zp, paramZglw, this.ZU, this.ZB, this.Zf);
    } catch (IOException iOException) {
      Zah.Zl(iOException, Zk_.IGNORED);
    } 
  }
  
  public void ZV(Zb0p paramZb0p) {
    try {
      Zl8g.Zs(this.Zp, paramZb0p.Za(), paramZb0p.ZW(), paramZb0p.Zr(), paramZb0p.ZH());
    } catch (IOException iOException) {
      Zah.Zl(iOException, Zk_.IGNORED);
    } 
  }
  
  public void ZE(Zsnv paramZsnv) {
    try {
      Zxsg.Zj(this.Zp, this.ZB, paramZsnv.ZL(), paramZsnv.Zr(), paramZsnv.ZH(), paramZsnv.Zs(), this.ZU, this.Zf);
    } catch (IOException iOException) {
      Zah.Zl(iOException, Zk_.IGNORED);
    } 
  }
  
  public void ZB(Zzj5 paramZzj5) {
    try {
      Zlql.ZL(this.Zp, paramZzj5);
    } catch (IOException iOException) {
      Zah.Zl(iOException, Zk_.IGNORED);
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxyc.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */