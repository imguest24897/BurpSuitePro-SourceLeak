package net.portswigger.devtools.protocol.events.overlay;

import burp.Zbqc;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zl;

@Zsi("net.portswigger.devtools.protocol.events.overlay.NodeHighlightRequested")
public class NodeHighlightRequested implements Zl {
  @Zvd(Zp = "nodeId")
  public final Integer nodeId;
  
  @Zox
  public NodeHighlightRequested(@Zc5(Ze = "nodeId") Integer paramInteger) {
    this.nodeId = paramInteger;
    boolean bool = ScreenshotRequested.ZZ();
    if (bool)
      Zbqc.Zr(new Zbqc[3]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\events\overlay\NodeHighlightRequested.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */