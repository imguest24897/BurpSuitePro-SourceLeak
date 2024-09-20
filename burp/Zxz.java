package burp;

import java.util.Iterator;

class Zxz implements Iterator<Zxpw> {
  final Zgyh ZA;
  
  Zxz(Zgyh paramZgyh) {}
  
  public boolean hasNext() {
    return this.ZA.ZG.hasNext();
  }
  
  public Zxpw Zz() {
    this.ZA.ZC = this.ZA.ZG.next();
    return this.ZA.ZC;
  }
  
  public void remove() {
    throw new UnsupportedOperationException();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxz.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */