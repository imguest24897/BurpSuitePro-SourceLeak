package burp;

import java.util.Iterator;
import java.util.NoSuchElementException;

class Zq_ implements Iterator<T> {
  private int ZF;
  
  private int Zj;
  
  final Zyu ZW;
  
  private Zq_(Zyu paramZyu, int paramInt) {
    this.ZF = paramZyu.size();
    this.Zj = paramInt;
  }
  
  public boolean hasNext() {
    try {
    
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return (this.Zj < this.ZF);
  }
  
  public T Zx() {
    try {
      if (!hasNext())
        throw new NoSuchElementException(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return (T)this.ZW.Z_(this.Zj++);
  }
  
  public void remove() {
    try {
      if (this.Zj == 0)
        throw new IllegalStateException(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    this.ZW.ZP(--this.Zj);
    this.ZF--;
  }
  
  private static NoSuchElementException a(NoSuchElementException paramNoSuchElementException) {
    return paramNoSuchElementException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zq_.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */