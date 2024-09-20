package burp;

import java.util.Iterator;

public class Zt8s implements Iterator<Zs3e> {
  private final Zl5f Zp;
  
  private int ZT = 0;
  
  public Zt8s(Zl5f paramZl5f) {
    this.Zp = paramZl5f;
  }
  
  public boolean hasNext() {
    try {
    
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return (this.ZT < this.Zp.size());
  }
  
  public Zs3e Zd() {
    return this.Zp.ZPI(this.ZT++);
  }
  
  public void remove() {
    try {
      if (this.ZT == 0)
        throw new IllegalStateException(); 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    this.Zp.ZPi(--this.ZT);
  }
  
  private static IllegalStateException a(IllegalStateException paramIllegalStateException) {
    return paramIllegalStateException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zt8s.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */