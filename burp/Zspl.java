package burp;

import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Zspl implements Zeiy {
  private final Zl7h ZZ;
  
  private final Zr69 Zv;
  
  private final Zr_4 Zg;
  
  private final Zkl6 ZQ;
  
  private final Zz1m<Zt18> ZV;
  
  private final Ztos<Zt35> ZY;
  
  public Zspl(Zl7h paramZl7h, Zr69 paramZr69, Zr_4 paramZr_4, Zkl6 paramZkl6, Zz1m<Zt18> paramZz1m, Ztos<Zt35> paramZtos) {
    this.ZZ = paramZl7h;
    this.Zv = paramZr69;
    this.Zg = paramZr_4;
    this.ZQ = paramZkl6;
    this.ZV = paramZz1m;
    this.ZY = Objects.<Ztos<Zt35>>requireNonNull(paramZtos);
  }
  
  public List<Zbql> ZT() {
    return this.Zv.Zb() ? Collections.singletonList(new Zt4m(this.ZZ, this.Zv, this.Zg, this.ZQ, this.ZV, this.ZY)) : (this.Zv.Zt() ? Collections.singletonList(new Zt4b(this.ZZ, this.Zv, this.Zg, this.ZQ, this.ZV, this.ZY)) : (this.Zv.ZV() ? Collections.singletonList(new Zt4v(this.ZZ, this.Zv, this.Zg, this.ZQ, this.ZV, this.ZY)) : Collections.singletonList(new Zt47(this.ZZ, this.Zv, this.Zg, this.ZQ, this.ZV, this.ZY))));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zspl.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */