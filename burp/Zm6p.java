package burp;

import java.util.function.Consumer;
import net.portswigger.Zah;
import net.portswigger.Zk_;

class Zm6p implements Zz09 {
  private final Zx5s Z_;
  
  private final Ze3n Zh;
  
  private final Zxs7 Zt;
  
  private final Zk5q ZJ;
  
  private final Consumer<Throwable> Zj;
  
  private final Zqz ZE;
  
  Zm6p(Zx5s paramZx5s, Ze3n paramZe3n, Zxs7 paramZxs7, Zk5q paramZk5q, Consumer<Throwable> paramConsumer, Zqz paramZqz) {
    this.Z_ = paramZx5s;
    this.Zh = paramZe3n;
    this.Zt = paramZxs7;
    this.ZJ = paramZk5q;
    this.Zj = paramConsumer;
    this.ZE = paramZqz;
  }
  
  public void ZC(Zrj paramZrj, Zlsy paramZlsy, Ztpx paramZtpx) {
    ZX(paramZlsy, paramZtpx, this.ZJ);
  }
  
  private void ZX(Zlsy paramZlsy, Ztpx paramZtpx, Zk5q paramZk5q) {
    int i = Zx4o.Zm();
    try {
      Zmhe zmhe = this.Z_.ZM(paramZtpx, paramZk5q.ZO.Zn(), this.Zh, this.Zt);
      Zlvf zlvf = zmhe.ZK(Zri7.ZJ(new Zrrb(paramZk5q.Zb.Zg, paramZk5q.Zb.ZL)), Zlp5.Zc().Zd(true));
      try {
        if (!zmhe.ZR())
          try {
            if (!zmhe.ZU()) {
              try {
                ZX(paramZlsy, paramZtpx, paramZk5q);
                if (i != 0)
                  paramZlsy.Ze(this.ZE.Zt(paramZk5q, zlvf, paramZtpx)); 
              } catch (Throwable throwable) {
                throw a(null);
              } 
              return;
            } 
          } catch (Throwable throwable) {
            throw a(null);
          }  
      } catch (Throwable throwable) {
        throw a(null);
      } 
      paramZlsy.Ze(this.ZE.Zt(paramZk5q, zlvf, paramZtpx));
    } catch (Throwable throwable) {
      Zah.Zl(throwable, Zk_.PROCESSED_LATER);
      this.Zj.accept(throwable);
    } 
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zm6p.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */