package net.portswigger.devtools.client.impl;

import java.util.Map;
import net.portswigger.browser.Zjl;
import net.portswigger.devtools.protocol.types.input.DispatchMouseEventPointerType;

public class Zxm implements Zx4<DispatchMouseEventPointerType, Zjl> {
  private static final Zxm ZY = new Zxm();
  
  private static final Map<DispatchMouseEventPointerType, Zjl> Zy = Map.of(DispatchMouseEventPointerType.MOUSE, Zjl.MOUSE, DispatchMouseEventPointerType.PEN, Zjl.PEN);
  
  public static Zxm ZW() {
    return ZY;
  }
  
  public Map<DispatchMouseEventPointerType, Zjl> Zp() {
    return Zy;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\client\impl\Zxm.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */