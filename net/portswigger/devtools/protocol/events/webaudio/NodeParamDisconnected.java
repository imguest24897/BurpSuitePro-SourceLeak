package net.portswigger.devtools.protocol.events.webaudio;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;
import net.portswigger.devtools.protocol.Zl;

@Zsi("net.portswigger.devtools.protocol.events.webaudio.NodeParamDisconnected")
public class NodeParamDisconnected implements Zl {
  @Zvd(Zp = "contextId")
  public final String contextId;
  
  @Zvd(Zp = "sourceId")
  public final String sourceId;
  
  @Zvd(Zp = "destinationId")
  public final String destinationId;
  
  @Zvd(Zp = "sourceOutputIndex")
  @Zj
  public final Double sourceOutputIndex;
  
  @Zox
  public NodeParamDisconnected(@Zc5(Ze = "contextId") String paramString1, @Zc5(Ze = "sourceId") String paramString2, @Zc5(Ze = "destinationId") String paramString3, @Zc5(Ze = "sourceOutputIndex", ZS = "null") Double paramDouble) {
    this.contextId = paramString1;
    this.sourceId = paramString2;
    this.destinationId = paramString3;
    this.sourceOutputIndex = paramDouble;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\events\webaudio\NodeParamDisconnected.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */