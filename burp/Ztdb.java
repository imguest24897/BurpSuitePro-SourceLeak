package burp;

import java.awt.Component;
import java.awt.Window;

public interface Ztdb {
  String ZR();
  
  default void ZZ(Component paramComponent) {
    String str = ZR();
    Window window = Zt2m.ZF(paramComponent);
    Zke4.Zt(window, str, true);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztdb.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */