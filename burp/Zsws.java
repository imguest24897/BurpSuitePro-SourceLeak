package burp;

import java.util.Iterator;
import java.util.List;

class Zsws implements Iterator {
  private int ZV;
  
  private List<Zgbi> Zx;
  
  private Zesp Zi;
  
  private Zgbi Zf;
  
  public Zsws(Zesp paramZesp) {
    this.Zi = paramZesp;
    this.ZV = 0;
    this.Zx = paramZesp.<List<Zgbi>>ZO(Zxc6.TaintHops);
  }
  
  public boolean hasNext() {
    boolean bool = Zrn9.Za();
    try {
      if (this.Zx != null)
        try {
          if (this.ZV < this.Zx.size()) {
            int i = this.ZV;
            while (i < this.Zx.size()) {
              try {
                if (Z_(i))
                  return true; 
              } catch (UnsupportedOperationException unsupportedOperationException) {
                throw a(null);
              } 
              i++;
              if (!bool)
                break; 
            } 
            return false;
          } 
          return false;
        } catch (UnsupportedOperationException unsupportedOperationException) {
          throw a(null);
        }  
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    return false;
  }
  
  public Zgbi ZG() {
    boolean bool = Zrn9.Zn();
    while (!Z_(this.ZV)) {
      this.ZV++;
      if (bool)
        break; 
    } 
    this.Zf = this.Zx.get(this.ZV++);
    return this.Zf;
  }
  
  public void remove() {
    throw new UnsupportedOperationException();
  }
  
  public Zgbi Zh() {
    try {
      if (this.Zf == null)
        this.Zf = this.Zx.get(this.ZV); 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    return this.Zf;
  }
  
  private boolean Z_(int paramInt) {
    try {
    
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    return (((Zgbi)this.Zx.get(paramInt)).Zm() == this.Zi);
  }
  
  private static UnsupportedOperationException a(UnsupportedOperationException paramUnsupportedOperationException) {
    return paramUnsupportedOperationException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsws.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */