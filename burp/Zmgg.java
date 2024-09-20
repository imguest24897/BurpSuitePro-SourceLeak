package burp;

import java.util.Iterator;
import java.util.Set;

public class Zmgg implements Zzc4 {
  private final Iterator<Zrcg> Zr;
  
  private final Zbza Zi;
  
  Zmgg(Zbza paramZbza, Iterable<Zrcg> paramIterable) {
    this.Zi = paramZbza;
    this.Zr = paramIterable.iterator();
  }
  
  public Zm6s<? extends Zmgr> Z_() {
    Zrcg zrcg;
    synchronized (this.Zi.Zz6()) {
      zrcg = this.Zr.hasNext() ? this.Zr.next() : null;
    } 
    if (zrcg != null && this.Zi.Zg6() != 4) {
      Set<? extends Zmgr> set = zrcg.Zc();
      return set.isEmpty() ? Z_() : Zm6s.Zc(set);
    } 
    return Zm6s.ZG();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmgg.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */