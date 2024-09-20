package burp;

import java.util.Iterator;

class Zmi5 implements Iterator<Short> {
  private final Zg06 Zs;
  
  private int Ze = 0;
  
  Zmi5(Zg06 paramZg06) {
    this.Zs = paramZg06;
  }
  
  public boolean hasNext() {
    try {
    
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return (this.Ze < this.Zs.size());
  }
  
  public Short Zh() {
    return this.Zs.get(this.Ze++);
  }
  
  public void remove() {
    try {
      if (this.Ze == 0)
        throw new IllegalStateException(); 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    this.Zs.remove(--this.Ze);
  }
  
  private static IllegalStateException a(IllegalStateException paramIllegalStateException) {
    return paramIllegalStateException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmi5.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */