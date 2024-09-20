package burp;

import java.util.Iterator;
import java.util.NoSuchElementException;

class Zk55 implements Iterator<T> {
  private Zefg<Zrte<T>> ZQ;
  
  private int ZS;
  
  private int Zx;
  
  private int Zs;
  
  private Zrte<T> ZK;
  
  private int Za;
  
  private int Zo;
  
  private int Zp;
  
  final Zx29 ZW;
  
  private Zk55(Zx29 paramZx29) {
    this(paramZx29, 0);
  }
  
  private Zk55(Zx29 paramZx29, int paramInt) {
    Zf(paramInt);
  }
  
  private void Zf(int paramInt) {
    this.ZQ = this.ZW.Z_();
    this.ZS = this.ZQ.size();
    this.Zx = this.ZW.Zg();
    this.Zs = this.ZW.size();
    if (this.Zs > 0) {
      int i = paramInt + this.ZW.ZI();
      this.Za = i / this.Zx;
      this.Zo = i % this.Zx;
      this.ZK = this.ZQ.get(this.Za);
    } 
    this.Zp = paramInt;
  }
  
  public boolean hasNext() {
    try {
    
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return (this.Zp < this.Zs);
  }
  
  public T Zl() {
    try {
      if (!hasNext())
        throw new NoSuchElementException(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    T t = this.ZK.ZdF(this.Zo++);
    try {
      if (this.Zo >= this.Zx)
        try {
          this.Zo = 0;
          if (++this.Za < this.ZS)
            this.ZK = this.ZQ.get(this.Za); 
        } catch (NoSuchElementException noSuchElementException) {
          throw a(null);
        }  
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    this.Zp++;
    return t;
  }
  
  public void remove() {
    try {
      if (this.Zp == 0)
        throw new IllegalStateException(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    this.ZW.ZGx(--this.Zp);
    Zf(this.Zp);
  }
  
  private static NoSuchElementException a(NoSuchElementException paramNoSuchElementException) {
    return paramNoSuchElementException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zk55.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */