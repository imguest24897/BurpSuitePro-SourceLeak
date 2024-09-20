package burp;

import java.util.concurrent.atomic.AtomicBoolean;

public class Zmyl implements Zmxz {
  private final Zmxz Zu;
  
  public Zmyl(Zmxz paramZmxz) {
    this.Zu = paramZmxz;
  }
  
  public Zl4m Zi(Zrdb paramZrdb1, Zrdb paramZrdb2, Zz1h paramZz1h) {
    return Zc(paramZrdb1.Za7(), paramZrdb2.Za7()) ? Zl4m.Zf : this.Zu.Zi(paramZrdb1, paramZrdb2, paramZz1h);
  }
  
  boolean Zc(Ztub paramZtub1, Ztub paramZtub2) {
    AtomicBoolean atomicBoolean = new AtomicBoolean(true);
    paramZtub1.ZT(new Zr26(this, paramZtub2, atomicBoolean));
    return (atomicBoolean.get() && paramZtub2.ZQ() > paramZtub1.ZQ());
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmyl.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */