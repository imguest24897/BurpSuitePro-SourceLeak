package net.portswigger.devtools.protocol.events.webaudio;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zl;
import net.portswigger.devtools.protocol.types.webaudio.BaseAudioContext;

@Zsi("net.portswigger.devtools.protocol.events.webaudio.ContextChanged")
public class ContextChanged implements Zl {
  @Zvd(Zp = "context")
  public final BaseAudioContext context;
  
  @Zox
  public ContextChanged(@Zc5(Ze = "context") BaseAudioContext paramBaseAudioContext) {
    this.context = paramBaseAudioContext;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\events\webaudio\ContextChanged.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */