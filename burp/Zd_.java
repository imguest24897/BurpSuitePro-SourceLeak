package burp;

import java.util.Collection;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zd_ {
  private final Zxa2 Zu;
  
  private final Ze97 Zh;
  
  private final Zswj Za;
  
  private final AtomicInteger Zz = new AtomicInteger();
  
  private final Zrik ZL = new Zrik(this);
  
  public Zd_(Zxa2 paramZxa2, Ze97 paramZe97, Zswj paramZswj) {
    this.Zu = paramZxa2;
    this.Zh = paramZe97;
    this.Za = paramZswj;
  }
  
  public final void Zr() {
    Zm6s<? extends Zm75> zm6s = this.Zu.Z_();
    Zh(zm6s);
    Zuh.Zb((zm6s.ZF() > 0), Zqf.Zr);
  }
  
  private void ZL() {
    Zh(this.Zu.Z_());
  }
  
  private void Zh(Zm6s<? extends Zm75> paramZm6s) {
    if (paramZm6s == null || paramZm6s.ZJ())
      return; 
    this.Zz.getAndAdd(paramZm6s.ZF());
    this.Zh.ZG((Collection<Zlku>)paramZm6s.Za().stream().filter(Zd_::lambda$queueItems$0).map(this::lambda$queueItems$1).collect(Collectors.toSet()));
    this.Zh.Zc((Collection<Zk9r>)paramZm6s.Za().stream().filter(Zd_::lambda$queueItems$2).map(this::lambda$queueItems$3).collect(Collectors.toSet()));
  }
  
  private void Zk(Zmgr paramZmgr) {
    this.Zz.incrementAndGet();
    this.Zh.ZR(this.Za.Zh(paramZmgr, this::ZS, this.ZL));
  }
  
  private void Zv(Zz09 paramZz09) {
    this.Zz.incrementAndGet();
    this.Zh.Z_(this.Za.Zz(paramZz09, this::ZS, this.ZL));
  }
  
  private void ZS() {
    if (this.Zz.decrementAndGet() == 0)
      ZL(); 
  }
  
  private Zk9r lambda$queueItems$3(Zm75 paramZm75) {
    return this.Za.Zz((Zz09)paramZm75, this::ZS, this.ZL);
  }
  
  private static boolean lambda$queueItems$2(Zm75 paramZm75) {
    return paramZm75 instanceof Zz09;
  }
  
  private Zlku lambda$queueItems$1(Zm75 paramZm75) {
    return this.Za.Zh((Zmgr)paramZm75, this::ZS, this.ZL);
  }
  
  private static boolean lambda$queueItems$0(Zm75 paramZm75) {
    return paramZm75 instanceof Zmgr;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zd_.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */