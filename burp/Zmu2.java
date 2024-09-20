package burp;

public class Zmu2 implements Zbnx {
  private final Ztbb Zw;
  
  private final Zxdt ZC;
  
  private final Zz95 Zb;
  
  private final Zb_d ZJ;
  
  private final Zb_d ZD;
  
  private final Zg6h ZY;
  
  public Zmu2(Ztbb paramZtbb, Zxdt paramZxdt, Zz95 paramZz95, Zb_d paramZb_d1, Zb_d paramZb_d2, Zg6h paramZg6h) {
    this.Zw = paramZtbb;
    this.ZC = paramZxdt;
    this.Zb = paramZz95;
    this.ZJ = paramZb_d1;
    this.ZD = paramZb_d2;
    this.ZY = paramZg6h;
  }
  
  public Zea5 Zz(Zrps paramZrps, Zgzx paramZgzx, Zxtv paramZxtv, Zl7q paramZl7q, Zzen paramZzen, Zsil paramZsil, Zthe paramZthe, Ztxn paramZtxn) {
    Zb_d zb_d = paramZl7q.Za() ? this.ZD : this.ZJ;
    return new Zb0b(this.Zw, this.ZC, this.Zb, zb_d, paramZrps, paramZgzx, paramZxtv, paramZzen, paramZsil, paramZthe, paramZtxn, this.ZY);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmu2.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */