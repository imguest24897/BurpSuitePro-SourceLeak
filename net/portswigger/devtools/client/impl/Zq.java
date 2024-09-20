package net.portswigger.devtools.client.impl;

import java.util.Map;
import net.portswigger.browser.Zd7;
import net.portswigger.devtools.protocol.types.input.DispatchMouseEventType;

public class Zq implements Zx4<DispatchMouseEventType, Zd7> {
  private static final Zq ZH = new Zq();
  
  private static final Map<DispatchMouseEventType, Zd7> Zl = Map.of(DispatchMouseEventType.MOUSE_PRESSED, Zd7.MOUSE_PRESSED, DispatchMouseEventType.MOUSE_RELEASED, Zd7.MOUSE_RELEASED, DispatchMouseEventType.MOUSE_MOVED, Zd7.MOUSE_MOVED, DispatchMouseEventType.MOUSE_WHEEL, Zd7.MOUSE_WHEEL);
  
  public static Zq Zq() {
    return ZH;
  }
  
  public Map<DispatchMouseEventType, Zd7> Zp() {
    return Zl;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\client\impl\Zq.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */