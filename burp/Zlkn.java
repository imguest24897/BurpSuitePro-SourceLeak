package burp;

import java.io.IOException;
import java.io.Writer;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Zlkn implements Zmp5 {
  private final Writer Zy;
  
  private final Zsh9 ZU;
  
  private final Zey9 Zr;
  
  public Zlkn(Writer paramWriter, Zsh9 paramZsh9, Zey9 paramZey9) {
    this.Zy = paramWriter;
    this.ZU = paramZsh9;
    this.Zr = paramZey9;
  }
  
  public void Zd(Zglw paramZglw) {
    try {
      Zt34.ZL(this.Zy, paramZglw, this.ZU, this.Zr);
    } catch (IOException iOException) {
      Zah.Zl(iOException, Zk_.IGNORED);
    } 
  }
  
  public void ZV(Zb0p paramZb0p) {
    try {
      Zl8g.ZI(this.Zy, paramZb0p);
    } catch (IOException iOException) {
      Zah.Zl(iOException, Zk_.IGNORED);
    } 
  }
  
  public void ZE(Zsnv paramZsnv) {
    try {
      Zxsg.ZG(this.Zy, this.ZU, this.Zr, paramZsnv);
    } catch (IOException iOException) {
      Zah.Zl(iOException, Zk_.IGNORED);
    } 
  }
  
  public void ZB(Zzj5 paramZzj5) {
    try {
      Zlql.Zb(this.Zy, this.ZU, paramZzj5);
    } catch (IOException iOException) {
      Zah.Zl(iOException, Zk_.IGNORED);
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlkn.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */