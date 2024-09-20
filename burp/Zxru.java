package burp;

import java.util.Iterator;

class Zxru implements Iterator<Boolean> {
  private final Zmfv Zz;
  
  private int ZD = 0;
  
  Zxru(Zmfv paramZmfv) {
    this.Zz = paramZmfv;
  }
  
  public boolean hasNext() {
    try {
    
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return (this.ZD < this.Zz.size());
  }
  
  public Boolean ZF() {
    return this.Zz.get(this.ZD++);
  }
  
  public void remove() {
    try {
      if (this.ZD == 0)
        throw new IllegalStateException(); 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    this.Zz.remove(--this.ZD);
  }
  
  private static IllegalStateException a(IllegalStateException paramIllegalStateException) {
    return paramIllegalStateException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxru.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */