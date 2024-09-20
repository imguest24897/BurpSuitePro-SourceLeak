package burp;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class Zsny {
  private final Collection<Ztpl> ZC;
  
  private final Collection<Zzqd> ZN;
  
  public Zsny() {
    this(new LinkedList<>(), new LinkedList<>());
  }
  
  public Zsny(Collection<Ztpl> paramCollection, Collection<Zzqd> paramCollection1) {
    this.ZC = paramCollection;
    this.ZN = paramCollection1;
  }
  
  public Collection<Zzqd> Zz() {
    return Collections.unmodifiableCollection(this.ZN);
  }
  
  public Collection<Ztpl> Zy() {
    return Collections.unmodifiableCollection(this.ZC);
  }
  
  private void Zx(Zzyu paramZzyu) {
    paramZzyu.ZS(new Zg36(this));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsny.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */