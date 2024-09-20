package burp;

import java.util.Objects;
import java.util.function.BooleanSupplier;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Zmio extends Zmuc<Zzme> {
  private final Zr57 ZX;
  
  private final Zb1t ZV;
  
  private Zs0y<Zzme> Zf = new Zsa3<>();
  
  private static boolean ZT;
  
  public Zmio(Zlqk paramZlqk, Zr57 paramZr57, Zb1t paramZb1t) {
    super(new Zg2r(), paramZlqk);
    this.ZX = paramZr57;
    this.ZV = paramZb1t;
  }
  
  public void ZZ(BooleanSupplier paramBooleanSupplier, Runnable paramRunnable) {
    try {
      this.Zf = this.ZV.Zg(this.ZX.ZQ());
      Objects.requireNonNull(this.Zf);
      Zmts zmts = new Zmts(this, this.Zf::ZH, paramBooleanSupplier);
      Zgxy.ZH(zmts, Zv8r.ORGANIZER_EDITED_VIEW_FILTER_TIMER);
      Zgxt.Zu(zmts, paramRunnable);
      ZI(zmts);
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
    } 
  }
  
  public static void ZT(boolean paramBoolean) {
    ZT = paramBoolean;
  }
  
  public static boolean Zu() {
    return ZT;
  }
  
  public static boolean ZI() {
    boolean bool = Zu();
    return !bool;
  }
  
  static {
    if (Zu())
      ZT(true); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmio.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */