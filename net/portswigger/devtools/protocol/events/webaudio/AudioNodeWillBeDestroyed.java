package net.portswigger.devtools.protocol.events.webaudio;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zl;

@Zsi("net.portswigger.devtools.protocol.events.webaudio.AudioNodeWillBeDestroyed")
public class AudioNodeWillBeDestroyed implements Zl {
  @Zvd(Zp = "contextId")
  public final String contextId;
  
  @Zvd(Zp = "nodeId")
  public final String nodeId;
  
  @Zox
  public AudioNodeWillBeDestroyed(@Zc5(Ze = "contextId") String paramString1, @Zc5(Ze = "nodeId") String paramString2) {
    this.contextId = paramString1;
    this.nodeId = paramString2;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\events\webaudio\AudioNodeWillBeDestroyed.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */