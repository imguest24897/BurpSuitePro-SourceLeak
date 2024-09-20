package net.portswigger.devtools.protocol.events.dom;

import net.portswigger.Zsi;
import net.portswigger.devtools.protocol.Zl;
import net.portswigger.devtools.protocol.Zy;

@Zy
@Zsi("net.portswigger.devtools.protocol.events.dom.TopLayerElementsUpdated")
public class TopLayerElementsUpdated implements Zl {
  private static String[] Zx;
  
  public static void ZG(String[] paramArrayOfString) {
    Zx = paramArrayOfString;
  }
  
  public static String[] ZR() {
    return Zx;
  }
  
  static {
    if (ZR() != null)
      ZG(new String[4]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\events\dom\TopLayerElementsUpdated.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */