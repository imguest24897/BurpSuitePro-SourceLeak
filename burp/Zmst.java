package burp;

import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import net.portswigger.Zqf;
import net.portswigger.Zsy;
import net.portswigger.Zuh;

public class Zmst {
  public static Zzkr Zu(Zz4b paramZz4b, Zr_4 paramZr_4, Zz1m<Zt1s> paramZz1m, Zrgd paramZrgd, Zsy paramZsy, Zskh paramZskh) {
    CopyOnWriteArrayList<Zr5_> copyOnWriteArrayList = new CopyOnWriteArrayList();
    AtomicInteger atomicInteger = new AtomicInteger();
    Zr5_ zr5_ = null;
    Iterator<Ztic> iterator = paramZz4b.ZVq().iterator();
    String str = Ztj1.Ze();
    while (iterator.hasNext()) {
      Ztic ztic = iterator.next();
      Ztau ztau = new Ztau(Ztic.ZP(ztic));
      Zs3t zs3t = new Zs3t(ztau);
      Zr5_ zr5_1 = new Zr5_(ztic, ztau, paramZz1m, paramZrgd, paramZsy, paramZskh);
      zs3t.Zl(zr5_1.Zs());
      copyOnWriteArrayList.add(zr5_1);
      if (ztic.Zrb())
        zr5_ = zr5_1; 
      atomicInteger.set(Math.max(atomicInteger.get(), ztic.ZrT()));
      if (str == null)
        break; 
    } 
    Zuh.Zb((zr5_ != null), Zqf.Zr);
    Zuh.Zb(Zepo.ZE(copyOnWriteArrayList), Zqf.Zr);
    Objects.requireNonNull(atomicInteger);
    return new Zzkr(copyOnWriteArrayList, zr5_, atomicInteger::incrementAndGet, paramZz4b, paramZr_4, paramZz1m, paramZrgd, paramZsy, paramZskh);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmst.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */