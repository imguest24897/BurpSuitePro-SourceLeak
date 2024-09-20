package net.portswigger.devtools.protocol.events.webaudio;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zl;
import net.portswigger.devtools.protocol.types.webaudio.AudioListener;

@Zsi("net.portswigger.devtools.protocol.events.webaudio.AudioListenerCreated")
public class AudioListenerCreated implements Zl {
  @Zvd(Zp = "listener")
  public final AudioListener listener;
  
  @Zox
  public AudioListenerCreated(@Zc5(Ze = "listener") AudioListener paramAudioListener) {
    this.listener = paramAudioListener;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\events\webaudio\AudioListenerCreated.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */