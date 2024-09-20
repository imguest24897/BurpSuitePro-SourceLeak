package burp;

import java.util.Iterator;

class Zkvs implements Iterator<Zb3t> {
  private final Zb3t Zz;
  
  private Zb3t Zd;
  
  private final Zkr1<Integer> ZW;
  
  private int Zl;
  
  final Zkdw Zs;
  
  private Zkvs(Zkdw paramZkdw, Zb3t paramZb3t) {
    this.Zz = paramZb3t;
    this.Zd = paramZb3t;
    this.ZW = new Zkr1<>();
    if (!paramZkdw.Zo())
      this.Zd = Zs(paramZb3t); 
  }
  
  public boolean hasNext() {
    try {
    
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    return (this.Zd != null);
  }
  
  public Zb3t Zt() {
    Zb3t zb3t = this.Zd;
    this.Zd = Zs(zb3t);
    return zb3t;
  }
  
  public void remove() {
    throw new UnsupportedOperationException();
  }
  
  private Zb3t Zs(Zb3t paramZb3t) {
    Zb3t zb3t = paramZb3t;
    do {
      zb3t = Zr(zb3t);
    } while (zb3t != null && !this.Zs.ZY(zb3t));
    return zb3t;
  }
  
  private Zb3t Zr(Zb3t paramZb3t) {
    try {
      if (paramZb3t.Zk())
        try {
          if (this.Zs.ZM(paramZb3t)) {
            this.ZW.Zy(Integer.valueOf(this.Zl));
            this.Zl = 0;
            return paramZb3t.ZC().get(this.Zl);
          } 
        } catch (UnsupportedOperationException unsupportedOperationException) {
          throw a(null);
        }  
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    return Zy(paramZb3t);
  }
  
  private Zb3t Zy(Zb3t paramZb3t) {
    try {
      if (paramZb3t == this.Zz)
        return null; 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    Zb3t zb3t = paramZb3t.ZI();
    try {
      this.Zl++;
      if (this.Zl < zb3t.ZC().size())
        return zb3t.ZC().get(this.Zl); 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    this.Zl = ((Integer)this.ZW.Zc()).intValue();
    return Zy(paramZb3t.ZI());
  }
  
  private static UnsupportedOperationException a(UnsupportedOperationException paramUnsupportedOperationException) {
    return paramUnsupportedOperationException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkvs.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */