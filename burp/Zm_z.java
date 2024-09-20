package burp;

import java.util.Iterator;

class Zm_z<T extends Zlm2> implements Iterator<T> {
  private final Zl5x ZG;
  
  private final Iterator<T> ZJ;
  
  private final Zmn9 Zp;
  
  private volatile boolean Zt;
  
  private Zm_z(Zl5x paramZl5x, Iterator<T> paramIterator, Zmn9 paramZmn9) {
    this.ZG = paramZl5x;
    this.ZJ = paramIterator;
    this.Zp = paramZmn9;
  }
  
  public boolean hasNext() {
    this.Zt = this.Zp.Zb();
    return (this.Zt || this.ZJ.hasNext());
  }
  
  public T ZU() {
    return (T)(this.Zt ? new Zeq3(this.ZG, this.Zp) : (Zlm2)this.ZJ.next());
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zm_z.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */