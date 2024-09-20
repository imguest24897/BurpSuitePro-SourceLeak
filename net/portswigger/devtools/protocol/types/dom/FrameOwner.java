package net.portswigger.devtools.protocol.types.dom;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;

@Zsi("net.portswigger.devtools.protocol.types.dom.FrameOwner")
public class FrameOwner {
  @Zvd(Zp = "backendNodeId")
  public final Integer backendNodeId;
  
  @Zvd(Zp = "nodeId")
  @Zj
  public final Integer nodeId;
  
  @Zox
  public FrameOwner(@Zc5(Ze = "backendNodeId") Integer paramInteger1, @Zc5(Ze = "nodeId", ZS = "null") Integer paramInteger2) {
    this.backendNodeId = paramInteger1;
    this.nodeId = paramInteger2;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\dom\FrameOwner.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */