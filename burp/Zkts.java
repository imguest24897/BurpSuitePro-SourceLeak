package burp;

import java.awt.Component;
import java.util.List;

class Zkts extends Zkt0 {
  private final List<Zgib> Zs;
  
  private final Zg7k Zd;
  
  Zkts(List<Zgib> paramList1, List<Zgib> paramList2, Zg7k paramZg7k) {
    super(paramList1);
    this.Zs = paramList2;
    this.Zd = paramZg7k;
  }
  
  public Component Za(Zt8 paramZt8) {
    Zgib zgib = this.Zs.isEmpty() ? this.ZC.get(0) : this.Zs.get(0);
    return zgib.ZB();
  }
  
  public void Zj(int paramInt1, int paramInt2) {
    String[] arrayOfString = Zxff.ZA();
    if (this.ZC.isEmpty()) {
      this.Zd.ZW(paramInt2);
      if (arrayOfString != null) {
        this.Zd.ZJ(paramInt1);
        return;
      } 
      return;
    } 
    this.Zd.ZJ(paramInt1);
  }
  
  void Zv() {}
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkts.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */