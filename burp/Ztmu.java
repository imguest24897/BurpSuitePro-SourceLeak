package burp;

import java.util.function.Consumer;

public abstract class Ztmu {
  private final Zz1i ZV;
  
  private final Zl5x Zj;
  
  private final Zbza Zd;
  
  private final Consumer<Zb09> Zb;
  
  public Ztmu(Zl5x paramZl5x, Zz1i paramZz1i, Zbza paramZbza, Consumer<Zb09> paramConsumer) {
    this.ZV = paramZz1i;
    this.Zj = paramZl5x;
    this.Zd = paramZbza;
    this.Zb = paramConsumer;
  }
  
  void Zv() {
    synchronized (this.Zd.Zz6()) {
      this.Zd.ZgA().stream().filter(this::lambda$collectAndClearErrorLocations$0).filter(this::lambda$collectAndClearErrorLocations$1).distinct().forEach(this.Zb);
    } 
  }
  
  private boolean lambda$collectAndClearErrorLocations$1(Zb09 paramZb09) {
    return (paramZb09.ZJL() == this.ZV.Zd(this.Zj) - 1L);
  }
  
  private boolean lambda$collectAndClearErrorLocations$0(Zb09 paramZb09) {
    return (paramZb09.ZJz() == this.Zj);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztmu.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */