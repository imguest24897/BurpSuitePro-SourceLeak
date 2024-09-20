package burp;

import java.util.Iterator;

class Zkd5 implements Iterator<Zb3t> {
  private Zb3t Zz;
  
  private Zkd5(Zb3t paramZb3t) {
    this.Zz = paramZb3t.ZI();
  }
  
  public boolean hasNext() {
    try {
    
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    return (this.Zz != null);
  }
  
  public Zb3t Zb() {
    Zb3t zb3t = this.Zz;
    this.Zz = zb3t.ZI();
    return zb3t;
  }
  
  public void remove() {
    throw new UnsupportedOperationException();
  }
  
  private static UnsupportedOperationException a(UnsupportedOperationException paramUnsupportedOperationException) {
    return paramUnsupportedOperationException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkd5.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */