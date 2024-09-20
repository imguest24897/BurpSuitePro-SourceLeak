package burp;

import java.awt.Window;
import java.util.function.Supplier;
import net.portswigger.Zm2;

public class Zkcq implements Zt2q {
  private final Zszn ZP;
  
  private final Supplier<Window> ZE;
  
  private final String Zo;
  
  public Zkcq(Zszn paramZszn, Supplier<Window> paramSupplier, String paramString) {
    this.ZP = paramZszn;
    this.ZE = paramSupplier;
    this.Zo = paramString;
  }
  
  public void Zo() {
    Zm2.ZC(Zrrh.SUITE_SETTINGS_PANEL_OPTIONS_LOAD);
    this.ZP.ZQ(this.ZE.get(), this.Zo);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkcq.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */