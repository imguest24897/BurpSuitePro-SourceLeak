package burp;

import java.util.Iterator;

class Zsxz implements Iterator<Zb3t> {
  private final Zb3t ZV;
  
  private boolean ZE;
  
  private Iterator<Zb3t> Zh;
  
  private Zsxz(Zb3t paramZb3t, Zsdd paramZsdd) {
    this.ZV = paramZb3t;
    if (paramZsdd != null)
      this.Zh = paramZsdd.iterator(); 
  }
  
  public boolean hasNext() {
    try {
      if (this.ZE) {
        try {
          if (this.Zh != null)
            try {
              if (this.Zh.hasNext());
            } catch (UnsupportedOperationException unsupportedOperationException) {
              throw a(null);
            }  
        } catch (UnsupportedOperationException unsupportedOperationException) {
          throw a(null);
        } 
        return false;
      } 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
  }
  
  public Zb3t ZR() {
    try {
      if (this.ZE) {
        try {
          if (this.Zh != null)
            return this.Zh.next(); 
        } catch (UnsupportedOperationException unsupportedOperationException) {
          throw a(null);
        } 
        return null;
      } 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    this.ZE = true;
    return this.ZV;
  }
  
  public void remove() {
    throw new UnsupportedOperationException();
  }
  
  private static UnsupportedOperationException a(UnsupportedOperationException paramUnsupportedOperationException) {
    return paramUnsupportedOperationException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsxz.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */