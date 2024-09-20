package burp;

import java.util.ArrayList;
import java.util.List;

class Zxnf implements Zmxf {
  private final Zey9 Zd;
  
  private final Zlou Ze;
  
  private Zxnf(Zey9 paramZey9, Zlou paramZlou) {
    this.Zd = paramZey9;
    this.Ze = paramZlou;
  }
  
  public Zefx ZF(Zr6h paramZr6h) {
    List<Ztnz> list = paramZr6h.ZK();
    ArrayList<Ztnz> arrayList = new ArrayList<>(list);
    String str = this.Ze.ZA + "=" + this.Ze.ZA;
    arrayList.add(new Ztnz(Ztnz.Zf, str));
    Zmzk zmzk = paramZr6h.ZT();
    return this.Zd.ZR(zmzk, arrayList, paramZr6h.Zw());
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxnf.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */