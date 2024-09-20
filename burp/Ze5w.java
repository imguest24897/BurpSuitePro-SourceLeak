package burp;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class Ze5w implements Zlfv<Zrkg> {
  private final List<Zr3k> Zd;
  
  private final Zefg<Zglw> ZT;
  
  public Ze5w(List<Zr3k> paramList) {
    this.Zd = paramList;
    this.ZT = null;
  }
  
  public Zsqx<Zrkg> Zc(Map<Zvow, Zzi8> paramMap) {
    return new Zl1m(this, paramMap);
  }
  
  private Zefg<Zglw> Zx(Zr_4 paramZr_4, Map<Zvow, Zzi8> paramMap) {
    Zbqc[] arrayOfZbqc = Zzmy.Zj();
    if (this.ZT != null)
      return this.ZT; 
    Zefg<Zglw> zefg = Zkk.Zl(paramZr_4, Zglw.ZE, ((List)Objects.<List>requireNonNull(this.Zd)).size());
    for (Zr3k zr3k : this.Zd) {
      zefg.add(paramZr_4.<Zglw>ZH(zr3k.ZS(paramMap)));
      if (arrayOfZbqc != null)
        break; 
    } 
    return zefg;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ze5w.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */