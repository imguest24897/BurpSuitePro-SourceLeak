package burp;

import java.net.InetAddress;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Zsnx {
  private final List<Ztrp> ZV;
  
  private final Collection<Integer> Zx;
  
  Zsnx(List<Ztrp> paramList, Collection<Integer> paramCollection) {
    this.ZV = paramList;
    this.Zx = paramCollection;
  }
  
  public Zl9f ZL() {
    Zl9f zl9f = new Zl9f();
    Iterator<Ztrp> iterator = this.ZV.iterator();
    int i = Zrak.ZW();
    while (iterator.hasNext()) {
      Ztrp ztrp = iterator.next();
      zl9f.Zl(ztrp.ZQ, ztrp.ZY);
      if (i != 0)
        break; 
    } 
    return zl9f;
  }
  
  public Collection<Integer> Zz() {
    return this.Zx;
  }
  
  public Collection<InetAddress> ZN() {
    return (Collection<InetAddress>)this.ZV.stream().map(Zsnx::lambda$localAddresses$0).collect(Collectors.toList());
  }
  
  private static InetAddress lambda$localAddresses$0(Ztrp paramZtrp) {
    return paramZtrp.Za;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsnx.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */