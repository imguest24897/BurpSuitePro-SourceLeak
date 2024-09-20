package burp;

import java.util.Objects;
import net.portswigger.Zkb;

public class Ze6e {
  private final Zlit Zg;
  
  public static Ze6e Zb(Zbza paramZbza) {
    Zbqc[] arrayOfZbqc = Zx50.Zd();
    if (Zbqc.Zwu() == null)
      Zx50.ZN(new Zbqc[4]); 
    return new Ze6e(new Zax(paramZbza.Zg0(), Zkb.Zy(paramZbza.ZgY())));
  }
  
  private Ze6e(Zlit paramZlit) {
    this.Zg = Objects.<Zlit>requireNonNull(paramZlit);
  }
  
  public Zlit ZO() {
    return this.Zg;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ze6e.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */