package burp;

import java.net.MalformedURLException;
import java.util.Optional;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Ztb9 {
  private final Zlaa ZJ;
  
  private final Zgb6 ZG;
  
  private final Zskh Ze;
  
  private final Zlcb Z_;
  
  private final Zz28 Za;
  
  private final Zkl6 ZA;
  
  public Ztb9(Zlaa paramZlaa, Zgb6 paramZgb6, Zskh paramZskh, Zlcb paramZlcb, Zz28 paramZz28, Zkl6 paramZkl6) {
    this.ZJ = paramZlaa;
    this.ZG = paramZgb6;
    this.Ze = paramZskh;
    this.Z_ = paramZlcb;
    this.Za = paramZz28;
    this.ZA = paramZkl6;
  }
  
  public Zejt ZZ(Zlit paramZlit) {
    Zl11 zl11 = this.ZJ.Ze(this.Ze, this.Z_.ZW(Zeew.SCANNER), this.Za);
    Zts5 zts5 = Zs38.ZG(this.ZG).Zy();
    Zlbx zlbx = new Zlbx(this.Ze);
    Zstu zstu = this.ZA.Zs().ZO().Zf(paramZlit).Zj(Zsss.GET).Zr();
    Zefx zefx = this.ZA.ZH().Zu(paramZlit.Zdz(), zstu);
    return Ztt_.ZO(zl11.ZG(zefx, zts5, zlbx));
  }
  
  public Optional<Zlit> Za(String paramString) {
    try {
      return Optional.of(Zmg3.ZU(paramString, this.ZA.ZB(), new Zruo()));
    } catch (MalformedURLException|Zxg5|Zxgy malformedURLException) {
      Zah.Zl(malformedURLException, Zk_.USER_ERROR);
      return Optional.empty();
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztb9.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */