package net.portswigger.devtools.protocol.events.target;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zl;
import net.portswigger.devtools.protocol.types.target.TargetInfo;

@Zsi("net.portswigger.devtools.protocol.events.target.TargetInfoChanged")
public class TargetInfoChanged implements Zl {
  @Zvd(Zp = "targetInfo")
  public final TargetInfo targetInfo;
  
  @Zox
  public TargetInfoChanged(@Zc5(Ze = "targetInfo") TargetInfo paramTargetInfo) {
    this.targetInfo = paramTargetInfo;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\events\target\TargetInfoChanged.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */