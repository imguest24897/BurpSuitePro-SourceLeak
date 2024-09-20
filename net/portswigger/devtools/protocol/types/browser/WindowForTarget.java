package net.portswigger.devtools.protocol.types.browser;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;

@Zsi("net.portswigger.devtools.protocol.types.browser.WindowForTarget")
public class WindowForTarget {
  @Zvd(Zp = "windowId")
  public final Integer windowId;
  
  @Zvd(Zp = "bounds")
  public final Bounds bounds;
  
  private static int[] Zi;
  
  @Zox
  public WindowForTarget(@Zc5(Ze = "windowId") Integer paramInteger, @Zc5(Ze = "bounds") Bounds paramBounds) {
    this.windowId = paramInteger;
    this.bounds = paramBounds;
  }
  
  public static void Zt(int[] paramArrayOfint) {
    Zi = paramArrayOfint;
  }
  
  public static int[] Zw() {
    return Zi;
  }
  
  static {
    if (Zw() == null)
      Zt(new int[5]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\browser\WindowForTarget.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */