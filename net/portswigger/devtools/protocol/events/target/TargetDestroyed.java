package net.portswigger.devtools.protocol.events.target;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zl;

@Zsi("net.portswigger.devtools.protocol.events.target.TargetDestroyed")
public class TargetDestroyed implements Zl {
  @Zvd(Zp = "targetId")
  public final String targetId;
  
  @Zox
  public TargetDestroyed(@Zc5(Ze = "targetId") String paramString) {
    this.targetId = paramString;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\events\target\TargetDestroyed.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */