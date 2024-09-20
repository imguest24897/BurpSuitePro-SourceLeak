package burp;

import java.awt.EventQueue;
import java.util.function.Supplier;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import net.portswigger.Zm2;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zxcj {
  private final Zr_4 ZT;
  
  private final Supplier<Zsc_> Zj;
  
  private final Zgsi Zx;
  
  private final Zze0 ZQ;
  
  public Zxcj(Zr_4 paramZr_4, Supplier<Zsc_> paramSupplier, Zgsi paramZgsi, Zze0 paramZze0) {
    this.ZT = paramZr_4;
    this.Zj = paramSupplier;
    this.Zx = paramZgsi;
    this.ZQ = paramZze0;
  }
  
  public void Zc(String paramString, Zx8r paramZx8r) {
    Zuh.Zb(EventQueue.isDispatchThread(), Zqf.ZF);
    Zraj zraj = this.ZT.<Zraj>ZH(new Zmgi(paramString, paramZx8r));
    Zrw9 zrw9 = new Zrw9(zraj, (BooleanProperty)new SimpleBooleanProperty(false));
    ((Zsc_)this.Zj.get()).Ze(zrw9);
    Zm2.Zo(this.ZQ);
    this.Zx.Ze(zrw9);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxcj.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */