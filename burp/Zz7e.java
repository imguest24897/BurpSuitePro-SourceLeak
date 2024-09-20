package burp;

import java.time.Duration;
import java.util.Optional;
import java.util.function.Consumer;
import net.portswigger.Zsy;

class Zz7e implements Zz95 {
  private final Zrgd Zg;
  
  private final Zsy ZE;
  
  private final Zkl6 ZS;
  
  private final Ztb7 Zp;
  
  private final Zsxe Zc;
  
  private final Zsfe Zl;
  
  private final Zmu_ ZQ;
  
  private final Zeu6 Zk;
  
  private final Ztno Zz;
  
  private final Consumer<Duration> Zu;
  
  Zz7e(Zrgd paramZrgd, Zsy paramZsy, Zkl6 paramZkl6, Ztb7 paramZtb7, Zsxe paramZsxe, Zsfe paramZsfe, Zmu_ paramZmu_, Zeu6 paramZeu6, Ztno paramZtno, Consumer<Duration> paramConsumer) {
    this.Zg = paramZrgd;
    this.ZE = paramZsy;
    this.ZS = paramZkl6;
    this.Zp = paramZtb7;
    this.Zc = paramZsxe;
    this.Zl = paramZsfe;
    this.ZQ = paramZmu_;
    this.Zk = paramZeu6;
    this.Zz = paramZtno;
    this.Zu = paramConsumer;
  }
  
  public Zenv ZM(Zmzk paramZmzk, Zrps paramZrps, Zxtv paramZxtv, Zl1v paramZl1v) {
    Optional<Zrt_> optional = Optional.ofNullable(this.Zp.Zc(paramZmzk));
    Zmzk zmzk = optional.<Zmzk>map(Zrt_::ZH).orElse(paramZmzk);
    Zg6_ zg6_ = new Zg6_(paramZmzk, zmzk, new Zeb6(paramZmzk, new Zrjt(ZK(paramZmzk, zmzk, optional.orElse(null)), this.Zl.ZR(), paramZmzk, paramZrps, this.Zl, this.Zk), this.ZQ, this.Zl, this.Zz), paramZl1v);
    return new Zs47(this.Zu, zg6_);
  }
  
  private Zrk9 ZK(Zmzk paramZmzk1, Zmzk paramZmzk2, Zrt_ paramZrt_) {
    if (paramZrt_ == null)
      return new Zbut(paramZmzk1, this.ZS.Zj(), this.ZS.ZG(), this.Zl); 
    Zkjm zkjm = paramZrt_.ZD();
    String str = paramZmzk1.ZJ1();
    int i = paramZmzk1.ZJO();
    return Zx(zkjm) ? new Zzzf(str, i, this.ZS.ZG(), paramZmzk2, zkjm, this.ZS.ZH(), this.Zc, this.Zg, this.ZE, this.ZQ, this.ZS.Zj(), paramZmzk1, this.Zl) : new Zedj(str, i, this.ZS.ZG(), paramZmzk2, this.Zg, this.Zc, this.ZS.Zj(), paramZmzk1, this.Zl);
  }
  
  private static boolean Zx(Zkjm paramZkjm) {
    return (paramZkjm != null && paramZkjm.Zn() != 0);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zz7e.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */