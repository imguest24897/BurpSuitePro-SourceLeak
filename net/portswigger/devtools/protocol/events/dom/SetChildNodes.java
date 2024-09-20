package net.portswigger.devtools.protocol.events.dom;

import java.util.List;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zl;
import net.portswigger.devtools.protocol.types.dom.Node;

@Zsi("net.portswigger.devtools.protocol.events.dom.SetChildNodes")
public class SetChildNodes implements Zl {
  @Zvd(Zp = "parentId")
  public final Integer parentId;
  
  @Zvd(Zp = "nodes")
  public final List<Node> nodes;
  
  @Zox
  public SetChildNodes(@Zc5(Ze = "parentId") Integer paramInteger, @Zc5(Ze = "nodes") List<Node> paramList) {
    this.parentId = paramInteger;
    this.nodes = paramList;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\events\dom\SetChildNodes.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */