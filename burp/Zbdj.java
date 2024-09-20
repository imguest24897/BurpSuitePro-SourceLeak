package burp;

import java.awt.Component;
import java.util.function.Consumer;

public abstract class Zbdj extends Zbqc implements Zed {
  private final String ZD;
  
  protected Zbdj(String paramString) {
    this.ZD = paramString;
  }
  
  public String Zb() {
    return this.ZD;
  }
  
  public Component ZB() {
    return this;
  }
  
  public void Zx(Consumer<Boolean> paramConsumer) {
    Zv().ZP(paramConsumer);
  }
  
  public void ZQ(Zbps paramZbps) {
    Zv().ZJ(paramZbps);
  }
  
  public Component ZU() {
    return Zv().Zw();
  }
  
  public boolean ZG() {
    return Zv().isSelected();
  }
  
  protected abstract Zkec Zv();
  
  public abstract void Zt();
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbdj.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */