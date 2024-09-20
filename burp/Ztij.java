package burp;

import java.util.Collections;
import java.util.Objects;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import net.portswigger.Zs4;
import net.portswigger.Zsy;

public class Ztij {
  private final Zsy Zt;
  
  private final Zkl6 Zd;
  
  private final Zx5s Zf;
  
  private final Zz2p ZU;
  
  private final Ztit ZW;
  
  public Ztij(Zrgd paramZrgd, Zsy paramZsy, Zs4 paramZs4, Zkl6 paramZkl6, Zkq4 paramZkq4, Ztks paramZtks, Zzs1 paramZzs1, Zmdu paramZmdu, Zx5s paramZx5s, int paramInt, Zskh paramZskh, BiConsumer<Zb09, Throwable> paramBiConsumer, Zl5x paramZl5x, long paramLong, Zbza paramZbza, Zsoh paramZsoh, Zz28 paramZz28, Zlli<Zt13> paramZlli) {
    this.Zt = paramZsy;
    this.Zd = paramZkl6;
    this.Zf = paramZx5s;
    this.ZU = new Zz2p(paramInt, paramZrgd, paramZskh, paramZtks, paramZzs1, new Zb1c(paramZs4), paramZkq4, paramBiConsumer, paramZl5x, paramLong, paramZbza, paramZsoh, paramZz28, paramZlli);
    this.ZW = new Ztit(paramZmdu, paramZkq4);
  }
  
  public void Zr(Ztpx paramZtpx, Ze3n paramZe3n, Zxs7 paramZxs7, Zm7h paramZm7h, Zlsy paramZlsy, Zmz6 paramZmz6, Consumer<Throwable> paramConsumer) {
    int i = Zx4o.Zh();
    if (paramZe3n == null)
      return; 
    Zb4l zb4l = new Zb4l(this.Zt, paramZmz6, paramZe3n.ZM());
    for (Ztbx ztbx : paramZm7h.Zz(paramZxs7)) {
      Objects.requireNonNull(zb4l);
      this.ZU.Zf(paramZtpx, ztbx.Zf, Collections.singletonList(Zlki.Zx(ztbx.Zz.ZI())), ztbx.ZP, ztbx.Zt, this.ZW.ZA(zb4l::ZS, paramZxs7, ztbx.ZL().ZV(), ztbx.ZL().ZY(), ztbx, Zkv7.DO_FOLLOWUPS), Zsll.TRACING, ztbx.ZL().ZY());
      if (i == 0)
        break; 
    } 
    Ztr ztr = zb4l.ZQ();
    if (ztr.hasNext()) {
      Zqz zqz = new Zqz(this.Zd, this.ZU, this.ZW, paramZe3n, paramZmz6, paramZxs7, this.Zf, ztr, paramConsumer);
      paramZlsy.ZR(new Zm6p(this.Zf, paramZe3n, paramZxs7, ztr.Zx(), paramConsumer, zqz));
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztij.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */