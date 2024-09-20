package burp;

import java.awt.Component;
import java.awt.Window;
import javax.swing.SwingUtilities;

public class Zxxy {
  private final Window ZZ;
  
  private String Za;
  
  private String ZE;
  
  public Zxxy(Window paramWindow) {
    this.ZZ = paramWindow;
  }
  
  public static Zxxy ZZ(Component paramComponent) {
    Window window = SwingUtilities.windowForComponent(paramComponent);
    return new Zxxy(window);
  }
  
  public Zxxy ZF(String paramString) {
    this.ZE = paramString;
    return this;
  }
  
  public Zxxy ZB(String paramString) {
    this.Za = paramString;
    return this;
  }
  
  public Zrhk ZN() {
    Zbv7 zbv7 = new Zbv7(this.Za, this.ZE);
    return new Zrhk(this.ZZ, zbv7);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxxy.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */