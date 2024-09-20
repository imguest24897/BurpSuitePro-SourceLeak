package burp;

import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Zqd implements Zlaz {
  private final Zkrr Zl;
  
  private final Zbje Zs;
  
  private final Runnable Zd;
  
  public Zqd(Zkrr paramZkrr, Zbje paramZbje, Runnable paramRunnable) {
    this.Zl = paramZkrr;
    String[] arrayOfString = Zttc.Ze();
    this.Zs = paramZbje;
    this.Zd = paramRunnable;
    if (Zbqc.Zwu() == null)
      Zttc.Zx(new String[2]); 
  }
  
  public void Zf(Zrj paramZrj, Zlsy paramZlsy, Ztpx paramZtpx, Zz4_ paramZz4_) {
    if (this.Zs.ZJ())
      try {
        this.Zd.run();
        this.Zl.ZU(paramZrj, paramZtpx, paramZz4_);
        this.Zs.Zv();
      } catch (Throwable throwable) {
        Zah.Zl(throwable, Zk_.PROCESSED_LATER);
        this.Zs.Zq(this.Zl, throwable);
      }  
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zqd.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */