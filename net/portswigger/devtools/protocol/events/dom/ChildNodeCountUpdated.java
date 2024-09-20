package net.portswigger.devtools.protocol.events.dom;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zl;

@Zsi("net.portswigger.devtools.protocol.events.dom.ChildNodeCountUpdated")
public class ChildNodeCountUpdated implements Zl {
  @Zvd(Zp = "nodeId")
  public final Integer nodeId;
  
  @Zvd(Zp = "childNodeCount")
  public final Integer childNodeCount;
  
  @Zox
  public ChildNodeCountUpdated(@Zc5(Ze = "nodeId") Integer paramInteger1, @Zc5(Ze = "childNodeCount") Integer paramInteger2) {
    this.nodeId = paramInteger1;
    this.childNodeCount = paramInteger2;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\events\dom\ChildNodeCountUpdated.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */