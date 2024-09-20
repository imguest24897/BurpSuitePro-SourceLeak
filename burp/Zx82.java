package burp;

import java.util.List;
import net.portswigger.Zkb;

public class Zx82 {
  private final String ZI;
  
  private final String Zj;
  
  private final Zl5e ZH;
  
  private final List<Zlou> Zc;
  
  public Zx82(Zl5e paramZl5e, String paramString1, String paramString2, List<Zlou> paramList) {
    this.ZH = paramZl5e;
    this.ZI = paramString1;
    this.Zj = paramString2;
    Zbqc[] arrayOfZbqc = Zes5.Zy();
    this.Zc = paramList;
    if (Zbqc.Zwu() == null)
      Zes5.Zp(new Zbqc[2]); 
  }
  
  public Zes5 ZF() {
    String str1 = this.ZH.ZO(this.ZI, this.Zj);
    String str2 = null;
    Zbqc[] arrayOfZbqc = Zes5.Zy();
    Zefg<Zmwr> zefg = null;
    Zx8_ zx8_ = Ze(str1, this.Zj);
    if (zx8_ != null) {
      str2 = Zkb.ZG(zx8_.ZZa().Zd4());
      zefg = zx8_.ZZp();
    } 
    if (arrayOfZbqc != null)
      Zbqc.Zr(new Zbqc[3]); 
    return new Zes5(zefg, str1, str2);
  }
  
  public Zx8_ Ze(String paramString1, String paramString2) {
    Zlqf zlqf = this.ZH.ZQ(paramString1);
    if (zlqf != null && !zlqf.Ze()) {
      Zx8_ zx8_ = zlqf.ZJ(paramString2);
      return (zx8_ != null) ? zx8_ : zlqf.Zk(this.Zc);
    } 
    return null;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zx82.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */