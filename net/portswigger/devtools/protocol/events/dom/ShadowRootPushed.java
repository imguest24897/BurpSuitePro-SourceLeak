package net.portswigger.devtools.protocol.events.dom;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zl;
import net.portswigger.devtools.protocol.Zy;
import net.portswigger.devtools.protocol.types.dom.Node;

@Zy
@Zsi("net.portswigger.devtools.protocol.events.dom.ShadowRootPushed")
public class ShadowRootPushed implements Zl {
  @Zvd(Zp = "hostId")
  public final Integer hostId;
  
  @Zvd(Zp = "root")
  public final Node root;
  
  @Zox
  public ShadowRootPushed(@Zc5(Ze = "hostId") Integer paramInteger, @Zc5(Ze = "root") Node paramNode) {
    this.hostId = paramInteger;
    this.root = paramNode;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\events\dom\ShadowRootPushed.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */