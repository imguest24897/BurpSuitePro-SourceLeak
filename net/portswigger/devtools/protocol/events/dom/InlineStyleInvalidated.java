package net.portswigger.devtools.protocol.events.dom;

import java.util.List;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zl;
import net.portswigger.devtools.protocol.Zy;

@Zy
@Zsi("net.portswigger.devtools.protocol.events.dom.InlineStyleInvalidated")
public class InlineStyleInvalidated implements Zl {
  @Zvd(Zp = "nodeIds")
  public final List<Integer> nodeIds;
  
  @Zox
  public InlineStyleInvalidated(@Zc5(Ze = "nodeIds") List<Integer> paramList) {
    this.nodeIds = paramList;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\events\dom\InlineStyleInvalidated.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */