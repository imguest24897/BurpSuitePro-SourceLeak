package burp;

import java.util.Iterator;

public class Zrc9 implements Iterator<Zgn1> {
  private final Zm0z Zb;
  
  private int Zs = 0;
  
  public Zrc9(Zm0z paramZm0z) {
    this.Zb = paramZm0z;
  }
  
  public boolean hasNext() {
    try {
    
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return (this.Zs < this.Zb.size());
  }
  
  public Zgn1 ZA() {
    return this.Zb.Zi1(this.Zs++);
  }
  
  public void remove() {
    try {
      if (this.Zs == 0)
        throw new IllegalStateException(); 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    this.Zb.ZiG(--this.Zs);
  }
  
  private static IllegalStateException a(IllegalStateException paramIllegalStateException) {
    return paramIllegalStateException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrc9.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */