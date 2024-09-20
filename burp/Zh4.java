package burp;

import java.util.Collection;
import java.util.Set;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

class Zh4 extends Zni implements Zvw {
  @Zzvo(1)
  private final Zefg<Zrim> Zk;
  
  @Zzvo(2)
  private final Zrfx<Zeu9> ZH;
  
  Zh4(Zrfx<Zeu9> paramZrfx, Zefg<Zrim> paramZefg) {
    Zuh.Zb((paramZefg.size() != 0), Zqf.Zk);
    this.ZH = paramZrfx;
    this.Zk = paramZefg;
  }
  
  public void ZC(Zeu9 paramZeu9) {
    Ztu7.ZV(paramZeu9, this.Zk, this.ZH);
  }
  
  public void Zn(Zeu9 paramZeu9, Zbj5 paramZbj5) {
    Ztu7.ZM(paramZeu9, paramZbj5, this.Zk);
  }
  
  public Collection<Zeu9> Zh(Zbj5 paramZbj5) {
    return Ztu7.Zw(paramZbj5, this.Zk);
  }
  
  public Set<Zeu9> ZLD() {
    return this.ZH;
  }
  
  public Zeu4<? extends Zrim> ZF() {
    return (Zeu4)Zvw.Zs;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zh4.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */