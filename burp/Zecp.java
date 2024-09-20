package burp;

import java.time.Duration;
import java.util.Optional;
import java.util.function.Consumer;

public class Zecp implements Zz95 {
  private final Zkl6 Zh;
  
  private final Ztb7 ZT;
  
  private final Consumer<Duration> Zd;
  
  public Zecp(Zkl6 paramZkl6, Ztb7 paramZtb7, Consumer<Duration> paramConsumer) {
    this.Zh = paramZkl6;
    this.ZT = paramZtb7;
    this.Zd = paramConsumer;
  }
  
  public Zenv ZM(Zmzk paramZmzk, Zrps paramZrps, Zxtv paramZxtv, Zl1v paramZl1v) {
    Optional<Zrt_> optional = Optional.ofNullable(this.ZT.Zc(paramZmzk));
    Zmzk zmzk = optional.<Zmzk>map(Zrt_::ZH).orElse(paramZmzk);
    Zruz zruz = new Zruz(paramZmzk, zmzk, this.Zh.ZG(), paramZrps);
    return new Zs47(this.Zd, zruz);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zecp.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */