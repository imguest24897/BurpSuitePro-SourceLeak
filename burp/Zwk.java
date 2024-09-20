package burp;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public class Zwk extends Zni implements Zz1y {
  private final AtomicReference<Zzyg> Zn;
  
  private final AtomicInteger Zw;
  
  private final AtomicInteger ZJ;
  
  public Zwk(Zzyg paramZzyg) {
    this.Zn = new AtomicReference<>(paramZzyg);
    Zbqc[] arrayOfZbqc = Zxqa.Zb3();
    this.Zw = new AtomicInteger();
    this.ZJ = new AtomicInteger();
    if (arrayOfZbqc == null)
      Zbqc.Zr(new Zbqc[1]); 
  }
  
  @Zzvo(1)
  public Zzyg Zf7() {
    return this.Zn.get();
  }
  
  @Zzvo(2)
  public int ZfC() {
    return this.Zw.get();
  }
  
  public void ZMk(int paramInt) {
    this.Zw.set(paramInt);
  }
  
  @Zzvo(3)
  public int Zfh() {
    return this.ZJ.get();
  }
  
  public void ZMl(int paramInt) {
    this.ZJ.set(paramInt);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zwk.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */