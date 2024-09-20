package burp;

import java.util.Iterator;
import java.util.function.Function;

class Zmk1<T> implements Iterator<Zrbc> {
  private final Iterator<T> Zh;
  
  private final Function<T, Iterator<Zrbc>> ZW;
  
  private Iterator<Zrbc> ZB;
  
  Zmk1(Iterator<T> paramIterator, Function<T, Iterator<Zrbc>> paramFunction) {
    this.Zh = paramIterator;
    this.ZW = paramFunction;
  }
  
  public boolean hasNext() {
    return (this.ZB == null) ? this.Zh.hasNext() : ((this.ZB.hasNext() || this.Zh.hasNext()));
  }
  
  public Zrbc Zv() {
    if (this.ZB == null || !this.ZB.hasNext())
      this.ZB = this.ZW.apply(this.Zh.next()); 
    return this.ZB.next();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmk1.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */