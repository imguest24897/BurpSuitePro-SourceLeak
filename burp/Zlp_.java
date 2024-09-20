package burp;

import java.awt.Window;
import java.util.function.Supplier;
import net.portswigger.Zm2;

public class Zlp_ implements Zt2q {
  private final Za ZJ;
  
  private final Supplier<Window> ZB;
  
  private final String Zm;
  
  private static int Zu;
  
  public Zlp_(Za paramZa, Supplier<Window> paramSupplier, String paramString) {
    this.ZJ = paramZa;
    this.ZB = paramSupplier;
    this.Zm = paramString;
  }
  
  public void Zo() {
    Zm2.ZC(Zrrh.SUITE_SETTINGS_PANEL_OPTIONS_SAVE);
    this.ZJ.Zs(this.ZB.get(), this.Zm);
  }
  
  public static void ZF(int paramInt) {
    Zu = paramInt;
  }
  
  public static int Zd() {
    return Zu;
  }
  
  public static int ZX() {
    int i = Zd();
    return (i == 0) ? 14 : 0;
  }
  
  static {
    if (ZX() == 0)
      ZF(95); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlp_.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */