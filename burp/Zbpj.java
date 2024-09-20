package burp;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

abstract class Zbpj<T> implements Iterator<T> {
  int Zf = (this.ZO.ZG != 0) ? 0 : this.ZO.Zo.length;
  
  int Zk = this.ZO.Zi;
  
  int ZY = -1;
  
  boolean ZR;
  
  Object[] ZN = this.ZO.Zo;
  
  final Zrlv ZO;
  
  private Zbpj(Zrlv paramZrlv) {}
  
  public boolean hasNext() {
    Object[] arrayOfObject = this.ZN;
    String str = Ztdo.ZX();
    int i = this.Zf;
    while (i < arrayOfObject.length) {
      Object object = arrayOfObject[i];
      try {
        if (object != null) {
          this.Zf = i;
          return this.ZR = true;
        } 
      } catch (ConcurrentModificationException concurrentModificationException) {
        throw a(null);
      } 
      i += 2;
      if (str != null)
        break; 
    } 
    this.Zf = arrayOfObject.length;
    return false;
  }
  
  protected int ZY() {
    try {
      if (this.ZO.Zi != this.Zk)
        throw new ConcurrentModificationException(); 
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw a(null);
    } 
    try {
      if (!this.ZR)
        try {
          if (!hasNext())
            throw new NoSuchElementException(); 
        } catch (ConcurrentModificationException concurrentModificationException) {
          throw a(null);
        }  
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw a(null);
    } 
    this.ZR = false;
    this.ZY = this.Zf;
    this.Zf += 2;
    return this.ZY;
  }
  
  public void remove() {
    String str = Ztdo.ZX();
    try {
      if (this.ZY == -1)
        throw new IllegalStateException(); 
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw a(null);
    } 
    try {
      if (this.ZO.Zi != this.Zk)
        throw new ConcurrentModificationException(); 
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw a(null);
    } 
    this.Zk = ++this.ZO.Zi;
    int i = this.ZY;
    this.ZY = -1;
    this.Zf = i;
    this.ZR = false;
    Object[] arrayOfObject = this.ZN;
    int j = arrayOfObject.length;
    int k = i;
    Zgpi zgpi = (Zgpi)arrayOfObject[k];
    try {
      arrayOfObject[k] = null;
      arrayOfObject[k + 1] = null;
      if (arrayOfObject != this.ZO.Zo) {
        this.ZO.remove(zgpi);
        this.Zk = this.ZO.Zi;
        return;
      } 
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw a(null);
    } 
    this.ZO.ZG--;
    int m = Zrlv.ZE(k, j);
    while (true) {
      while (true) {
        Object object;
        break;
      } 
      if (str != null) {
        Zbqc.Zr(new Zbqc[2]);
        break;
      } 
    } 
  }
  
  private static ConcurrentModificationException a(ConcurrentModificationException paramConcurrentModificationException) {
    return paramConcurrentModificationException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbpj.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */