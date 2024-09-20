package burp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

class Zg0e implements Iterator<Zrbc> {
  static final Iterator<Zrbc> ZI = (new ArrayList<>()).iterator();
  
  private final Iterator<Zrbc> Zx;
  
  private final Iterable<Zrbc> ZT;
  
  private Iterator<Zrbc> ZS;
  
  Zg0e(Zrbc paramZrbc, Iterable<Zrbc> paramIterable) {
    this(Collections.<Zrbc>singleton(paramZrbc).iterator(), paramIterable);
  }
  
  Zg0e(Iterator<Zrbc> paramIterator, Iterable<Zrbc> paramIterable) {
    this.Zx = paramIterator;
    this.ZT = paramIterable;
  }
  
  public boolean hasNext() {
    if (this.Zx.hasNext())
      return true; 
    if (this.ZS == null)
      this.ZS = this.ZT.iterator(); 
    return this.ZS.hasNext();
  }
  
  public Zrbc ZP() {
    return this.Zx.hasNext() ? this.Zx.next() : this.ZS.next();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zg0e.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */