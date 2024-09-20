package burp;

import java.util.Iterator;

class Zkjg implements Iterator<Zb3t> {
  private final Zb3t ZN;
  
  private boolean ZD = true;
  
  public Zkjg(Zb3t paramZb3t) {
    this.ZN = paramZb3t;
  }
  
  public boolean hasNext() {
    return this.ZD;
  }
  
  public Zb3t Ze() {
    this.ZD = false;
    return this.ZN;
  }
  
  public void remove() {
    throw new UnsupportedOperationException();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkjg.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */