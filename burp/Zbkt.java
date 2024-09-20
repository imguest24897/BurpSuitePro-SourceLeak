package burp;

import java.awt.GridLayout;

public class Zbkt extends Zbqc {
  private final Zm9y Zr = new Zm9y();
  
  private final Zm2o ZF = new Zm2o();
  
  public Zbkt() {
    setLayout(new GridLayout(2, 1, 0, 5));
    add(this.Zr);
    add(this.ZF);
  }
  
  public void ZE(Runnable paramRunnable, Zk97 paramZk97) {
    this.Zr.Z_(paramRunnable);
    this.ZF.Zi(paramZk97);
  }
  
  public void ZU() {
    remove(this.Zr);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbkt.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */