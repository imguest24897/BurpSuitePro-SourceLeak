package net.portswigger.devtools.protocol.events.dom;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zl;

@Zsi("net.portswigger.devtools.protocol.events.dom.ChildNodeRemoved")
public class ChildNodeRemoved implements Zl {
  @Zvd(Zp = "parentNodeId")
  public final Integer parentNodeId;
  
  @Zvd(Zp = "nodeId")
  public final Integer nodeId;
  
  @Zox
  public ChildNodeRemoved(@Zc5(Ze = "parentNodeId") Integer paramInteger1, @Zc5(Ze = "nodeId") Integer paramInteger2) {
    this.parentNodeId = paramInteger1;
    this.nodeId = paramInteger2;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\events\dom\ChildNodeRemoved.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */