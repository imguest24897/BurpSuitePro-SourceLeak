package burp;

import java.util.concurrent.atomic.AtomicBoolean;

class Zr0r<T extends Zd7> {
  private final Zxet<T> ZW;
  
  private final AtomicBoolean ZA;
  
  Zr0r(Zxet<T> paramZxet) {
    this.ZW = paramZxet;
    this.ZA = new AtomicBoolean(true);
  }
  
  Zxet<T> Zf(T paramT) {
    this.ZW.ZU(paramT);
    this.ZA.set(false);
    return this.ZW;
  }
  
  boolean ZX() {
    return this.ZA.get();
  }
  
  void ZC() {
    this.ZA.set(true);
  }
  
  public Zxet<T> Za() {
    return this.ZW;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zr0r.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */