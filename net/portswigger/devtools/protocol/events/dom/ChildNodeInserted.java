package net.portswigger.devtools.protocol.events.dom;

import burp.Zbqc;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zl;
import net.portswigger.devtools.protocol.types.dom.Node;

@Zsi("net.portswigger.devtools.protocol.events.dom.ChildNodeInserted")
public class ChildNodeInserted implements Zl {
  @Zvd(Zp = "parentNodeId")
  public final Integer parentNodeId;
  
  @Zvd(Zp = "previousNodeId")
  public final Integer previousNodeId;
  
  @Zvd(Zp = "node")
  public final Node node;
  
  @Zox
  public ChildNodeInserted(@Zc5(Ze = "parentNodeId") Integer paramInteger1, @Zc5(Ze = "previousNodeId") Integer paramInteger2, @Zc5(Ze = "node") Node paramNode) {
    String[] arrayOfString = TopLayerElementsUpdated.ZR();
    this.parentNodeId = paramInteger1;
    this.previousNodeId = paramInteger2;
    this.node = paramNode;
    if (Zbqc.Zwu() == null)
      TopLayerElementsUpdated.ZG(new String[4]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\events\dom\ChildNodeInserted.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */