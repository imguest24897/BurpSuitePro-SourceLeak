package burp;

import java.util.List;

public class Zlnh implements Zlic {
  private final Ztoo Zw;
  
  private final boolean Zc;
  
  Zlnh(Ztoo paramZtoo) {
    this(paramZtoo, false);
  }
  
  Zlnh(Ztoo paramZtoo, boolean paramBoolean) {
    this.Zw = paramZtoo;
    this.Zc = paramBoolean;
  }
  
  public void Zf(Zstu paramZstu1, Zs68 paramZs681, Zstu paramZstu2, Zs68 paramZs682, List<Zl1r> paramList1, List<Zl1r> paramList2) {
    Zrtt zrtt = new Zrtt(this, paramZstu1, paramZstu2, paramZs681, paramZs682);
    paramList1.addAll(zrtt.Zg);
    paramList2.addAll(zrtt.ZB);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlnh.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */