package net.portswigger.devtools.protocol.events.overlay;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zl;

@Zsi("net.portswigger.devtools.protocol.events.overlay.InspectNodeRequested")
public class InspectNodeRequested implements Zl {
  @Zvd(Zp = "backendNodeId")
  public final Integer backendNodeId;
  
  @Zox
  public InspectNodeRequested(@Zc5(Ze = "backendNodeId") Integer paramInteger) {
    this.backendNodeId = paramInteger;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\events\overlay\InspectNodeRequested.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */