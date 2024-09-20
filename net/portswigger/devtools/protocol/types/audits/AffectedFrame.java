package net.portswigger.devtools.protocol.types.audits;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;

@Zsi("net.portswigger.devtools.protocol.types.audits.AffectedFrame")
public class AffectedFrame {
  @Zvd(Zp = "frameId")
  public final String frameId;
  
  @Zox
  public AffectedFrame(@Zc5(Ze = "frameId") String paramString) {
    this.frameId = paramString;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\audits\AffectedFrame.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */