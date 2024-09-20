package burp;

import java.util.List;

public class Zkd_ extends Zkdw {
  public Zkd_(Zb3t paramZb3t) {
    super(paramZb3t);
  }
  
  protected boolean Zo() {
    return Zi(this.Zt);
  }
  
  protected boolean ZY(Zb3t paramZb3t) {
    return (!Zl19.ZG(paramZb3t) && ZF(paramZb3t));
  }
  
  protected boolean ZM(Zb3t paramZb3t) {
    return (paramZb3t == this.Zt || !Zl19.ZG(paramZb3t) || !ZF(paramZb3t));
  }
  
  private boolean ZF(Zb3t paramZb3t) {
    List list = paramZb3t.<List>ZO(Zxc6.ExecutionHops);
    return (list != null && !list.isEmpty());
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkd_.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */