package burp;

import java.util.Iterator;

class Zzp_ implements Iterator<Zska> {
  private Zska Zb;
  
  private Zzp_(Zska paramZska) {
    this.Zb = paramZska;
  }
  
  public boolean hasNext() {
    return (this.Zb != null);
  }
  
  public Zska Zo() {
    Zska zska = this.Zb;
    this.Zb = this.Zb.Zo;
    return zska;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzp_.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */