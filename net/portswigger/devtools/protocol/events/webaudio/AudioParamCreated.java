package net.portswigger.devtools.protocol.events.webaudio;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zl;
import net.portswigger.devtools.protocol.types.webaudio.AudioParam;

@Zsi("net.portswigger.devtools.protocol.events.webaudio.AudioParamCreated")
public class AudioParamCreated implements Zl {
  @Zvd(Zp = "param")
  public final AudioParam param;
  
  @Zox
  public AudioParamCreated(@Zc5(Ze = "param") AudioParam paramAudioParam) {
    this.param = paramAudioParam;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\events\webaudio\AudioParamCreated.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */