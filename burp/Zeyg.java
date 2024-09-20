package burp;

import java.util.Iterator;

class Zeyg implements Iterator<Zb3t> {
  private final Zb3t Zi;
  
  private Zb3t Zn;
  
  private final Zkr1<Integer> Zk;
  
  private int Zf;
  
  private Zeyg(Zb3t paramZb3t) {
    this.Zi = paramZb3t;
    this.Zn = paramZb3t;
    this.Zk = new Zkr1<>();
  }
  
  public boolean hasNext() {
    try {
    
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    return (this.Zn != null);
  }
  
  public Zb3t ZO() {
    Zb3t zb3t = this.Zn;
    this.Zn = Zj(zb3t);
    return zb3t;
  }
  
  public void remove() {
    throw new UnsupportedOperationException();
  }
  
  private Zb3t Zj(Zb3t paramZb3t) {
    try {
      if (paramZb3t.Zk()) {
        this.Zk.Zy(Integer.valueOf(this.Zf));
        this.Zf = 0;
        return paramZb3t.ZC().get(this.Zf);
      } 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    return Zw(paramZb3t);
  }
  
  private Zb3t Zw(Zb3t paramZb3t) {
    try {
      if (paramZb3t == this.Zi)
        return null; 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    Zb3t zb3t = paramZb3t.ZI();
    try {
      this.Zf++;
      if (this.Zf < zb3t.ZC().size())
        return zb3t.ZC().get(this.Zf); 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    this.Zf = ((Integer)this.Zk.Zc()).intValue();
    return Zw(paramZb3t.ZI());
  }
  
  private static UnsupportedOperationException a(UnsupportedOperationException paramUnsupportedOperationException) {
    return paramUnsupportedOperationException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zeyg.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */