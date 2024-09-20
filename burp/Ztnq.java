package burp;

import net.portswigger.Zqf;
import net.portswigger.Zuh;

class Ztnq extends Ztn0 {
  private final Zemk Zz;
  
  Ztnq(Zemk paramZemk) {
    this.Zz = paramZemk;
    this.Zf = Zt5z.ZU();
    this.ZV = Zt5z.Zo();
    this.Zc = Zt5z.Zi();
    this.ZZ = 4;
  }
  
  public int getRowCount() {
    return this.Zz.Zc();
  }
  
  public Object getValueAt(int paramInt1, int paramInt2) {
    if (paramInt1 < 0 || paramInt2 < 0)
      return null; 
    Zryx zryx = this.Zz.Zm(paramInt1);
    Zt5z zt5z = Zt5z.ZC(paramInt2);
    if (zt5z == null) {
      Zuh.Zv(false, Zqf.Zr, paramInt2);
      return null;
    } 
    switch (Zecd.ZO[zt5z.ordinal()]) {
      case 1:
        return Boolean.valueOf(zryx.Zl());
      case 2:
        return zryx.Zm();
      case 3:
        return zryx.Zy();
      case 4:
        return zryx.ZQ();
    } 
    Zuh.ZT(false, Zqf.Zr, zt5z.name());
    return null;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztnq.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */