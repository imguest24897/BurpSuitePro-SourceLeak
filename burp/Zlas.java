package burp;

import java.util.function.Supplier;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Zlas {
  public static final Zrij Zj = Zrij.Zx.ZV(1);
  
  private final Supplier<Zka2> Zg;
  
  private final Zr69 ZN;
  
  private Zka2 ZW;
  
  Zlas(Supplier<Zka2> paramSupplier, Zlli<Zt13> paramZlli, Zlli<Zt18> paramZlli1, Zr69 paramZr69) {
    this.Zg = paramSupplier;
    this.ZN = paramZr69;
    Zts2.Zr().<Void>ZA(paramZlli1, Zt18.ZW, this::lambda$new$0, Zj).<Void>Zd(paramZlli1, Zt18.ZW, this::lambda$new$0, Zj).Zd(paramZlli, Zt13.Zd, this::lambda$new$0, Zj);
  }
  
  private synchronized Zka2 ZS() {
    if (this.ZW == null)
      this.ZW = this.Zg.get(); 
    return this.ZW;
  }
  
  public synchronized void Zk() {
    try {
      if (this.ZN.Zt())
        return; 
    } catch (Zeij zeij) {
      throw a(null);
    } 
    if (this.ZW != null)
      try {
        this.ZW.ZM();
      } catch (Zeij zeij) {
        Zah.Zl(zeij, Zk_.COMMON_RUNTIME_FAILURE);
        this.ZW = null;
      }  
  }
  
  public Zm0f ZX(Zl_ paramZl_, Zlru paramZlru, Ztpx paramZtpx) {
    return ZS().ZF(paramZl_, paramZlru, paramZtpx);
  }
  
  public Zm0f Z_(Zgyy paramZgyy, Zlru paramZlru, Ztpx paramZtpx) {
    return ZS().ZU(paramZgyy, paramZlru, paramZtpx);
  }
  
  private synchronized void Zp() {
    if (this.ZW != null) {
      this.ZW.ZW();
      this.ZW = null;
    } 
  }
  
  private void lambda$new$0(Zxr8 paramZxr8) {
    Zp();
  }
  
  private static Zeij a(Zeij paramZeij) {
    return paramZeij;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlas.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */