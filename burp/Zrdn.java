package burp;

import java.util.Iterator;

class Zrdn implements Iterator<Zzwr> {
  private final Zmkl ZI;
  
  private int Zp = 0;
  
  Zrdn(Zmkl paramZmkl) {
    this.ZI = paramZmkl;
  }
  
  public boolean hasNext() {
    try {
    
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return (this.Zp < this.ZI.size());
  }
  
  public Zzwr ZZ() {
    return this.ZI.ZCi(this.Zp++);
  }
  
  public void remove() {
    try {
      if (this.Zp == 0)
        throw new IllegalStateException(); 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    this.ZI.ZCo(--this.Zp);
  }
  
  private static IllegalStateException a(IllegalStateException paramIllegalStateException) {
    return paramIllegalStateException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrdn.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */