package burp;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class Zbl6 {
  private final List<Ztvz> ZD = new LinkedList<>();
  
  private final List<Zko4> ZJ = new LinkedList<>();
  
  private boolean Zd;
  
  private boolean ZG;
  
  public void ZA(boolean paramBoolean) {
    this.Zd = paramBoolean;
  }
  
  public void ZT(boolean paramBoolean) {
    this.ZG = paramBoolean;
  }
  
  public void Zu(List<Ztvz> paramList) {
    this.ZD.addAll(paramList);
  }
  
  public void Zv(Collection<Zko4> paramCollection) {
    this.ZJ.addAll(paramCollection);
  }
  
  public Ztfk Zi(Zr_4 paramZr_4) {
    Zx44 zx44 = this.Zd ? paramZr_4.<Zx44>ZH(new Ztzg()) : null;
    Zsaa zsaa = !this.ZD.isEmpty() ? paramZr_4.<Zsaa>ZH(new Zkt8(this.ZD)) : null;
    Zg_f zg_f = this.ZG ? paramZr_4.<Zg_f>ZH(new Zlwa()) : null;
    Ztfa ztfa = !this.ZJ.isEmpty() ? paramZr_4.<Ztfa>ZH(new Ze_c(this.ZJ)) : null;
    return paramZr_4.<Ztfk>ZH(new Zzar(zx44, zsaa, zg_f, ztfa));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbl6.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */