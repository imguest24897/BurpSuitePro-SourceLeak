package burp;

import java.net.MalformedURLException;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zqf;
import net.portswigger.Zuh;
import net.portswigger.browser.Zcv;
import net.portswigger.browser.Zdb;
import net.portswigger.browser.Zjq;

public class Zmfc<HTML> {
  private final Zski Zs;
  
  private final Zk8m ZS;
  
  private final String ZZ;
  
  private final Zcv ZG;
  
  private final HTML Za;
  
  private final Zjq ZM;
  
  private Zmfc(Zski paramZski, Zk8m paramZk8m, String paramString, Zcv paramZcv, HTML paramHTML, Zjq paramZjq) {
    this.Zs = paramZski;
    this.ZS = paramZk8m;
    this.ZZ = paramString;
    this.ZG = paramZcv;
    this.Za = paramHTML;
    this.ZM = paramZjq;
  }
  
  public static Zmfc<?> Za(Zski paramZski) {
    return Zw(paramZski, Ztiy.ZU().ZQ((short)0).Zg((short)0).ZI(), null, null, null, null);
  }
  
  public static Zmfc<Zdb> Zk(Zski paramZski, Zdb paramZdb, Zcv paramZcv, Zjq paramZjq, Zbnt paramZbnt) {
    Zski zski = paramZski;
    try {
      if (paramZdb.Zr().isPresent()) {
        Zlit zlit = Zmg3.ZU(paramZdb.Zr().get(), paramZbnt, new Zruo());
        zski = Zski.ZO(zlit, paramZdb.ZX().orElse(null));
      } 
    } catch (MalformedURLException|Zxg5|Zxgy malformedURLException) {
      Zah.Zl(malformedURLException, Zk_.COMMON_RUNTIME_FAILURE);
    } 
    short s = Zt1t.Zv(paramZdb.ZS().orElse(null));
    Zk8m zk8m = Ztiy.ZU().ZQ(s).Zg(s).ZI();
    String str = paramZdb.Zo().orElse(null);
    return Zw(zski, zk8m, str, paramZcv, paramZdb, paramZjq);
  }
  
  public static <HTML> Zmfc<HTML> Zw(Zski paramZski, Zk8m paramZk8m, String paramString, Zcv paramZcv, HTML paramHTML, Zjq paramZjq) {
    Zuh.Zb((paramZk8m != null), Zqf.Zv);
    return new Zmfc<>(paramZski, paramZk8m, paramString, paramZcv, paramHTML, paramZjq);
  }
  
  public Zlit Zw() {
    return (this.Zs == null) ? null : this.Zs.ZyR();
  }
  
  public Zski Zb() {
    return this.Zs;
  }
  
  public Zk8m Ze() {
    return this.ZS;
  }
  
  public String ZL() {
    return this.ZZ;
  }
  
  public Zcv Zx() {
    return this.ZG;
  }
  
  public HTML ZY() {
    return this.Za;
  }
  
  public Zjq ZA() {
    return this.ZM;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmfc.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */