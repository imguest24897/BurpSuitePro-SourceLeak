package burp;

import java.util.Iterator;

class Zlgq implements Iterator<Integer> {
  private final Zmg Zn;
  
  private int ZI = 0;
  
  Zlgq(Zmg paramZmg) {
    this.Zn = paramZmg;
  }
  
  public boolean hasNext() {
    try {
    
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return (this.ZI < this.Zn.size());
  }
  
  public Integer Za() {
    return this.Zn.get(this.ZI++);
  }
  
  public void remove() {
    try {
      if (this.ZI == 0)
        throw new IllegalStateException(); 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    this.Zn.remove(--this.ZI);
  }
  
  private static IllegalStateException a(IllegalStateException paramIllegalStateException) {
    return paramIllegalStateException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlgq.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */