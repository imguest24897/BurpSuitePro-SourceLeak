package net.portswigger.devtools.protocol.types.dom;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;

@Zsi("net.portswigger.devtools.protocol.types.dom.BackendNode")
public class BackendNode {
  @Zvd(Zp = "nodeType")
  public final Integer nodeType;
  
  @Zvd(Zp = "nodeName")
  public final String nodeName;
  
  @Zvd(Zp = "backendNodeId")
  public final Integer backendNodeId;
  
  @Zox
  public BackendNode(@Zc5(Ze = "nodeType") Integer paramInteger1, @Zc5(Ze = "nodeName") String paramString, @Zc5(Ze = "backendNodeId") Integer paramInteger2) {
    this.nodeType = paramInteger1;
    this.nodeName = paramString;
    this.backendNodeId = paramInteger2;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\dom\BackendNode.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */