package burp;

import java.util.Iterator;

class Zkow implements Iterator<Long> {
  private final Zxsn ZZ;
  
  private int ZG = 0;
  
  Zkow(Zxsn paramZxsn) {
    this.ZZ = paramZxsn;
  }
  
  public boolean hasNext() {
    try {
    
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return (this.ZG < this.ZZ.size());
  }
  
  public Long Zd() {
    return this.ZZ.get(this.ZG++);
  }
  
  public void remove() {
    try {
      if (this.ZG == 0)
        throw new IllegalStateException(); 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    this.ZZ.remove(--this.ZG);
  }
  
  private static IllegalStateException a(IllegalStateException paramIllegalStateException) {
    return paramIllegalStateException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkow.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */