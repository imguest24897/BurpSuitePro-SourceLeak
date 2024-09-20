package burp;

import java.util.Collection;
import java.util.Map;
import net.portswigger.browser.Zjq;

public abstract class Zhg extends Zni implements Zgyy {
  @Zzvo(2)
  private final Zeu9 Zd;
  
  @Zzvo(5)
  private final Zzwo<Zszw, Zx0c> Zz;
  
  protected Zhg(Zeu9 paramZeu9, Zzwo<Zszw, Zx0c> paramZzwo) {
    this.Zd = paramZeu9;
    this.Zz = paramZzwo;
  }
  
  public Zt8i Z_(Zeu9 paramZeu9, Zszw paramZszw1, Zszw paramZszw2, Zlru paramZlru, Zzxz paramZzxz, Zt1i paramZt1i, Ztk0 paramZtk0, Zr_4 paramZr_4, Zz1m<Zt35> paramZz1m, Zl7h paramZl7h, Zr69 paramZr69, Zjq paramZjq) {
    String[] arrayOfString = Zr07.ZS();
    if (Zbqc.Zwu() == null)
      Zr07.ZJ(new String[3]); 
    return Zzo7.ZI(paramZeu9, paramZszw1, paramZszw2, paramZlru, paramZzxz, this.Zz, this, paramZt1i, paramZtk0, paramZr_4, paramZz1m, paramZl7h, paramZr69, paramZjq);
  }
  
  public Zeu9 Znq() {
    return this.Zd;
  }
  
  public Map<Zszw, Collection<Zt8i>> Znr() {
    return Zzo7.Zg(this.Zz);
  }
  
  public Collection<Zt8i> Zng() {
    return Zzo7.Zl(this.Zz);
  }
  
  public void Zj(Zszw paramZszw, Zt8i paramZt8i) {
    Zzo7.ZY(paramZszw, paramZt8i, this.Zz);
  }
  
  public boolean Zny() {
    return Zzo7.Zn(this.Zz);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zhg.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */