package burp;

import java.awt.Component;
import java.util.function.Consumer;

public class Zt8v implements Zgwj {
  private final Zg94 ZE;
  
  private final Zehb ZX;
  
  public Zt8v(Zg94 paramZg94, Zehb paramZehb) {
    this.ZE = paramZg94;
    this.ZX = paramZehb;
  }
  
  public void ZK(Zlte paramZlte, Component paramComponent, Consumer<Zmkb> paramConsumer) {
    paramConsumer.accept(ZQ());
  }
  
  public Zmkb ZQ() {
    Zv6 zv6 = this.ZE.ZEH();
    Zbq5 zbq5 = this.ZX.ZS(zv6);
    return new Zmkb(zv6.Ze, zbq5);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zt8v.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */