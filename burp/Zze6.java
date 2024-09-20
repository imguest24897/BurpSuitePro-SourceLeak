package burp;

import java.util.List;

public class Zze6 {
  private final Zbnt ZY;
  
  private final Zr3e Zk;
  
  private final Zkq4 Zv;
  
  Zze6(Zbnt paramZbnt, Zey9 paramZey9, Zkq4 paramZkq4) {
    this.ZY = paramZbnt;
    this.Zv = paramZkq4;
    this.Zk = new Zr3e(paramZkq4, paramZey9, paramZbnt);
  }
  
  void Ze(List<Zbza> paramList) {
    this.Zk.ZY(paramList);
  }
  
  double Z_(Zbza paramZbza) {
    double d1 = this.Zk.ZX(paramZbza);
    double d2 = (new Zxu(this.Zv, this.ZY)).ZJ(paramZbza);
    return this.Zv.Zr_() * d2 + d1 * this.Zv.Zry();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zze6.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */