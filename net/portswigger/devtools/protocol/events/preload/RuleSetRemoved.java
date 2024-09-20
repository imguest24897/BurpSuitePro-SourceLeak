package net.portswigger.devtools.protocol.events.preload;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zl;

@Zsi("net.portswigger.devtools.protocol.events.preload.RuleSetRemoved")
public class RuleSetRemoved implements Zl {
  @Zvd(Zp = "id")
  public final String id;
  
  @Zox
  public RuleSetRemoved(@Zc5(Ze = "id") String paramString) {
    this.id = paramString;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\events\preload\RuleSetRemoved.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */