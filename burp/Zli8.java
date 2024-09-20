package burp;

import java.util.List;

public class Zli8 extends Zlio {
  private final Zbwk ZK;
  
  private Zli8(Zm4d paramZm4d) {
    super(paramZm4d);
    this.ZK = new Zs0r(this.ZF, paramZm4d.ZD, paramZm4d.Zw, paramZm4d.Zf);
  }
  
  public List<Zg8y> Zh(Zz3o paramZz3o, Zlve paramZlve) {
    Zbju zbju = new Zbju(this.Zv, this.ZK);
    ZP(paramZz3o, paramZlve, zbju);
    return zbju.ZT();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zli8.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */