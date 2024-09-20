package net.portswigger.devtools.protocol.events.webaudio;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zl;

@Zsi("net.portswigger.devtools.protocol.events.webaudio.ContextWillBeDestroyed")
public class ContextWillBeDestroyed implements Zl {
  @Zvd(Zp = "contextId")
  public final String contextId;
  
  @Zox
  public ContextWillBeDestroyed(@Zc5(Ze = "contextId") String paramString) {
    this.contextId = paramString;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\events\webaudio\ContextWillBeDestroyed.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */