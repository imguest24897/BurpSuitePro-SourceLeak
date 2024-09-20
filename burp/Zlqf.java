package burp;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import net.portswigger.Zkb;

public class Zlqf {
  private final Collection<Zx8_> ZS;
  
  public Zlqf(Collection<Zx8_> paramCollection) {
    this.ZS = (paramCollection == null) ? new LinkedList<>() : new LinkedList<>(paramCollection);
  }
  
  Zlqf() {
    this(null);
  }
  
  public synchronized boolean Ze() {
    return this.ZS.isEmpty();
  }
  
  public synchronized Zx8_ ZJ(String paramString) {
    String[] arrayOfString = Zl5e.Zr();
    for (Zx8_ zx8_ : this.ZS) {
      if (zx8_.ZZa() != null && zx8_.ZZa().Zd4() != null && Zkb.ZG(zx8_.ZZa().Zd4()).equals(paramString))
        return zx8_; 
      if (arrayOfString != null)
        break; 
    } 
    return null;
  }
  
  public synchronized Zx8_ Zk(List<Zlou> paramList) {
    Zx8_ zx8_ = null;
    byte b = 0;
    Iterator<Zx8_> iterator = this.ZS.iterator();
    String[] arrayOfString = Zl5e.Zr();
    while (iterator.hasNext()) {
      Zx8_ zx8_1 = iterator.next();
      byte b1 = 0;
      for (Zlou zlou : paramList) {
        if (zlou == null || zlou.ZA == null)
          continue; 
        String str = zlou.ZA;
        for (Zmwr zmwr : zx8_1.ZZp()) {
          if (str.equalsIgnoreCase(zmwr.Zh4()))
            b1++; 
          if (arrayOfString != null)
            break; 
        } 
        if (arrayOfString != null)
          break; 
      } 
      if (b1 > b)
        zx8_ = zx8_1; 
      if (arrayOfString != null)
        break; 
    } 
    return zx8_;
  }
  
  public synchronized void ZV(Zx8_ paramZx8_) {
    this.ZS.add(paramZx8_);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlqf.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */