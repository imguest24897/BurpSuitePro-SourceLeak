package burp;

import java.util.Iterator;

class Zlpk implements Iterator<Zb3t> {
  private Zb3t Zg;
  
  private Zkr1<Zb3t> Zf = new Zkr1<>();
  
  private Zlpk(Zb3t paramZb3t) {
    Zj(paramZb3t);
    this.Zg = this.Zf.Zc();
  }
  
  public void remove() {
    throw new UnsupportedOperationException();
  }
  
  public boolean hasNext() {
    try {
    
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    return (this.Zg != null);
  }
  
  public Zb3t ZD() {
    Zb3t zb3t = this.Zg;
    this.Zg = ZA(zb3t);
    return zb3t;
  }
  
  private Zb3t ZA(Zb3t paramZb3t) {
    Zbqc[] arrayOfZbqc = Zz61.Zh();
    try {
      if (this.Zf.ZP() == null)
        return null; 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    Zb3t zb3t = this.Zf.ZP();
    byte b = 0;
    while (b < zb3t.ZC().size()) {
      try {
        if (zb3t.ZC().get(b) != paramZb3t) {
          b++;
          if (arrayOfZbqc != null)
            break; 
        } 
      } catch (UnsupportedOperationException unsupportedOperationException) {
        throw a(null);
      } 
    } 
    try {
      if (++b < zb3t.ZC().size()) {
        Zj(zb3t.ZC().get(b));
        return this.Zf.Zc();
      } 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    return this.Zf.Zc();
  }
  
  private void Zj(Zb3t paramZb3t) {
    try {
      this.Zf.Zy(paramZb3t);
      if (paramZb3t.Zk())
        Zj(paramZb3t.ZC().get(0)); 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
  }
  
  private static UnsupportedOperationException a(UnsupportedOperationException paramUnsupportedOperationException) {
    return paramUnsupportedOperationException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlpk.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */