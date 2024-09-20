package burp;

import java.util.Iterator;

public class Zk4 implements Iterator<Ztp0> {
  private final Zkc3 Zf;
  
  private int Zv = 0;
  
  public Zk4(Zkc3 paramZkc3) {
    this.Zf = paramZkc3;
  }
  
  public boolean hasNext() {
    try {
    
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return (this.Zv < this.Zf.size());
  }
  
  public Ztp0 ZT() {
    return this.Zf.ZXq(this.Zv++);
  }
  
  public void remove() {
    try {
      if (this.Zv == 0)
        throw new IllegalStateException(); 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    this.Zf.ZXg(--this.Zv);
  }
  
  private static IllegalStateException a(IllegalStateException paramIllegalStateException) {
    return paramIllegalStateException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zk4.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */