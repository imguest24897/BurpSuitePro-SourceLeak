package net.portswigger.devtools.protocol.types.webaudio;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;

@Zsi("net.portswigger.devtools.protocol.types.webaudio.AudioListener")
public class AudioListener {
  @Zvd(Zp = "listenerId")
  public final String listenerId;
  
  @Zvd(Zp = "contextId")
  public final String contextId;
  
  @Zox
  public AudioListener(@Zc5(Ze = "listenerId") String paramString1, @Zc5(Ze = "contextId") String paramString2) {
    this.listenerId = paramString1;
    this.contextId = paramString2;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\webaudio\AudioListener.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */