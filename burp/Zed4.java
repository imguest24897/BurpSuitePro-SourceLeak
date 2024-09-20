package burp;

import java.time.Duration;
import java.util.function.Consumer;
import net.portswigger.Zsy;

public class Zed4 {
  private final Zgb6 ZM;
  
  private final Zkl6 Zi;
  
  private final Zrgd ZK;
  
  private final Zsy ZA;
  
  private final Zsxe Zx;
  
  private final Consumer<Duration> Zw;
  
  public Zed4(Zgb6 paramZgb6, Zkl6 paramZkl6, Zrgd paramZrgd, Zsy paramZsy, Zsxe paramZsxe, Consumer<Duration> paramConsumer) {
    this.ZM = paramZgb6;
    this.Zi = paramZkl6;
    this.ZK = paramZrgd;
    this.ZA = paramZsy;
    this.Zx = paramZsxe;
    this.Zw = paramConsumer;
  }
  
  public Zqr ZR(Zts5 paramZts5, Zzen paramZzen, Zsil paramZsil, Zmzk paramZmzk, Zthe paramZthe) {
    Zkdj zkdj = new Zkdj(this.ZK, this.ZA, this.Zi, new Zmpt(paramZts5.Zk(), this.Zi.Zt()), this.Zx, new Zef6(this.ZM, this.Zi, paramZts5.Zn()), paramZzen.ZE(), paramZsil.ZC(), this.Zi.ZU(), this.Zw);
    return Zqr.ZX(zkdj, paramZts5.Zk(), paramZts5.Zg(), paramZzen, paramZmzk, paramZthe);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zed4.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */