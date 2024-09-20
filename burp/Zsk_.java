package burp;

import java.util.Iterator;

class Zsk_ implements Iterator<Zbq_> {
  private final Zrvk Zb;
  
  private int Zn = 0;
  
  Zsk_(Zrvk paramZrvk) {
    this.Zb = paramZrvk;
  }
  
  public boolean hasNext() {
    try {
    
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return (this.Zn < this.Zb.size());
  }
  
  public Zbq_ ZP() {
    return this.Zb.Z_u(this.Zn++);
  }
  
  public void remove() {
    try {
      if (this.Zn == 0)
        throw new IllegalStateException(); 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    this.Zb.Z_f(--this.Zn);
  }
  
  private static IllegalStateException a(IllegalStateException paramIllegalStateException) {
    return paramIllegalStateException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsk_.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */