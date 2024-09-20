package burp;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import net.portswigger.Zsy;

public class Zb4l {
  private final Zsy ZP;
  
  private final Zmz6 Zc;
  
  private final Zbza Zg;
  
  private final List<Zx4o> Ze;
  
  public Zb4l(Zsy paramZsy, Zmz6 paramZmz6, Zbza paramZbza) {
    this.ZP = paramZsy;
    this.Zc = paramZmz6;
    this.Zg = paramZbza;
    String[] arrayOfString = Zz2p.ZC();
    this.Ze = new CopyOnWriteArrayList<>();
    if (Zbqc.Zwu() == null)
      Zz2p.ZJ(new String[2]); 
  }
  
  public synchronized void ZS(Zx4o paramZx4o) {
    String[] arrayOfString = Zz2p.ZC();
    if (paramZx4o.Zc()) {
      this.Ze.add(paramZx4o);
      if (arrayOfString != null) {
        paramZx4o.Zn(this::lambda$report$0);
        return;
      } 
      return;
    } 
    paramZx4o.Zn(this::lambda$report$0);
  }
  
  public Ztr ZQ() {
    return new Ztr(this.ZP, this.Ze);
  }
  
  private void lambda$report$0(Zx_5 paramZx_5) {
    this.Zc.Zk(paramZx_5, this.Zg);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zb4l.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */