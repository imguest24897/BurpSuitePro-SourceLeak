package burp;

import java.util.ArrayList;
import java.util.List;

public class Zen9 {
  private final List<Zgy_> Zz = new ArrayList<>();
  
  public Zen9 ZO(Zl30 paramZl30, int paramInt) {
    Zgy_ zgy_ = new Zgy_(paramInt);
    this.Zz.add(zgy_);
    boolean bool = Zgy_.ZN();
    for (Ztx4 ztx4 : paramZl30.ZT()) {
      Zgy_ zgy_1 = new Zgy_(paramInt);
      this.Zz.add(zgy_1);
      Zes2 zes2 = new Zes2(ztx4, zgy_1);
      zgy_.Zz(zes2);
      zgy_ = zgy_1;
      if (bool) {
        Zbqc.Zr(new Zbqc[3]);
        break;
      } 
    } 
    zgy_.Zv();
    return this;
  }
  
  public List<Zgy_> Zm() {
    return this.Zz;
  }
  
  public void ZU(Zen9 paramZen9) {
    this.Zz.addAll(paramZen9.Zm());
  }
  
  public Zgy_ Zf() {
    return this.Zz.get(0);
  }
  
  public void ZB(Zr9_ paramZr9_, List<Zes2> paramList) {
    boolean bool = Zgy_.ZN();
    for (Zgy_ zgy_ : this.Zz) {
      zgy_.Zp(paramZr9_, paramList);
      if (bool)
        break; 
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zen9.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */