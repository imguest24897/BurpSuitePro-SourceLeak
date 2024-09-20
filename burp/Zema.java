package burp;

import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

class Zema implements Zmf9 {
  private final AtomicReference<Zmf9> Zl = new AtomicReference<>();
  
  public void ZS(List<Zz6e<?>> paramList) {
    ((Zmf9)this.Zl.get()).ZS(paramList);
  }
  
  public void Ze() {
    ((Zmf9)this.Zl.get()).Ze();
  }
  
  public void Zq(List<Zz6e<?>> paramList) {
    ((Zmf9)this.Zl.get()).Zq(paramList);
  }
  
  void ZB(Zmf9 paramZmf9) {
    this.Zl.set(paramZmf9);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zema.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */