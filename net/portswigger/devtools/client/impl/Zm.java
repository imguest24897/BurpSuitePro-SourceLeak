package net.portswigger.devtools.client.impl;

import java.util.Map;
import net.portswigger.browser.Zl;
import net.portswigger.devtools.protocol.types.input.DispatchKeyEventType;

public class Zm implements Zx4<DispatchKeyEventType, Zl> {
  private static final Zm ZO = new Zm();
  
  private static final Map<DispatchKeyEventType, Zl> Zx = Map.of(DispatchKeyEventType.KEY_UP, Zl.KEY_UP, DispatchKeyEventType.KEY_DOWN, Zl.KEY_DOWN, DispatchKeyEventType.RAW_KEY_DOWN, Zl.RAW_KEY_DOWN, DispatchKeyEventType.CHAR, Zl.CHAR);
  
  public static Zm Zw() {
    return ZO;
  }
  
  public Map<DispatchKeyEventType, Zl> Zp() {
    return Zx;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\client\impl\Zm.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */