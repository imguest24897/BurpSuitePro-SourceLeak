package net.portswigger.devtools.protocol.types.accessibility;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;

@Zsi("net.portswigger.devtools.protocol.types.accessibility.AXRelatedNode")
public class AXRelatedNode {
  @Zvd(Zp = "backendDOMNodeId")
  public final Integer backendDOMNodeId;
  
  @Zvd(Zp = "idref")
  @Zj
  public final String idref;
  
  @Zvd(Zp = "text")
  @Zj
  public final String text;
  
  @Zox
  public AXRelatedNode(@Zc5(Ze = "backendDOMNodeId") Integer paramInteger, @Zc5(Ze = "idref", ZS = "null") String paramString1, @Zc5(Ze = "text", ZS = "null") String paramString2) {
    this.backendDOMNodeId = paramInteger;
    this.idref = paramString1;
    this.text = paramString2;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\accessibility\AXRelatedNode.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */