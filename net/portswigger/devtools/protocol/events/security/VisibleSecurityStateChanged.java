package net.portswigger.devtools.protocol.events.security;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zl;
import net.portswigger.devtools.protocol.Zy;
import net.portswigger.devtools.protocol.types.security.VisibleSecurityState;

@Zy
@Zsi("net.portswigger.devtools.protocol.events.security.VisibleSecurityStateChanged")
public class VisibleSecurityStateChanged implements Zl {
  @Zvd(Zp = "visibleSecurityState")
  public final VisibleSecurityState visibleSecurityState;
  
  private static String Zg;
  
  @Zox
  public VisibleSecurityStateChanged(@Zc5(Ze = "visibleSecurityState") VisibleSecurityState paramVisibleSecurityState) {
    this.visibleSecurityState = paramVisibleSecurityState;
  }
  
  public static void ZX(String paramString) {
    Zg = paramString;
  }
  
  public static String Zr() {
    return Zg;
  }
  
  static {
    if (Zr() != null)
      ZX("RBhicb"); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\events\security\VisibleSecurityStateChanged.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */