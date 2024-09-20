package burp;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;

class Zzrp implements Iterator<Zrbc> {
  private final Zb9t ZS;
  
  private final Zm7h ZX;
  
  private final Zlb4 Zt;
  
  private final Function<Ze8d, Iterator<Zrbc>> Zo;
  
  private Iterator<Zrbc> Zv;
  
  Zzrp(Zb9t paramZb9t, Zm7h paramZm7h, Zlb4 paramZlb4, Function<Ze8d, Iterator<Zrbc>> paramFunction) {
    this.ZS = paramZb9t;
    this.ZX = paramZm7h;
    this.Zt = paramZlb4;
    this.Zo = paramFunction;
  }
  
  private void Zh() {
    if (this.Zv != null)
      return; 
    Iterator<Ze8d> iterator = this.Zt.Zh().stream().map(this::lambda$initialise$0).flatMap(Collection::stream).toList().iterator();
    this.Zv = new Zmk1<>(iterator, this.Zo);
  }
  
  public boolean hasNext() {
    if (this.Zv == null)
      Zh(); 
    return this.Zv.hasNext();
  }
  
  public Zrbc Zb() {
    if (this.Zv == null)
      Zh(); 
    return this.Zv.next();
  }
  
  private List lambda$initialise$0(Zvs paramZvs) {
    return Ze8d.Zg(paramZvs, this.ZS.ZG(), this.ZX);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzrp.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */