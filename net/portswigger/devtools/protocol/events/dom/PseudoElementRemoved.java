package net.portswigger.devtools.protocol.events.dom;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zl;
import net.portswigger.devtools.protocol.Zy;

@Zy
@Zsi("net.portswigger.devtools.protocol.events.dom.PseudoElementRemoved")
public class PseudoElementRemoved implements Zl {
  @Zvd(Zp = "parentId")
  public final Integer parentId;
  
  @Zvd(Zp = "pseudoElementId")
  public final Integer pseudoElementId;
  
  @Zox
  public PseudoElementRemoved(@Zc5(Ze = "parentId") Integer paramInteger1, @Zc5(Ze = "pseudoElementId") Integer paramInteger2) {
    this.parentId = paramInteger1;
    this.pseudoElementId = paramInteger2;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\events\dom\PseudoElementRemoved.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */