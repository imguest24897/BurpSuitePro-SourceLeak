package burp;

import java.util.concurrent.atomic.AtomicInteger;

public class Zlz4 implements Zs79 {
  private final Zl7h Zp;
  
  private final AtomicInteger ZT;
  
  private final AtomicInteger ZN;
  
  public Zlz4(Zl7h paramZl7h) {
    this.Zp = paramZl7h;
    String str = Zb_x.ZE();
    this.ZT = new AtomicInteger(paramZl7h.ZVI());
    this.ZN = new AtomicInteger(paramZl7h.ZVp());
    if (str != null)
      Zbqc.Zr(new Zbqc[1]); 
  }
  
  public void ZT() {
    this.Zp.ZJ(this.ZT.incrementAndGet());
  }
  
  public void Z_() {
    this.Zp.Zm(this.ZN.incrementAndGet());
  }
  
  public int ZO() {
    return this.Zp.ZVI();
  }
  
  public int Zc() {
    return this.Zp.ZVp();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlz4.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */