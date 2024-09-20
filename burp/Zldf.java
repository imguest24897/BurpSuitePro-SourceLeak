package burp;

import java.util.function.Consumer;
import net.portswigger.Zfb;

public class Zldf {
  private final Zkkx ZT;
  
  private final Consumer<Zbzm> ZE;
  
  public Zldf(Zmdu paramZmdu, Consumer<Zbzm> paramConsumer) {
    this(new Zkkn(paramZmdu), paramConsumer);
  }
  
  public Zldf(Zkkx paramZkkx, Consumer<Zbzm> paramConsumer) {
    this.ZT = paramZkkx;
    this.ZE = paramConsumer;
  }
  
  public void Zm(Zfb paramZfb) {
    this.ZT.ZU(paramZfb).stream().peek(this::lambda$report$0).forEach(this.ZE);
  }
  
  private void lambda$report$0(Zbzm paramZbzm) {
    paramZbzm.Zt(new Zztp(this));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zldf.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */