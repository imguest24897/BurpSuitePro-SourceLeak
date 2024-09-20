package burp;

import java.util.Iterator;

class Zly2 implements Iterator<T> {
  final int ZX;
  
  final Ztj9 ZE;
  
  Zly2(Ztj9 paramZtj9, int paramInt) {}
  
  public boolean hasNext() {
    return (this.ZE.size() > this.ZX && !this.ZE.empty());
  }
  
  public T next() {
    return hasNext() ? this.ZE.pop() : null;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zly2.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */