package burp;

import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

class Zbjc implements Zsil {
  private final Zsil Zy;
  
  private final AtomicBoolean ZV;
  
  Zbjc(Zsil paramZsil, AtomicBoolean paramAtomicBoolean) {
    this.Zy = paramZsil;
    this.ZV = paramAtomicBoolean;
  }
  
  public Zeu6 ZC() {
    return this.Zy.ZC();
  }
  
  public Zx_o Zx() {
    return this.Zy.Zx();
  }
  
  public Zms7 Zd() {
    return this.Zy.Zd();
  }
  
  public Zm5u ZQ() {
    return this.Zy.ZQ();
  }
  
  public Zg4n Zb() {
    return this.ZV.get() ? Zg4n.ABORT : this.Zy.Zb();
  }
  
  public Zg4n ZZ() {
    return this.ZV.get() ? Zg4n.ABORT : this.Zy.ZZ();
  }
  
  public Zg4n ZM(List<String> paramList) {
    return this.ZV.get() ? Zg4n.ABORT : this.Zy.ZM(paramList);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbjc.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */