package net.portswigger.devtools.protocol.events.dom;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zl;
import net.portswigger.devtools.protocol.Zy;
import net.portswigger.devtools.protocol.types.dom.Node;

@Zy
@Zsi("net.portswigger.devtools.protocol.events.dom.PseudoElementAdded")
public class PseudoElementAdded implements Zl {
  @Zvd(Zp = "parentId")
  public final Integer parentId;
  
  @Zvd(Zp = "pseudoElement")
  public final Node pseudoElement;
  
  @Zox
  public PseudoElementAdded(@Zc5(Ze = "parentId") Integer paramInteger, @Zc5(Ze = "pseudoElement") Node paramNode) {
    this.parentId = paramInteger;
    this.pseudoElement = paramNode;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\events\dom\PseudoElementAdded.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */