package net.portswigger.devtools.protocol.events.webaudio;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zl;

@Zsi("net.portswigger.devtools.protocol.events.webaudio.AudioListenerWillBeDestroyed")
public class AudioListenerWillBeDestroyed implements Zl {
  @Zvd(Zp = "contextId")
  public final String contextId;
  
  @Zvd(Zp = "listenerId")
  public final String listenerId;
  
  @Zox
  public AudioListenerWillBeDestroyed(@Zc5(Ze = "contextId") String paramString1, @Zc5(Ze = "listenerId") String paramString2) {
    this.contextId = paramString1;
    this.listenerId = paramString2;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\events\webaudio\AudioListenerWillBeDestroyed.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */