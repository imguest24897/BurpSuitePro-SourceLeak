package net.portswigger.devtools.protocol.events.dom;

import java.util.List;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zl;
import net.portswigger.devtools.protocol.Zy;
import net.portswigger.devtools.protocol.types.dom.BackendNode;

@Zy
@Zsi("net.portswigger.devtools.protocol.events.dom.DistributedNodesUpdated")
public class DistributedNodesUpdated implements Zl {
  @Zvd(Zp = "insertionPointId")
  public final Integer insertionPointId;
  
  @Zvd(Zp = "distributedNodes")
  public final List<BackendNode> distributedNodes;
  
  @Zox
  public DistributedNodesUpdated(@Zc5(Ze = "insertionPointId") Integer paramInteger, @Zc5(Ze = "distributedNodes") List<BackendNode> paramList) {
    this.insertionPointId = paramInteger;
    this.distributedNodes = paramList;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\events\dom\DistributedNodesUpdated.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */