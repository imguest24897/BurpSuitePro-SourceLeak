package burp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Zg0p extends Zg04<Zbpn> {
  public Zg0p() {
    this(new ArrayList<>());
  }
  
  private Zg0p(List<Zbpn> paramList) {
    super(paramList);
  }
  
  public synchronized Zg0p ZM() {
    synchronized (this.ZC) {
      return new Zg0p(new ArrayList<>((Collection<? extends Zbpn>)this));
    } 
  }
  
  Object ZA() {
    return this.ZC;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zg0p.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */