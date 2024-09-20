package burp;

import java.util.Collection;

public class Zscg extends Zscd {
  private Zscg(Zscd paramZscd) {
    super(paramZscd);
  }
  
  public static Zscg Zg(Zscd paramZscd) {
    return new Zscg(paramZscd);
  }
  
  public Collection<Zblb> Zj() {
    return ((Zsc2)getCause()).Zj();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zscg.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */