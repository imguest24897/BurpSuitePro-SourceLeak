package burp;

import java.util.Iterator;

public class Zxc7 implements Iterator<Zlva> {
  private final Ztrr ZY;
  
  private int Zv = 0;
  
  public Zxc7(Ztrr paramZtrr) {
    this.ZY = paramZtrr;
  }
  
  public boolean hasNext() {
    try {
    
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return (this.Zv < this.ZY.size());
  }
  
  public Zlva Zo() {
    return this.ZY.ZTk(this.Zv++);
  }
  
  public void remove() {
    try {
      if (this.Zv == 0)
        throw new IllegalStateException(); 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    this.ZY.ZT3(--this.Zv);
  }
  
  private static IllegalStateException a(IllegalStateException paramIllegalStateException) {
    return paramIllegalStateException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxc7.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */