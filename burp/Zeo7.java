package burp;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicBoolean;

class Zeo7 implements Iterator<T> {
  final Iterator<T> Zc = (Iterator)new Zrf3<>((Zl5x)this.Zh.ZM, this.Zh.Zs, this.Zh.ZR() ? new Zm_z<>((Zl5x)this.Zh.ZM, this.Zh.Zi().iterator(), this.Zh.ZB) : this.Zh.Zi().iterator());
  
  final AtomicBoolean Zy = new AtomicBoolean();
  
  final Zeli Zh;
  
  Zeo7(Zeli paramZeli) {}
  
  public boolean hasNext() {
    try {
      if (!this.Zc.hasNext()) {
        try {
          if (!this.Zy.get());
        } catch (NoSuchElementException noSuchElementException) {
          throw a(null);
        } 
        return false;
      } 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
  }
  
  public T Zf() {
    try {
      if (this.Zc.hasNext())
        return this.Zc.next(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if (this.Zy.compareAndSet(false, true))
        return (T)Zgvx.ZV((Zl5x)this.Zh.ZM, this.Zh.ZL, this.Zh.Zk, this.Zh.ZA); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    throw new NoSuchElementException();
  }
  
  private static NoSuchElementException a(NoSuchElementException paramNoSuchElementException) {
    return paramNoSuchElementException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zeo7.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */