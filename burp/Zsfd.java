package burp;

import java.util.Iterator;
import java.util.NoSuchElementException;

class Zsfd implements Iterator<T> {
  private final Zrte<T> ZG;
  
  private int Zk;
  
  private int ZX;
  
  final Zx2h ZE;
  
  private Zsfd(Zx2h paramZx2h) {
    this(paramZx2h, 0);
  }
  
  private Zsfd(Zx2h paramZx2h, int paramInt) {
    this.Zk = paramZx2h.size();
    this.ZG = paramZx2h.Zt();
    this.ZX = paramInt;
  }
  
  public boolean hasNext() {
    try {
    
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return (this.ZX < this.Zk);
  }
  
  public T Zh() {
    try {
      if (!hasNext())
        throw new NoSuchElementException(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return this.ZG.ZdF(this.ZX++);
  }
  
  public void remove() {
    try {
      if (this.ZX == 0)
        throw new IllegalStateException(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    this.ZE.Zgq(--this.ZX);
    this.Zk--;
  }
  
  private static NoSuchElementException a(NoSuchElementException paramNoSuchElementException) {
    return paramNoSuchElementException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsfd.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */