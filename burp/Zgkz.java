package burp;

import java.util.Iterator;

class Zgkz implements Iterator<Zrh9> {
  private final Zsli ZI;
  
  private int ZK = 0;
  
  Zgkz(Zsli paramZsli) {
    this.ZI = paramZsli;
  }
  
  public boolean hasNext() {
    try {
    
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return (this.ZK < this.ZI.size());
  }
  
  public Zrh9 ZD() {
    return this.ZI.ZAf(this.ZK++);
  }
  
  public void remove() {
    try {
      if (this.ZK == 0)
        throw new IllegalStateException(); 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    this.ZI.ZAZ(--this.ZK);
  }
  
  private static IllegalStateException a(IllegalStateException paramIllegalStateException) {
    return paramIllegalStateException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgkz.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */