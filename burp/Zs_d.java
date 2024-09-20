package burp;

import java.util.Iterator;
import java.util.List;
import net.portswigger.Zen;
import net.portswigger.Zkb;
import net.portswigger.Zz_;

class Zs_d implements Zmf {
  private final Zgv1 Zn;
  
  private final Zzwc Zl;
  
  private final Zlhe ZR;
  
  private final int ZS;
  
  Zs_d(Zlhe paramZlhe, Zgv1 paramZgv1, Zzwc paramZzwc, int paramInt) {
    this.Zn = paramZgv1;
    this.Zl = paramZzwc;
    this.ZR = paramZlhe;
    this.ZS = paramInt;
  }
  
  public Zken ZC() {
    List list = (new Zz_(this.Zn.ZM())).Z_();
    StringBuilder stringBuilder = new StringBuilder();
    Iterator<Zen> iterator = list.iterator();
    int[] arrayOfInt = Zken.Zd();
    while (iterator.hasNext()) {
      Zen zen = iterator.next();
      stringBuilder.append(Zkb.ZG(zen.ZZ()));
      if (arrayOfInt == null)
        break; 
    } 
    Zken zken = Zken.Zg().ZL().Zp(this.ZS);
    this.Zl.ZM(zken, stringBuilder.toString());
    for (Zen zen : list) {
      this.ZR.Zg(this.Zn.ZC(), zen, this.Zn.ZM(), Zkb.Zy(zken.toString()), this.Zn.ZQ(), this.Zn.Zt());
      if (arrayOfInt == null)
        break; 
    } 
    if (Zbqc.Zwu() == null)
      Zken.Ze(new int[2]); 
    return zken;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zs_d.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */