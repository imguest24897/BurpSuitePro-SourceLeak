package net.portswigger.devtools.protocol.events.webaudio;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zl;
import net.portswigger.devtools.protocol.types.webaudio.AudioNode;

@Zsi("net.portswigger.devtools.protocol.events.webaudio.AudioNodeCreated")
public class AudioNodeCreated implements Zl {
  @Zvd(Zp = "node")
  public final AudioNode node;
  
  @Zox
  public AudioNodeCreated(@Zc5(Ze = "node") AudioNode paramAudioNode) {
    this.node = paramAudioNode;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\events\webaudio\AudioNodeCreated.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */