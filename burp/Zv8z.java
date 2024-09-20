package burp;

import java.util.concurrent.atomic.AtomicInteger;

public class Zv8z {
  private final Ztic Zc;
  
  private final AtomicInteger Zl;
  
  public Zv8z(Ztic paramZtic) {
    this.Zc = paramZtic;
    this.Zl = new AtomicInteger(paramZtic.Zrn());
  }
  
  public int Zz() {
    return this.Zl.getAndUpdate(this::lambda$getAndIncrement$0);
  }
  
  public int Zb() {
    return this.Zl.get();
  }
  
  private int lambda$getAndIncrement$0(int paramInt) {
    int i = paramInt + 1;
    this.Zc.Zf(i);
    return i;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zv8z.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */