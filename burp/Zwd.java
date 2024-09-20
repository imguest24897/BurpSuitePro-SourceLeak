package burp;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public class Zwd extends Zni implements Zxxx {
  private final AtomicInteger ZQ = new AtomicInteger();
  
  private final AtomicInteger Zi = new AtomicInteger();
  
  private final AtomicInteger Zh = new AtomicInteger();
  
  private final AtomicBoolean Zs;
  
  private final AtomicBoolean ZE;
  
  private final AtomicBoolean ZU;
  
  private final AtomicReference<Zlfa> Zx;
  
  private final AtomicReference<Zefg<Zgxp>> ZL;
  
  public Zwd(Zlfa paramZlfa, Zefg<Zgxp> paramZefg) {
    boolean bool = Zxqc.ZBA();
    this.Zs = new AtomicBoolean();
    this.ZE = new AtomicBoolean();
    this.ZU = new AtomicBoolean();
    this.Zx = new AtomicReference<>(paramZlfa);
    this.ZL = new AtomicReference<>(paramZefg);
    if (bool)
      Zbqc.Zr(new Zbqc[4]); 
  }
  
  public void Zhj() {
    this.ZQ.incrementAndGet();
  }
  
  @Zzvo(1)
  public int ZhM() {
    return this.ZQ.get();
  }
  
  public void ZID(int paramInt) {
    this.ZQ.set(paramInt);
  }
  
  @Zzvo(2)
  public int ZhY() {
    return this.Zi.get();
  }
  
  public void ZIK(int paramInt) {
    this.Zi.set(paramInt);
  }
  
  @Zzvo(3)
  public int Zha() {
    return this.Zh.get();
  }
  
  public int Zhx() {
    return this.Zh.incrementAndGet();
  }
  
  public void ZIU(int paramInt) {
    this.Zh.set(paramInt);
  }
  
  @Zzvo(4)
  public boolean Zh_() {
    return this.Zs.get();
  }
  
  public void ZhQ() {
    this.Zs.set(true);
  }
  
  @Zzvo(5)
  public boolean Zhw() {
    return this.ZE.get();
  }
  
  public void Zby(boolean paramBoolean) {
    this.ZE.set(paramBoolean);
  }
  
  @Zzvo(6)
  public boolean ZhI() {
    return this.ZU.get();
  }
  
  public void Zbd(boolean paramBoolean) {
    this.ZU.set(paramBoolean);
  }
  
  @Zzvo(7)
  public Zlfa Zh5() {
    return this.Zx.get();
  }
  
  public Zzcq<Zgxp> Zhi() {
    return new Zzcq<>(this.ZL.get());
  }
  
  @Zzvo(8)
  private Zefg<Zgxp> ZbA() {
    return this.ZL.get();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zwd.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */