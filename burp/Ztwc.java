package burp;

import java.util.Objects;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Ztwc implements Zxy1, Ztu3 {
  private final BlockingQueue<Zs1a> ZC = new LinkedBlockingQueue<>();
  
  private final Zlrw ZB;
  
  private final Zeuj Zh;
  
  public Ztwc(Ztwv paramZtwv, Zgb6 paramZgb6) {
    String[] arrayOfString = Zzxk.Zj();
    this.Zh = new Zeuj();
    Objects.requireNonNull(paramZgb6);
    this.ZB = new Zlrw(this.ZC, this.Zh, paramZgb6::Zqj);
    paramZtwv.Zx(this.ZB);
    if (arrayOfString != null)
      Zbqc.Zr(new Zbqc[5]); 
  }
  
  public void Zn(Zzxk paramZzxk, Zmzk paramZmzk) {
    this.ZC.add(new Zs1a(paramZzxk, paramZmzk));
  }
  
  public void ZY() {
    this.ZB.ZF();
    this.Zh.ZV();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztwc.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */